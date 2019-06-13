package com.hy.yiya.financeMG.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.ibatis.annotations.Select;

@TableName(value = "JiaoJie")
public class JiaoJie {

    private int id;
    private int money;
    private String jiaojie;
    private String jieshou;
    private String jiaojietime;
    private String test;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }
    public String getJiaojie() { return jiaojie; }
    public void setJiaojie(String jiaojie) { this.jiaojie = jiaojie; }
    public String getJieshou() { return jieshou; }
    public void setJieshou(String jieshou) { this.jieshou = jieshou; }
    public String getJiaojietime() { return jiaojietime; }
    public void setJiaojietime(String jiaojietime) { this.jiaojietime = jiaojietime; }
    public String getTest() { return test; }
    public void setTest(String test) { this.test = test; }
}
