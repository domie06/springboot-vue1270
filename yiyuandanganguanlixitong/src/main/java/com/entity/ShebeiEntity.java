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
 * 设备
 *
 * @author 
 * @email
 */
@TableName("shebei")
public class ShebeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShebeiEntity() {

	}

	public ShebeiEntity(T t) {
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
     * 设备名称
     */
    @ColumnInfo(comment="设备名称",type="varchar(200)")
    @TableField(value = "shebei_name")

    private String shebeiName;


    /**
     * 设备编号
     */
    @ColumnInfo(comment="设备编号",type="varchar(200)")
    @TableField(value = "shebei_uuid_number")

    private String shebeiUuidNumber;


    /**
     * 设备照片
     */
    @ColumnInfo(comment="设备照片",type="varchar(200)")
    @TableField(value = "shebei_photo")

    private String shebeiPhoto;


    /**
     * 生产厂家
     */
    @ColumnInfo(comment="生产厂家",type="varchar(200)")
    @TableField(value = "shengchanchangjia")

    private String shengchanchangjia;


    /**
     * 设备类型
     */
    @ColumnInfo(comment="设备类型",type="int(11)")
    @TableField(value = "shebei_types")

    private Integer shebeiTypes;


    /**
     * 设备功效
     */
    @ColumnInfo(comment="设备功效",type="text")
    @TableField(value = "shebei_gongxiao_content")

    private String shebeiGongxiaoContent;


    /**
     * 设备禁忌
     */
    @ColumnInfo(comment="设备禁忌",type="text")
    @TableField(value = "shebei_jinji_content")

    private String shebeiJinjiContent;


    /**
     * 注意事项
     */
    @ColumnInfo(comment="注意事项",type="text")
    @TableField(value = "shebei_zhuyi_content")

    private String shebeiZhuyiContent;


    /**
     * 设备详情
     */
    @ColumnInfo(comment="设备详情",type="text")
    @TableField(value = "shebei_content")

    private String shebeiContent;


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
	 * 获取：设备名称
	 */
    public String getShebeiName() {
        return shebeiName;
    }
    /**
	 * 设置：设备名称
	 */

    public void setShebeiName(String shebeiName) {
        this.shebeiName = shebeiName;
    }
    /**
	 * 获取：设备编号
	 */
    public String getShebeiUuidNumber() {
        return shebeiUuidNumber;
    }
    /**
	 * 设置：设备编号
	 */

    public void setShebeiUuidNumber(String shebeiUuidNumber) {
        this.shebeiUuidNumber = shebeiUuidNumber;
    }
    /**
	 * 获取：设备照片
	 */
    public String getShebeiPhoto() {
        return shebeiPhoto;
    }
    /**
	 * 设置：设备照片
	 */

    public void setShebeiPhoto(String shebeiPhoto) {
        this.shebeiPhoto = shebeiPhoto;
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
	 * 获取：设备类型
	 */
    public Integer getShebeiTypes() {
        return shebeiTypes;
    }
    /**
	 * 设置：设备类型
	 */

    public void setShebeiTypes(Integer shebeiTypes) {
        this.shebeiTypes = shebeiTypes;
    }
    /**
	 * 获取：设备功效
	 */
    public String getShebeiGongxiaoContent() {
        return shebeiGongxiaoContent;
    }
    /**
	 * 设置：设备功效
	 */

    public void setShebeiGongxiaoContent(String shebeiGongxiaoContent) {
        this.shebeiGongxiaoContent = shebeiGongxiaoContent;
    }
    /**
	 * 获取：设备禁忌
	 */
    public String getShebeiJinjiContent() {
        return shebeiJinjiContent;
    }
    /**
	 * 设置：设备禁忌
	 */

    public void setShebeiJinjiContent(String shebeiJinjiContent) {
        this.shebeiJinjiContent = shebeiJinjiContent;
    }
    /**
	 * 获取：注意事项
	 */
    public String getShebeiZhuyiContent() {
        return shebeiZhuyiContent;
    }
    /**
	 * 设置：注意事项
	 */

    public void setShebeiZhuyiContent(String shebeiZhuyiContent) {
        this.shebeiZhuyiContent = shebeiZhuyiContent;
    }
    /**
	 * 获取：设备详情
	 */
    public String getShebeiContent() {
        return shebeiContent;
    }
    /**
	 * 设置：设备详情
	 */

    public void setShebeiContent(String shebeiContent) {
        this.shebeiContent = shebeiContent;
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
        return "Shebei{" +
            ", id=" + id +
            ", shebeiName=" + shebeiName +
            ", shebeiUuidNumber=" + shebeiUuidNumber +
            ", shebeiPhoto=" + shebeiPhoto +
            ", shengchanchangjia=" + shengchanchangjia +
            ", shebeiTypes=" + shebeiTypes +
            ", shebeiGongxiaoContent=" + shebeiGongxiaoContent +
            ", shebeiJinjiContent=" + shebeiJinjiContent +
            ", shebeiZhuyiContent=" + shebeiZhuyiContent +
            ", shebeiContent=" + shebeiContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
