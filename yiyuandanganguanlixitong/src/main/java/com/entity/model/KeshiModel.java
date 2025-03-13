package com.entity.model;

import com.entity.KeshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 科室
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KeshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 科室名称
     */
    private String keshiName;


    /**
     * 科室编号
     */
    private String keshiUuidNumber;


    /**
     * 科室照片
     */
    private String keshiPhoto;


    /**
     * 生产厂家
     */
    private String shengchanchangjia;


    /**
     * 科室类型
     */
    private Integer keshiTypes;


    /**
     * 科室功效
     */
    private String keshiGongxiaoContent;


    /**
     * 科室禁忌
     */
    private String keshiJinjiContent;


    /**
     * 注意事项
     */
    private String keshiZhuyiContent;


    /**
     * 科室详情
     */
    private String keshiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：科室名称
	 */
    public String getKeshiName() {
        return keshiName;
    }


    /**
	 * 设置：科室名称
	 */
    public void setKeshiName(String keshiName) {
        this.keshiName = keshiName;
    }
    /**
	 * 获取：科室编号
	 */
    public String getKeshiUuidNumber() {
        return keshiUuidNumber;
    }


    /**
	 * 设置：科室编号
	 */
    public void setKeshiUuidNumber(String keshiUuidNumber) {
        this.keshiUuidNumber = keshiUuidNumber;
    }
    /**
	 * 获取：科室照片
	 */
    public String getKeshiPhoto() {
        return keshiPhoto;
    }


    /**
	 * 设置：科室照片
	 */
    public void setKeshiPhoto(String keshiPhoto) {
        this.keshiPhoto = keshiPhoto;
    }
    /**
	 * 获取：生产厂家
	 */
    public String getShengchanchangjia() {
        return shengchanchangjia;
    }


    /**
	 * 设置：生产厂家
	 */
    public void setShengchanchangjia(String shengchanchangjia) {
        this.shengchanchangjia = shengchanchangjia;
    }
    /**
	 * 获取：科室类型
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }


    /**
	 * 设置：科室类型
	 */
    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 获取：科室功效
	 */
    public String getKeshiGongxiaoContent() {
        return keshiGongxiaoContent;
    }


    /**
	 * 设置：科室功效
	 */
    public void setKeshiGongxiaoContent(String keshiGongxiaoContent) {
        this.keshiGongxiaoContent = keshiGongxiaoContent;
    }
    /**
	 * 获取：科室禁忌
	 */
    public String getKeshiJinjiContent() {
        return keshiJinjiContent;
    }


    /**
	 * 设置：科室禁忌
	 */
    public void setKeshiJinjiContent(String keshiJinjiContent) {
        this.keshiJinjiContent = keshiJinjiContent;
    }
    /**
	 * 获取：注意事项
	 */
    public String getKeshiZhuyiContent() {
        return keshiZhuyiContent;
    }


    /**
	 * 设置：注意事项
	 */
    public void setKeshiZhuyiContent(String keshiZhuyiContent) {
        this.keshiZhuyiContent = keshiZhuyiContent;
    }
    /**
	 * 获取：科室详情
	 */
    public String getKeshiContent() {
        return keshiContent;
    }


    /**
	 * 设置：科室详情
	 */
    public void setKeshiContent(String keshiContent) {
        this.keshiContent = keshiContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
