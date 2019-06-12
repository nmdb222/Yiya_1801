package com.hy.yiya.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxx
 * @since 2019-06-12
 */
public class Mastergroup extends Model<Mastergroup> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 管理员id
     */
    private Integer masterid;

    /**
     * 管理组id
     */
    private Integer groupid;

    /**
     * 修改时间
     */
    private LocalDate createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getMasterid() {
        return masterid;
    }

    public void setMasterid(Integer masterid) {
        this.masterid = masterid;
    }
    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
    public LocalDate getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDate createdate) {
        this.createdate = createdate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Mastergroup{" +
        "id=" + id +
        ", masterid=" + masterid +
        ", groupid=" + groupid +
        ", createdate=" + createdate +
        "}";
    }
}
