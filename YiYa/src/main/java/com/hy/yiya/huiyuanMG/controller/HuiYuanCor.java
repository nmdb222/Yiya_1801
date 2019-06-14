package com.hy.yiya.huiyuanMG.controller;

import com.github.pagehelper.PageHelper;
import com.hy.yiya.huiyuanMG.entity.Huiyuan;
import com.hy.yiya.huiyuanMG.entity.LayuiDemo;
import com.hy.yiya.huiyuanMG.service.HuiYuanSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("huiyuan")
public class HuiYuanCor {
   @Autowired
   private HuiYuanSer huiYuanSer;
   @RequestMapping(value = "queryhuiyuan.do")
   @ResponseBody
   public LayuiDemo queryHuiyuan(Huiyuan huiyuan,Integer page,Integer limit) {
      LayuiDemo layuiDemo=new LayuiDemo();
      PageHelper.startPage(page,limit,true);
      List<Huiyuan> list = huiYuanSer.queryAll(huiyuan);

      layuiDemo.setCode(0);
      layuiDemo.setMsg("");
      layuiDemo.setCount(huiYuanSer.queryAll(huiyuan).size());//传总条数  重新查询所有的条数
      layuiDemo.setData(list);
      return layuiDemo;
   }
   @RequestMapping(value = "del.do")
   @ResponseBody
   public boolean del(int id) {
      return huiYuanSer.removeById(id);
   }

   @RequestMapping(value = "toupdate.do")
   public String toupdate(Model model, int id) {
      model.addAttribute("list",huiYuanSer.getById(id));
      return "/jsp/tohuiyuan";
   }

   @RequestMapping(value = "update.do")
   public String update(Huiyuan huiyuan) {
      huiYuanSer.updateById(huiyuan);
      return "/jsp/huiyuan";
   }
   @RequestMapping(value = "addhuiyuan.do")
   public String add(Huiyuan huiyuan) {
      huiYuanSer.save(huiyuan);
      return "/jsp/addhuiyuan";
   }
   @RequestMapping(value = "deleteByids.do")
   @ResponseBody
   public boolean deleteByids(Integer[] ids){
      return huiYuanSer.removeByIds(Arrays.asList(ids));
   }
}
