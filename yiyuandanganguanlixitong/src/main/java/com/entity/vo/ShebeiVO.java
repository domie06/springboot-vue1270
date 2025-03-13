package com.entity.vo;

import com.entity.ShebeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 设备
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shebei")
public class ShebeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 设备名称
     */

    @TableField(value = "shebei_name")
    private String shebeiName;


    /**
     * 设备编号
     */

    @TableField(value = "shebei_uuid_number")
    private String shebeiUuidNumber;


    /**
     * 设备照片
     */

    @TableField(value = "shebei_photo")
    private String shebeiPhoto;


    /**
     * 生产厂家
     */

    @TableField(value = "shengchanchangjia")
    private String shengchanchangjia;


    /**
     * 设备类型
     */

    @TableField(value = "shebei_types")
    private Integer shebeiTypes;


    /**
     * 设备功效
     */

    @TableField(value = "shebei_gongxiao_content")
    private String shebeiGongxiaoContent;


    /**
     * 设备禁忌
     */

    @TableField(value = "shebei_jinji_content")
    private String shebeiJinjiContent;


    /**
     * 注意事项
     */

    @TableField(value = "shebei_zhuyi_content")
    private String shebeiZhuyiContent;


    /**
     * 设备详情
     */

    @TableField(value = "shebei_content")
    private String shebeiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：设备名称
	 */
    public String getShebeiName() {
        return shebeiName;
    }


    /**
	 * 获取：设备名称
	 */

    public void setShebeiName(String shebeiName) {
        this.shebeiName = shebeiName;
    }
    /**
	 * 设置：设备编号
	 */
    public String getShebeiUuidNumber() {
        return shebeiUuidNumber;
    }


    /**
	 * 获取：设备编号
	 */

    public void setShebeiUuidNumber(String shebeiUuidNumber) {
        this.shebeiUuidNumber = shebeiUuidNumber;
    }
    /**
	 * 设置：设备照片
	 */
    public String getShebeiPhoto() {
        return shebeiPhoto;
    }


    /**
	 * 获取：设备照片
	 */

    public void setShebeiPhoto(String shebeiPhoto) {
        this.shebeiPhoto = shebeiPhoto;
    }
    /**
	 * 设置：生产厂家
	 */
    public String getShengchanchangjia() {
        return shengchanchangjia;
    }


    /**
	 * 获取：生产厂家
	 */

    public void setShengchanchangjia(String shengchanchangjia) {
        this.shengchanchangjia = shengchanchangjia;
    }
    /**
	 * 设置：设备类型
	 */
    public Integer getShebeiTypes() {
        return shebeiTypes;
    }


    /**
	 * 获取：设备类型
	 */

    public void setShebeiTypes(Integer shebeiTypes) {
        this.shebeiTypes = shebeiTypes;
    }
    /**
	 * 设置：设备功效
	 */
    public String getShebeiGongxiaoContent() {
        return shebeiGongxiaoContent;
    }


    /**
	 * 获取：设备功效
	 */

    public void setShebeiGongxiaoContent(String shebeiGongxiaoContent) {
        this.shebeiGongxiaoContent = shebeiGongxiaoContent;
    }
    /**
	 * 设置：设备禁忌
	 */
    public String getShebeiJinjiContent() {
        return shebeiJinjiContent;
    }


    /**
	 * 获取：设备禁忌
	 */

    public void setShebeiJinjiContent(String shebeiJinjiContent) {
        this.shebeiJinjiContent = shebeiJinjiContent;
    }
    /**
	 * 设置：注意事项
	 */
    public String getShebeiZhuyiContent() {
        return shebeiZhuyiContent;
    }


    /**
	 * 获取：注意事项
	 */

    public void setShebeiZhuyiContent(String shebeiZhuyiContent) {
        this.shebeiZhuyiContent = shebeiZhuyiContent;
    }
    /**
	 * 设置：设备详情
	 */
    public String getShebeiContent() {
        return shebeiContent;
    }


    /**
	 * 获取：设备详情
	 */

    public void setShebeiContent(String shebeiContent) {
        this.shebeiContent = shebeiContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
