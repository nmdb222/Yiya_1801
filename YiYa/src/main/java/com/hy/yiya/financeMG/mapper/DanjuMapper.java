package com.hy.yiya.financeMG.mapper;

import com.hy.yiya.utl.financeMG.bean.Danju;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface DanjuMapper {

    @Results({
            @Result(column ="type",property = "ty", one = @One(select="com.hy.yiya.utl.financeMG.mapper.DanjutypeMapper.queryByID", fetchType = FetchType.EAGER))
    })
    @Select("select * from danju")
    public List<Danju> queryAll();

}
