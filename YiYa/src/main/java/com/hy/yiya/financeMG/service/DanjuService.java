package com.hy.yiya.financeMG.service;

import com.hy.yiya.utl.financeMG.bean.Danju;
import com.hy.yiya.utl.financeMG.mapper.DanjuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanjuService {

    @Autowired
    public DanjuMapper danjuMapper;

    public List<Danju> queryAll(){ return danjuMapper.queryAll();}

}
