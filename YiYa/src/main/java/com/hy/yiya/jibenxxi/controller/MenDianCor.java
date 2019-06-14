package com.hy.yiya.jibenxxi.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hy.yiya.jibenxxi.entity.Mendian;
import com.hy.yiya.jibenxxi.service.MenDianSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mendian")
public class MenDianCor {
   @Autowired
   private MenDianSer menDianSer;

   @RequestMapping(value = "queryMendian.do")
   public String queryMendian(Model model){
      model.addAttribute("list",menDianSer.list(new QueryWrapper<Mendian>()));
      return "/jsp/mendian";
   }
}
