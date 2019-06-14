package com.hy.yiya.huiyuanMG.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.yiya.huiyuanMG.entity.Huiyuan;
import com.hy.yiya.huiyuanMG.mapper.HuiYuanMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HuiYuanSer extends ServiceImpl<HuiYuanMapper, Huiyuan> {
   public List<Huiyuan> queryAll(Huiyuan huiyuan){
      return baseMapper.queryAll(huiyuan);
   }
}
