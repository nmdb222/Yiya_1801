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
public class Jiaojie extends Model<Jiaojie> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer money;

    private String jiaojie;

    private String jieshou;

    private String jiaojietime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    public String getJiaojie() {
        return jiaojie;
    }

    public void setJiaojie(String jiaojie) {
        this.jiaojie = jiaojie;
    }
    public String getJieshou() {
        return jieshou;
    }

    public void setJieshou(String jieshou) {
        this.jieshou = jieshou;
    }
    public String getJiaojietime() {
        return jiaojietime;
    }

    public void setJiaojietime(String jiaojietime) {
        this.jiaojietime = jiaojietime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Jiaojie{" +
        "id=" + id +
        ", money=" + money +
        ", jiaojie=" + jiaojie +
        ", jieshou=" + jieshou +
        ", jiaojietime=" + jiaojietime +
        "}";
    }
}
