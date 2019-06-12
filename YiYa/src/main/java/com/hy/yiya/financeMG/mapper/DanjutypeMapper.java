package com.hy.yiya.financeMG.mapper;

import com.hy.yiya.utl.financeMG.bean.DanjuType;
import org.apache.ibatis.annotations.Select;


public interface DanjutypeMapper {

    @Select("select * from danjutype where id=#{value}")
    public DanjuType queryByID(Integer id);

}
