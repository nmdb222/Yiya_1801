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
public class Caigou extends Model<Caigou> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bianhao;

    private String time;

    /**
     * 根据·库存·id得到·材料·name
     */
    private Integer cailiao;

    /**
     * 材料种类
     */
    private Integer type;

    private Integer number;

    private Integer price;

    private Integer danwei;

    private Integer money;

    private Integer caigoutype;

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
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public Integer getCailiao() {
        return cailiao;
    }

    public void setCailiao(Integer cailiao) {
        this.cailiao = cailiao;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getDanwei() {
        return danwei;
    }

    public void setDanwei(Integer danwei) {
        this.danwei = danwei;
    }
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    public Integer getCaigoutype() {
        return caigoutype;
    }

    public void setCaigoutype(Integer caigoutype) {
        this.caigoutype = caigoutype;
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
        return "Caigou{" +
        "id=" + id +
        ", bianhao=" + bianhao +
        ", time=" + time +
        ", cailiao=" + cailiao +
        ", type=" + type +
        ", number=" + number +
        ", price=" + price +
        ", danwei=" + danwei +
        ", money=" + money +
        ", caigoutype=" + caigoutype +
        ", test=" + test +
        "}";
    }
}
