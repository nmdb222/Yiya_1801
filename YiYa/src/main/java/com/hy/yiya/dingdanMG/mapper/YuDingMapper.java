package com.hy.yiya.dingdanMG.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.dingdanMG.entity.Yuding;
import com.hy.yiya.huiyuanMG.UtilSql.SelectSql;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
@Mapper
public interface YuDingMapper extends BaseMapper<Yuding> {
   @Results({@Result(column = "id",property = "id"),
         @Result(column = "bianhao",property = "bianhao"),
         @Result(column = "name",property = "name"),
         @Result(column = "number",property = "number"),
         @Result(column = "phone",property = "phone"),
         @Result(column = "phone",property = "phone"),
         @Result(column = "time",property = "time"),
         @Result(column = "test",property = "test"),
         @Result(column = "now",property = "id",one = @One(select = "com.hy.yiya.dingdanMG.mapper.YuDingMapper.queryId",fetchType = FetchType.EAGER))
   })
   @SelectProvider(type = SelectSql.class,method ="queryAll")
   public List<Yuding> queryAll(Yuding yuding);
}
