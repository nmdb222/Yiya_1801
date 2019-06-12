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
public class Dayinji extends Model<Dayinji> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String yontu;

    private String ip;

    private String duanko;

    private String dayin;

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
    public String getYontu() {
        return yontu;
    }

    public void setYontu(String yontu) {
        this.yontu = yontu;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getDuanko() {
        return duanko;
    }

    public void setDuanko(String duanko) {
        this.duanko = duanko;
    }
    public String getDayin() {
        return dayin;
    }

    public void setDayin(String dayin) {
        this.dayin = dayin;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dayinji{" +
        "id=" + id +
        ", name=" + name +
        ", yontu=" + yontu +
        ", ip=" + ip +
        ", duanko=" + duanko +
        ", dayin=" + dayin +
        "}";
    }
}
