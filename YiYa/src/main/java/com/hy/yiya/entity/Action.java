package com.hy.yiya.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author zxx
 * @since 2019-06-12
 */
public class Action extends Model<Action> {

    private static final long serialVersionUID = 1L;

    private Integer actionid;

    private String actionname;

    private String action;

    private Integer actioncolumnid;

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }
    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname;
    }
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public Integer getActioncolumnid() {
        return actioncolumnid;
    }

    public void setActioncolumnid(Integer actioncolumnid) {
        this.actioncolumnid = actioncolumnid;
    }

    @Override
    protected Serializable pkVal() {
        return this.actionid;
    }

    @Override
    public String toString() {
        return "Action{" +
        "actionid=" + actionid +
        ", actionname=" + actionname +
        ", action=" + action +
        ", actioncolumnid=" + actioncolumnid +
        "}";
    }
}
