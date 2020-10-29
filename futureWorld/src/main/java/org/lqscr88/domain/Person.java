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
@TableName("t_person")
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 等级
     */
    private String grade;
    /**
     * 血脉
     */
    @TableField("blood_lineage")
    private String bloodLineage;
    /**
     * 属性
     */
    private String attribute;
    /**
     * 功法
     */
    private String skills;
    /**
     * 武器
     */
    private String arms;
    /**
     * 宝物
     */
    private String treasure;
    /**
     * 坐骑
     */
    private String mount;
    /**
     * 家族
     */
    private String family;
    /**
     * 师傅
     */
    @TableField("master_worker")
    private String masterWorker;
    /**
     * 坐标
     */
    private String coordinate;
    /**
     * 女伴
     */
    private String spouse;
    /**
     * 父亲
     */
    private String father;
    /**
     * 母亲
     */
    private String mom;
    /**
     * 气运
     */
    @TableField("air_transport")
    private String airTransport;
    /**
     * 职业
     */
    private String occupation;
    /**
     * 升级能量
     */
    @TableField("upgrade_energy")
    private String upgradeEnergy;
    /**
     * 灵兽伙伴
     */
    private String partner;
    /**
     * 朋友
     */
    private String friend;
    /**
     * 结拜兄弟
     */
    @TableField("sworn_brother")
    private String swornBrother;
    /**
     * 宗门
     */
    private String sect;
    /**
     * 身高
     */
    private String height;
    /**
     * 手长
     */
    @TableField("hand_length")
    private String handLength;
    /**
     * 腿长
     */
    @TableField("leg_length")
    private String legLength;


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

    public String getBloodLineage() {
        return bloodLineage;
    }

    public void setBloodLineage(String bloodLineage) {
        this.bloodLineage = bloodLineage;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMasterWorker() {
        return masterWorker;
    }

    public void setMasterWorker(String masterWorker) {
        this.masterWorker = masterWorker;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }

    public String getAirTransport() {
        return airTransport;
    }

    public void setAirTransport(String airTransport) {
        this.airTransport = airTransport;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getUpgradeEnergy() {
        return upgradeEnergy;
    }

    public void setUpgradeEnergy(String upgradeEnergy) {
        this.upgradeEnergy = upgradeEnergy;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getSwornBrother() {
        return swornBrother;
    }

    public void setSwornBrother(String swornBrother) {
        this.swornBrother = swornBrother;
    }

    public String getSect() {
        return sect;
    }

    public void setSect(String sect) {
        this.sect = sect;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHandLength() {
        return handLength;
    }

    public void setHandLength(String handLength) {
        this.handLength = handLength;
    }

    public String getLegLength() {
        return legLength;
    }

    public void setLegLength(String legLength) {
        this.legLength = legLength;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Person{" +
        ", id=" + id +
        ", name=" + name +
        ", grade=" + grade +
        ", bloodLineage=" + bloodLineage +
        ", attribute=" + attribute +
        ", skills=" + skills +
        ", arms=" + arms +
        ", treasure=" + treasure +
        ", mount=" + mount +
        ", family=" + family +
        ", masterWorker=" + masterWorker +
        ", coordinate=" + coordinate +
        ", spouse=" + spouse +
        ", father=" + father +
        ", mom=" + mom +
        ", airTransport=" + airTransport +
        ", occupation=" + occupation +
        ", upgradeEnergy=" + upgradeEnergy +
        ", partner=" + partner +
        ", friend=" + friend +
        ", swornBrother=" + swornBrother +
        ", sect=" + sect +
        ", height=" + height +
        ", handLength=" + handLength +
        ", legLength=" + legLength +
        "}";
    }
}
