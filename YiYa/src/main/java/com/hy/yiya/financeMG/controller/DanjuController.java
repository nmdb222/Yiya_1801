package com.hy.yiya.financeMG.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.yiya.financeMG.bean.Danju;
import com.hy.yiya.financeMG.bean.Json;
import com.hy.yiya.financeMG.service.DanjuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/danju")
public class DanjuController {

    private Danju danju;
    private List<Danju> listDanju;
    @Autowired
    private DanjuService danjuService;
    public void setDanjuService(DanjuService danjuService) { this.danjuService = danjuService; }

    public Danju getDanju() { return danju; }
    public void setDanju(Danju danju) { this.danju = danju; }
    public List<Danju> getListDanju() { return listDanju; }
    public void setListDanju(List<Danju> listDanju) { this.listDanju = listDanju; }


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




}
