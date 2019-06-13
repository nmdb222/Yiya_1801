package com.hy.yiya.financeMG.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.financeMG.bean.Danju;
import com.hy.yiya.financeMG.bean.DanjuType;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface DanjutypeMapper extends BaseMapper<DanjuType> {

    @Select("select * from danjutype where id=#{value}")
    DanjuType queryByID(Integer id);

    @Select("select * from danjutype")
    public List<DanjuType> queryAll();
}
