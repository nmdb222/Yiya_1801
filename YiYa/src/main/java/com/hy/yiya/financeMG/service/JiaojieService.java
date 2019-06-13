package com.hy.yiya.financeMG.service;

import com.hy.yiya.financeMG.bean.JiaoJie;
import com.hy.yiya.financeMG.mapper.JiaojieMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JiaojieService {
    @Autowired
    public JiaojieMapper jiaojieMapper;

    public List<JiaoJie> queryAll(){ return jiaojieMapper.queryAll();}

    public void delect(int id){ jiaojieMapper.delect(id);}

    public void up(JiaoJie jiaoJie){ jiaojieMapper.up(jiaoJie);}



}
