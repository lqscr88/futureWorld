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
@TableName("t_family")
public class Family extends Model<Family> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    @TableField("blood_lineage")
    private String bloodLineage;
    /**
     * 总人数
     */
    private String Total;
    /**
     * 建筑
     */
    private String architecture;
    /**
     * 宗门
     */
    private String sect;


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

    public String getBloodLineage() {
        return bloodLineage;
    }

    public void setBloodLineage(String bloodLineage) {
        this.bloodLineage = bloodLineage;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getSect() {
        return sect;
    }

    public void setSect(String sect) {
        this.sect = sect;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Family{" +
        ", id=" + id +
        ", name=" + name +
        ", bloodLineage=" + bloodLineage +
        ", Total=" + Total +
        ", architecture=" + architecture +
        ", sect=" + sect +
        "}";
    }
}
