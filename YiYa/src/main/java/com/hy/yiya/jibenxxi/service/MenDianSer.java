package com.hy.yiya.jibenxxi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.yiya.jibenxxi.entity.Mendian;
import com.hy.yiya.jibenxxi.mapper.MenDianMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenDianSer extends ServiceImpl<MenDianMapper, Mendian>{

}
