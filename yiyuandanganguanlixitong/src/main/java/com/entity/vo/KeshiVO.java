package com.entity.vo;

import com.entity.KeshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 科室
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("keshi")
public class KeshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 科室名称
     */

    @TableField(value = "keshi_name")
    private String keshiName;


    /**
     * 科室编号
     */

    @TableField(value = "keshi_uuid_number")
    private String keshiUuidNumber;


    /**
     * 科室照片
     */

    @TableField(value = "keshi_photo")
    private String keshiPhoto;


    /**
     * 生产厂家
     */

    @TableField(value = "shengchanchangjia")
    private String shengchanchangjia;


    /**
     * 科室类型
     */

    @TableField(value = "keshi_types")
    private Integer keshiTypes;


    /**
     * 科室功效
     */

    @TableField(value = "keshi_gongxiao_content")
    private String keshiGongxiaoContent;


    /**
     * 科室禁忌
     */

    @TableField(value = "keshi_jinji_content")
    private String keshiJinjiContent;


    /**
     * 注意事项
     */

    @TableField(value = "keshi_zhuyi_content")
    private String keshiZhuyiContent;


    /**
     * 科室详情
     */

    @TableField(value = "keshi_content")
    private String keshiContent;


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
	 * 设置：科室名称
	 */
    public String getKeshiName() {
        return keshiName;
    }


    /**
	 * 获取：科室名称
	 */

    public void setKeshiName(String keshiName) {
        this.keshiName = keshiName;
    }
    /**
	 * 设置：科室编号
	 */
    public String getKeshiUuidNumber() {
        return keshiUuidNumber;
    }


    /**
	 * 获取：科室编号
	 */

    public void setKeshiUuidNumber(String keshiUuidNumber) {
        this.keshiUuidNumber = keshiUuidNumber;
    }
    /**
	 * 设置：科室照片
	 */
    public String getKeshiPhoto() {
        return keshiPhoto;
    }


    /**
	 * 获取：科室照片
	 */

    public void setKeshiPhoto(String keshiPhoto) {
        this.keshiPhoto = keshiPhoto;
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
	 * 设置：科室类型
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }


    /**
	 * 获取：科室类型
	 */

    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 设置：科室功效
	 */
    public String getKeshiGongxiaoContent() {
        return keshiGongxiaoContent;
    }


    /**
	 * 获取：科室功效
	 */

    public void setKeshiGongxiaoContent(String keshiGongxiaoContent) {
        this.keshiGongxiaoContent = keshiGongxiaoContent;
    }
    /**
	 * 设置：科室禁忌
	 */
    public String getKeshiJinjiContent() {
        return keshiJinjiContent;
    }


    /**
	 * 获取：科室禁忌
	 */

    public void setKeshiJinjiContent(String keshiJinjiContent) {
        this.keshiJinjiContent = keshiJinjiContent;
    }
    /**
	 * 设置：注意事项
	 */
    public String getKeshiZhuyiContent() {
        return keshiZhuyiContent;
    }


    /**
	 * 获取：注意事项
	 */

    public void setKeshiZhuyiContent(String keshiZhuyiContent) {
        this.keshiZhuyiContent = keshiZhuyiContent;
    }
    /**
	 * 设置：科室详情
	 */
    public String getKeshiContent() {
        return keshiContent;
    }


    /**
	 * 获取：科室详情
	 */

    public void setKeshiContent(String keshiContent) {
        this.keshiContent = keshiContent;
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
