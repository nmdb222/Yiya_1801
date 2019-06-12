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
public class Actioncolumn extends Model<Actioncolumn> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "actioncolumnid", type = IdType.AUTO)
    private Integer actioncolumnid;

    /**
     * 动作分组说明
     */
    private String actioncolumnname;

    public Integer getActioncolumnid() {
        return actioncolumnid;
    }

    public void setActioncolumnid(Integer actioncolumnid) {
        this.actioncolumnid = actioncolumnid;
    }
    public String getActioncolumnname() {
        return actioncolumnname;
    }

    public void setActioncolumnname(String actioncolumnname) {
        this.actioncolumnname = actioncolumnname;
    }

    @Override
    protected Serializable pkVal() {
        return this.actioncolumnid;
    }

    @Override
    public String toString() {
        return "Actioncolumn{" +
        "actioncolumnid=" + actioncolumnid +
        ", actioncolumnname=" + actioncolumnname +
        "}";
    }
}
