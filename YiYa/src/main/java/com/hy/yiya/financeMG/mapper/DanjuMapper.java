package com.hy.yiya.financeMG.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.financeMG.bean.Danju;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface DanjuMapper extends BaseMapper<Danju> {

    @Results({
            @Result(column ="type",property = "ty", one = @One(select="com.hy.yiya.financeMG.mapper.DanjutypeMapper.queryByID", fetchType = FetchType.EAGER))
    })
    @Select("select * from danju")
    public List<Danju> queryAll();

    @Delete("delete from danju where id=#{value}")
    public void delect(int id);

    @Select("select * from danju where id=#{value} ")
    public boolean queryByID(int id);

}
