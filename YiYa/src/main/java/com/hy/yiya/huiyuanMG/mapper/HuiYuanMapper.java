package com.hy.yiya.huiyuanMG.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.huiyuanMG.UtilSql.SelectSql;
import com.hy.yiya.huiyuanMG.entity.Huiyuan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface HuiYuanMapper extends BaseMapper<Huiyuan> {
   @SelectProvider(type = SelectSql.class,method ="queryAll")
   public List<Huiyuan> queryAll(Huiyuan huiyuan);
}
