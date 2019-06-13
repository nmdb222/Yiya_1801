package com.hy.yiya.financeMG.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.financeMG.bean.Danju;
import com.hy.yiya.financeMG.sql.DanjuSql;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface DanjuMapper extends BaseMapper<Danju> {

    @Results({
            @Result(column ="type",property = "ty", one = @One(select="com.hy.yiya.financeMG.mapper.DanjutypeMapper.queryByID", fetchType = FetchType.EAGER))
    })
    @SelectProvider(type = DanjuSql.class,method = "select")
    public List<Danju> queryAll(Danju danju);

    @Delete("delete from danju where id=#{value}")
    public void delect(int id);

    @Select("select * from danju where id=#{value} ")
    public Danju queryByID(int id);

    @Update("update danju set bianhao=#{bianhao},money=#{money},type=#{type},test=#{test} where id=#{id}")
    public void up(Danju danju);

    @SelectProvider(type = DanjuSql.class,method = "select")
    public List<Danju> cx(Danju student);
}
