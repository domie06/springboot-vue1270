package com.entity.model;

import com.entity.ShebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 设备
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShebeiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 设备名称
     */
    private String shebeiName;


    /**
     * 设备编号
     */
    private String shebeiUuidNumber;


    /**
     * 设备照片
     */
    private String shebeiPhoto;


    /**
     * 生产厂家
     */
    private String shengchanchangjia;


    /**
     * 设备类型
     */
    private Integer shebeiTypes;


    /**
     * 设备功效
     */
    private String shebeiGongxiaoContent;


    /**
     * 设备禁忌
     */
    private String shebeiJinjiContent;


    /**
     * 注意事项
     */
    private String shebeiZhuyiContent;


    /**
     * 设备详情
     */
    private String shebeiContent;


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
