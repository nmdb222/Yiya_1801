package com.hy.yiya.financeMG.service;

import com.hy.yiya.financeMG.bean.DanjuType;
import com.hy.yiya.financeMG.mapper.DanjutypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanjuTypeService {
    @Autowired
   public DanjutypeMapper danjutypeMapper;

    public List<DanjuType> queryAll(){ return danjutypeMapper.queryAll();}

}
