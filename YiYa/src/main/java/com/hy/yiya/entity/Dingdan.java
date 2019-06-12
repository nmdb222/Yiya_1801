package com.hy.yiya.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxx
 * @since 2019-06-12
 */
public class Dingdan extends Model<Dingdan> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bianhao;

    /**
     * 关联桌台id  显示桌台name
     */
    private Integer zhuotaiid;

    private String name;

    private String caipingname;

    private Integer money;

    private Integer youhui;

    private String xiadantime;

    private Integer type;

    private String test;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }
    public Integer getZhuotaiid() {
        return zhuotaiid;
    }

    public void setZhuotaiid(Integer zhuotaiid) {
        this.zhuotaiid = zhuotaiid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCaipingname() {
        return caipingname;
    }

    public void setCaipingname(String caipingname) {
        this.caipingname = caipingname;
    }
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    public Integer getYouhui() {
        return youhui;
    }

    public void setYouhui(Integer youhui) {
        this.youhui = youhui;
    }
    public String getXiadantime() {
        return xiadantime;
    }

    public void setXiadantime(String xiadantime) {
        this.xiadantime = xiadantime;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dingdan{" +
        "id=" + id +
        ", bianhao=" + bianhao +
        ", zhuotaiid=" + zhuotaiid +
        ", name=" + name +
        ", caipingname=" + caipingname +
        ", money=" + money +
        ", youhui=" + youhui +
        ", xiadantime=" + xiadantime +
        ", type=" + type +
        ", test=" + test +
        "}";
    }
}
