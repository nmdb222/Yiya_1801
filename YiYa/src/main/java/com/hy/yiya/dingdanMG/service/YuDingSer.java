package com.hy.yiya.dingdanMG.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.yiya.dingdanMG.entity.Yuding;
import com.hy.yiya.dingdanMG.mapper.YuDingMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class YuDingSer extends ServiceImpl<YuDingMapper,Yuding> {
   public List<Yuding> queryAll(Yuding yuding){
      return baseMapper.queryAll(yuding);
   }
}
