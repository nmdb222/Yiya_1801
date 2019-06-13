package com.hy.yiya.financeMG.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.yiya.financeMG.bean.Danju;
import com.hy.yiya.financeMG.bean.JiaoJie;
import com.hy.yiya.financeMG.sql.DanjuSql;
import com.hy.yiya.financeMG.sql.JiaojieSql;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface JiaojieMapper extends BaseMapper<JiaoJie> {

    @SelectProvider(type = JiaojieSql.class,method = "select")
    public List<JiaoJie> queryAll(JiaoJie jiaoJie);

    @Select("select * from jiaojie where id=#{value} ")
    public JiaoJie queryByID(int id);

    @Delete("delete from jiaojie where id=#{id}")
    public void delect(int id);

    @Update("update jiaojie set money=#{money},jiaojie=#{jiaojie},jieshou=#{jieshou},jiaojietime=#{jiaojietime},test=#{test} where id=#{id}")
    public void up(JiaoJie jiaoJie);

    @Insert(" insert into jiaojie (money,jiaojie,jieshou,jiaojietime,test) values(#{money},#{jiaojie},#{jieshou},#{jiaojietime},#{test});")
    public int insert(JiaoJie jiaoJie);

}
