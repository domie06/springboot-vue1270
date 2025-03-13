package com.dao;

import com.entity.KeshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshiView;

/**
 * 科室 Dao 接口
 *
 * @author 
 */
public interface KeshiDao extends BaseMapper<KeshiEntity> {

   List<KeshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
