package com.hy.yiya.dingdanMG.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.dingdanMG.entity.Yudingtype;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface TypeMapper extends BaseMapper<Yudingtype> {
   @Results({
         @Result(column = "id",property = "id"),
         @Result(column = "type",property = "type")
   })
   @Select("select * from yudingtype where id=#{value}")
   public Yudingtype queryId(int id);
}
