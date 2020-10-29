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
@TableName("t_coordinate")
public class Coordinate extends Model<Coordinate> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String grade;
    /**
     * 1坐标
     */
    @TableField("one_coordinate")
    private String oneCoordinate;
    /**
     * 2坐标
     */
    @TableField("two_coordinate")
    private String twoCoordinate;
    /**
     * 3坐标
     */
    @TableField("three_coordinate")
    private String threeCoordinate;
    /**
     * 4坐标
     */
    @TableField("four_coordinate")
    private String fourCoordinate;
    /**
     * 中心坐标
     */
    @TableField("center_coordinate")
    private String centerCoordinate;
    /**
     * 面积
     */
    private String area;
    /**
     * 父级
     */
    @TableField("parent_id")
    private Long parentId;
    private String type;
    /**
     * 建筑
     */
    private String architecture;
    /**
     * 规则
     */
    private String rule;


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

    public String getOneCoordinate() {
        return oneCoordinate;
    }

    public void setOneCoordinate(String oneCoordinate) {
        this.oneCoordinate = oneCoordinate;
    }

    public String getTwoCoordinate() {
        return twoCoordinate;
    }

    public void setTwoCoordinate(String twoCoordinate) {
        this.twoCoordinate = twoCoordinate;
    }

    public String getThreeCoordinate() {
        return threeCoordinate;
    }

    public void setThreeCoordinate(String threeCoordinate) {
        this.threeCoordinate = threeCoordinate;
    }

    public String getFourCoordinate() {
        return fourCoordinate;
    }

    public void setFourCoordinate(String fourCoordinate) {
        this.fourCoordinate = fourCoordinate;
    }

    public String getCenterCoordinate() {
        return centerCoordinate;
    }

    public void setCenterCoordinate(String centerCoordinate) {
        this.centerCoordinate = centerCoordinate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
        ", id=" + id +
        ", name=" + name +
        ", grade=" + grade +
        ", oneCoordinate=" + oneCoordinate +
        ", twoCoordinate=" + twoCoordinate +
        ", threeCoordinate=" + threeCoordinate +
        ", fourCoordinate=" + fourCoordinate +
        ", centerCoordinate=" + centerCoordinate +
        ", area=" + area +
        ", parentId=" + parentId +
        ", type=" + type +
        ", architecture=" + architecture +
        ", rule=" + rule +
        "}";
    }
}
