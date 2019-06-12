package com.hy.yiya.financeMG.mapper;

import com.hy.yiya.financeMG.bean.DanjuType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DanjutypeMapper {

    @Select("select * from danjutype where id=#{value}")
    DanjuType queryByID(Integer id);

}
