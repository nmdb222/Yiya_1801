package com.hy.yiya.dingdanMG.controller;


import com.hy.yiya.dingdanMG.entity.Yuding;
import com.hy.yiya.dingdanMG.service.YuDingSer;
import com.hy.yiya.huiyuanMG.entity.LayuiDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("yuding")
public class YuDingCor {
   @Autowired
   private YuDingSer yuDingSer;
   @RequestMapping(value = "queryyuding.do")
   @ResponseBody
   public LayuiDemo queryHuiyuan(Yuding yuding) {
      LayuiDemo layuiDemo=new LayuiDemo();
//      PageHelper.startPage(page,limit,true);
      List<Yuding> list = yuDingSer.queryAll(yuding);

      layuiDemo.setCode(0);
      layuiDemo.setMsg("");
      layuiDemo.setCount(yuDingSer.queryAll(yuding).size());//传总条数  重新查询所有的条数
      layuiDemo.setData(list);
      return layuiDemo;
   }
   @RequestMapping(value = "del.do")
   @ResponseBody
   public boolean del(int id) {
      return yuDingSer.removeById(id);
   }

   @RequestMapping(value = "toupdate.do")
   public String toupdate(Model model, int id) {
      model.addAttribute("list",yuDingSer.getById(id));
      return "";
   }

   @RequestMapping(value = "update.do")
   public String update(Yuding yuding) {
      yuDingSer.updateById(yuding);
      return "";
   }
   @RequestMapping(value = "addhuiyuan.do")
   public String add(Yuding yuding) {
      yuDingSer.save(yuding);
      return "/jsp/addhuiyuan";
   }
   @RequestMapping(value = "deleteByids.do")
   @ResponseBody
   public boolean deleteByids(Integer[] ids){
      return yuDingSer.removeByIds(Arrays.asList(ids));
   }
}
