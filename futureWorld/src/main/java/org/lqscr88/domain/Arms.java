package org.lqscr88.domain;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lq
 * @since 2020-10-26
 */
@TableName("t_arms")
public class Arms extends Model<Arms> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String grade;
    /**
     * 属性
     */
    private String attribute;
    /**
     * 升级材料
     */
    @TableField("upgrade_materials")
    private String upgradeMaterials;
    /**
     * 类型
     */
    private String type;
    /**
     * 坐标
     */
    private String coordinate;
    /**
     * 打造人
     */
    @TableField("building_people")
    private String buildingPeople;
    /**
     * 分类
     */
    private String classification;
    /**
     * 长
     */
    private String width;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getUpgradeMaterials() {
        return upgradeMaterials;
    }

    public void setUpgradeMaterials(String upgradeMaterials) {
        this.upgradeMaterials = upgradeMaterials;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getBuildingPeople() {
        return buildingPeople;
    }

    public void setBuildingPeople(String buildingPeople) {
        this.buildingPeople = buildingPeople;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Arms{" +
        ", id=" + id +
        ", name=" + name +
        ", grade=" + grade +
        ", attribute=" + attribute +
        ", upgradeMaterials=" + upgradeMaterials +
        ", type=" + type +
        ", coordinate=" + coordinate +
        ", buildingPeople=" + buildingPeople +
        ", classification=" + classification +
        ", width=" + width +
        "}";
    }
}
