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
public class Yuding extends Model<Yuding> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bianhao;

    private String name;

    private Integer number;

    private String phone;

    private String time;

    /**
     * 预定时间
     */
    private String yuding;

    private Integer now;

    /**
     * 备注
     */
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getYuding() {
        return yuding;
    }

    public void setYuding(String yuding) {
        this.yuding = yuding;
    }
    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
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
        return "Yuding{" +
        "id=" + id +
        ", bianhao=" + bianhao +
        ", name=" + name +
        ", number=" + number +
        ", phone=" + phone +
        ", time=" + time +
        ", yuding=" + yuding +
        ", now=" + now +
        ", test=" + test +
        "}";
    }
}
