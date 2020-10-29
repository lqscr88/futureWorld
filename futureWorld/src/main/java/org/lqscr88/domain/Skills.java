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
@TableName("t_skills")
public class Skills extends Model<Skills> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String grade;
    private String type;
    /**
     * 创始人
     */
    private String founder;
    /**
     * 作用
     */
    private String effect;
    /**
     * 施法距离
     */
    @TableField("casting_distance")
    private String castingDistance;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getCastingDistance() {
        return castingDistance;
    }

    public void setCastingDistance(String castingDistance) {
        this.castingDistance = castingDistance;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Skills{" +
        ", id=" + id +
        ", name=" + name +
        ", grade=" + grade +
        ", type=" + type +
        ", founder=" + founder +
        ", effect=" + effect +
        ", castingDistance=" + castingDistance +
        "}";
    }
}
