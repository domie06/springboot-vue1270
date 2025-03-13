package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 科室
 *
 * @author 
 * @email
 */
@TableName("keshi")
public class KeshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeshiEntity() {

	}

	public KeshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 科室名称
     */
    @ColumnInfo(comment="科室名称",type="varchar(200)")
    @TableField(value = "keshi_name")

    private String keshiName;


    /**
     * 科室编号
     */
    @ColumnInfo(comment="科室编号",type="varchar(200)")
    @TableField(value = "keshi_uuid_number")

    private String keshiUuidNumber;


    /**
     * 科室照片
     */
    @ColumnInfo(comment="科室照片",type="varchar(200)")
    @TableField(value = "keshi_photo")

    private String keshiPhoto;


    /**
     * 生产厂家
     */
    @ColumnInfo(comment="生产厂家",type="varchar(200)")
    @TableField(value = "shengchanchangjia")

    private String shengchanchangjia;


    /**
     * 科室类型
     */
    @ColumnInfo(comment="科室类型",type="int(11)")
    @TableField(value = "keshi_types")

    private Integer keshiTypes;


    /**
     * 科室功效
     */
    @ColumnInfo(comment="科室功效",type="text")
    @TableField(value = "keshi_gongxiao_content")

    private String keshiGongxiaoContent;


    /**
     * 科室禁忌
     */
    @ColumnInfo(comment="科室禁忌",type="text")
    @TableField(value = "keshi_jinji_content")

    private String keshiJinjiContent;


    /**
     * 注意事项
     */
    @ColumnInfo(comment="注意事项",type="text")
    @TableField(value = "keshi_zhuyi_content")

    private String keshiZhuyiContent;


    /**
     * 科室详情
     */
    @ColumnInfo(comment="科室详情",type="text")
    @TableField(value = "keshi_content")

    private String keshiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Keshi{" +
            ", id=" + id +
            ", keshiName=" + keshiName +
            ", keshiUuidNumber=" + keshiUuidNumber +
            ", keshiPhoto=" + keshiPhoto +
            ", shengchanchangjia=" + shengchanchangjia +
            ", keshiTypes=" + keshiTypes +
            ", keshiGongxiaoContent=" + keshiGongxiaoContent +
            ", keshiJinjiContent=" + keshiJinjiContent +
            ", keshiZhuyiContent=" + keshiZhuyiContent +
            ", keshiContent=" + keshiContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
