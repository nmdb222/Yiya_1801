package com.hy.yiya.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class Groupmanager extends Model<Groupmanager> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "groupid", type = IdType.AUTO)
    private Integer groupid;

    /**
     * 管理组名称
     */
    private String groupname;

    /**
     * 管理组信息
     */
    private String groupinfo;

    private Integer masterid;

    /**
     * 组创建时间
     */
    private LocalDate createdate;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    public String getGroupinfo() {
        return groupinfo;
    }

    public void setGroupinfo(String groupinfo) {
        this.groupinfo = groupinfo;
    }
    public Integer getMasterid() {
        return masterid;
    }

    public void setMasterid(Integer masterid) {
        this.masterid = masterid;
    }
    public LocalDate getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDate createdate) {
        this.createdate = createdate;
    }

    @Override
    protected Serializable pkVal() {
        return this.groupid;
    }

    @Override
    public String toString() {
        return "Groupmanager{" +
        "groupid=" + groupid +
        ", groupname=" + groupname +
        ", groupinfo=" + groupinfo +
        ", masterid=" + masterid +
        ", createdate=" + createdate +
        "}";
    }
}
