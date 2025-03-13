package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KeshiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 科室
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("keshi")
public class KeshiView extends KeshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 科室类型的值
	*/
	@ColumnInfo(comment="科室类型的字典表值",type="varchar(200)")
	private String keshiValue;




	public KeshiView() {

	}

	public KeshiView(KeshiEntity keshiEntity) {
		try {
			BeanUtils.copyProperties(this, keshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 科室类型的值
	*/
	public String getKeshiValue() {
		return keshiValue;
	}
	/**
	* 设置： 科室类型的值
	*/
	public void setKeshiValue(String keshiValue) {
		this.keshiValue = keshiValue;
	}




	@Override
	public String toString() {
		return "KeshiView{" +
			", keshiValue=" + keshiValue +
			"} " + super.toString();
	}
}
