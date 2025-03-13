
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 科室
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/keshi")
public class KeshiController {
    private static final Logger logger = LoggerFactory.getLogger(KeshiController.class);

    private static final String TABLE_NAME = "keshi";

    @Autowired
    private KeshiService keshiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private BingliService bingliService;//档案
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private ShebeiService shebeiService;//设备
    @Autowired
    private YaopinService yaopinService;//药品
    @Autowired
    private YishengService yishengService;//医护
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("医护".equals(role))
            params.put("yishengId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = keshiService.queryPage(params);

        //字典表数据转换
        List<KeshiView> list =(List<KeshiView>)page.getList();
        for(KeshiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KeshiEntity keshi = keshiService.selectById(id);
        if(keshi !=null){
            //entity转view
            KeshiView view = new KeshiView();
            BeanUtils.copyProperties( keshi , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody KeshiEntity keshi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,keshi:{}",this.getClass().getName(),keshi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<KeshiEntity> queryWrapper = new EntityWrapper<KeshiEntity>()
            .eq("keshi_name", keshi.getKeshiName())
            .eq("shengchanchangjia", keshi.getShengchanchangjia())
            .eq("keshi_types", keshi.getKeshiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeshiEntity keshiEntity = keshiService.selectOne(queryWrapper);
        if(keshiEntity==null){
            keshi.setInsertTime(new Date());
            keshi.setCreateTime(new Date());
            keshiService.insert(keshi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KeshiEntity keshi, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,keshi:{}",this.getClass().getName(),keshi.toString());
        KeshiEntity oldKeshiEntity = keshiService.selectById(keshi.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(keshi.getKeshiPhoto()) || "null".equals(keshi.getKeshiPhoto())){
                keshi.setKeshiPhoto(null);
        }

            keshiService.updateById(keshi);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<KeshiEntity> oldKeshiList =keshiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        keshiService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<KeshiEntity> keshiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            KeshiEntity keshiEntity = new KeshiEntity();
//                            keshiEntity.setKeshiName(data.get(0));                    //科室名称 要改的
//                            keshiEntity.setKeshiUuidNumber(data.get(0));                    //科室编号 要改的
//                            keshiEntity.setKeshiPhoto("");//详情和图片
//                            keshiEntity.setShengchanchangjia(data.get(0));                    //生产厂家 要改的
//                            keshiEntity.setKeshiTypes(Integer.valueOf(data.get(0)));   //科室类型 要改的
//                            keshiEntity.setKeshiGongxiaoContent("");//详情和图片
//                            keshiEntity.setKeshiJinjiContent("");//详情和图片
//                            keshiEntity.setKeshiZhuyiContent("");//详情和图片
//                            keshiEntity.setKeshiContent("");//详情和图片
//                            keshiEntity.setInsertTime(date);//时间
//                            keshiEntity.setCreateTime(date);//时间
                            keshiList.add(keshiEntity);


                            //把要查询是否重复的字段放入map中
                                //科室编号
                                if(seachFields.containsKey("keshiUuidNumber")){
                                    List<String> keshiUuidNumber = seachFields.get("keshiUuidNumber");
                                    keshiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> keshiUuidNumber = new ArrayList<>();
                                    keshiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("keshiUuidNumber",keshiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //科室编号
                        List<KeshiEntity> keshiEntities_keshiUuidNumber = keshiService.selectList(new EntityWrapper<KeshiEntity>().in("keshi_uuid_number", seachFields.get("keshiUuidNumber")));
                        if(keshiEntities_keshiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(KeshiEntity s:keshiEntities_keshiUuidNumber){
                                repeatFields.add(s.getKeshiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [科室编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        keshiService.insertBatch(keshiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = keshiService.queryPage(params);

        //字典表数据转换
        List<KeshiView> list =(List<KeshiView>)page.getList();
        for(KeshiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KeshiEntity keshi = keshiService.selectById(id);
            if(keshi !=null){


                //entity转view
                KeshiView view = new KeshiView();
                BeanUtils.copyProperties( keshi , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody KeshiEntity keshi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,keshi:{}",this.getClass().getName(),keshi.toString());
        Wrapper<KeshiEntity> queryWrapper = new EntityWrapper<KeshiEntity>()
            .eq("keshi_name", keshi.getKeshiName())
            .eq("keshi_uuid_number", keshi.getKeshiUuidNumber())
            .eq("shengchanchangjia", keshi.getShengchanchangjia())
            .eq("keshi_types", keshi.getKeshiTypes())
//            .notIn("keshi_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeshiEntity keshiEntity = keshiService.selectOne(queryWrapper);
        if(keshiEntity==null){
            keshi.setInsertTime(new Date());
            keshi.setCreateTime(new Date());
        keshiService.insert(keshi);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

