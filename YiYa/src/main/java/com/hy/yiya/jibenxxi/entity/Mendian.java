package com.hy.yiya.jibenxxi.entity;

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
public class Mendian extends Model<Mendian> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 图片
     */
    private String img;

    /**
     * 门店名称
     */
    private String name;

    /**
     * 经理
     */
    private String manager;

    /**
     * 营业时间
     */
    private String opening;

    private String phone;

    private String email;

    private String address;

    private Integer caigou;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getCaigou() {
        return caigou;
    }

    public void setCaigou(Integer caigou) {
        this.caigou = caigou;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Mendian{" +
        "id=" + id +
        ", img=" + img +
        ", name=" + name +
        ", manager=" + manager +
        ", opening=" + opening +
        ", phone=" + phone +
        ", email=" + email +
        ", address=" + address +
        ", caigou=" + caigou +
        "}";
    }
}
