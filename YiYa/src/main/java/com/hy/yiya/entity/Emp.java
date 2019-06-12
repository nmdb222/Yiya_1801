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
public class Emp extends Model<Emp> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String company;

    private String bumeng;

    private String username;

    private String password;

    private String name;

    private Integer age;

    private String sex;

    private Integer mendianid;

    private String phone;

    /**
     * 身份证
     */
    private String idcard;

    private String address;

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
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public String getBumeng() {
        return bumeng;
    }

    public void setBumeng(String bumeng) {
        this.bumeng = bumeng;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getMendianid() {
        return mendianid;
    }

    public void setMendianid(Integer mendianid) {
        this.mendianid = mendianid;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Emp{" +
        "id=" + id +
        ", company=" + company +
        ", bumeng=" + bumeng +
        ", username=" + username +
        ", password=" + password +
        ", name=" + name +
        ", age=" + age +
        ", sex=" + sex +
        ", mendianid=" + mendianid +
        ", phone=" + phone +
        ", idcard=" + idcard +
        ", address=" + address +
        ", test=" + test +
        "}";
    }
}
