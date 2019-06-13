package com.hy.yiya.financeMG.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.yiya.financeMG.bean.DanjuType;
import com.hy.yiya.financeMG.bean.Danju;
import com.hy.yiya.financeMG.bean.Json;
import com.hy.yiya.financeMG.service.DanjuService;
import com.hy.yiya.financeMG.service.DanjuTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/danju")
public class DanjuController {

    private Danju danju;
    private List<Danju> listDanju;
    private List<DanjuType> listDanjutype;

    @Autowired
    private DanjuService danjuService;
    @Autowired
    private DanjuTypeService danjuTypeService;
    public void setDanjuService(DanjuService danjuService) { this.danjuService = danjuService; }
    public void setDanjuTypeService(DanjuTypeService danjuTypeService) { this.danjuTypeService = danjuTypeService; }

    public Danju getDanju() { return danju; }
    public void setDanju(Danju danju) { this.danju = danju; }
    public List<Danju> getListDanju() { return listDanju; }
    public void setListDanju(List<Danju> listDanju) { this.listDanju = listDanju; }
    public List<DanjuType> getListDanjutype() { return listDanjutype; }
    public void setListDanjutype(List<DanjuType> listDanjutype) { this.listDanjutype = listDanjutype; }

    @RequestMapping("/queryAll.do")
    @ResponseBody
    public Json queryAll(Integer page,Integer limit){
        List<Danju> li=danjuService.queryAll();
        Json json=new Json();
        json.setCode(0);
        json.setMsg("");
        json.setCount(danjuService.queryAll().size());
        json.setData(li);
        return json;
    }


    @RequestMapping("/delect.do")
    @ResponseBody
    public void delect(int id){
        danjuService.delect(id);
    }
/*
    @RequestMapping("/queryByID.do")
    public String queryByID(int id){
        System.out.println("成功进入修改");
        danjuService.queryByID(id);
        return "/jsp/financeMG/danjuupdate";
    }*/
    @RequestMapping("/queryByID.do")
    public ModelAndView toUp(int id){
        Danju danju=danjuService.queryByID(id);
        listDanjutype=danjuTypeService.queryAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("danju",danju);
        modelAndView.addObject("list",listDanjutype);
        modelAndView.setViewName("/jsp/financeMG/danjuupdate");
        return modelAndView;
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public void up (Danju danju){
        DanjuType danjuType=new DanjuType();
        danju.setTy(danjuType);
        System.out.println(danju.toString()+"=============================================");
        danjuService.up(danju);
    }
    @RequestMapping("/cx.do")
    public ModelAndView cx(Danju danju){
        listDanju=danjuService.cx(danju);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("list",listDanju);
        modelAndView.setViewName("/jsp/financeMG/danju");
        return modelAndView;
    }

}
