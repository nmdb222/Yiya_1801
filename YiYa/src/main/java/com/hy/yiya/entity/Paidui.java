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
public class Paidui extends Model<Paidui> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer cfnumber;

    private Integer zhuotaisize;

    private Integer zhuotaitype;

    private String time;

    /**
     * 等待状态
     */
    private String now;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getCfnumber() {
        return cfnumber;
    }

    public void setCfnumber(Integer cfnumber) {
        this.cfnumber = cfnumber;
    }
    public Integer getZhuotaisize() {
        return zhuotaisize;
    }

    public void setZhuotaisize(Integer zhuotaisize) {
        this.zhuotaisize = zhuotaisize;
    }
    public Integer getZhuotaitype() {
        return zhuotaitype;
    }

    public void setZhuotaitype(Integer zhuotaitype) {
        this.zhuotaitype = zhuotaitype;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getNow() {
        return now;
    }

    public void setNow(String now) {
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
        return "Paidui{" +
        "id=" + id +
        ", name=" + name +
        ", cfnumber=" + cfnumber +
        ", zhuotaisize=" + zhuotaisize +
        ", zhuotaitype=" + zhuotaitype +
        ", time=" + time +
        ", now=" + now +
        ", test=" + test +
        "}";
    }
}
