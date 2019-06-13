package com.hy.yiya.financeMG.test;

import com.hy.yiya.financeMG.bean.Danju;
import com.hy.yiya.financeMG.bean.JiaoJie;
import com.hy.yiya.financeMG.service.DanjuService;
import com.hy.yiya.financeMG.service.JiaojieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Spring/applicationContext.xml");
       /* DanjuService danjuService=applicationContext.getBean(DanjuService.class);
        Danju danju=new Danju();
       // danju.setBianhao("114");
        danju.setType(1);
        danjuService.cx(danju);*/
        JiaojieService jiaojieService=applicationContext.getBean(JiaojieService.class);
        JiaoJie a=new JiaoJie();
        a.setId(2);
        a.setMoney(99);
        a.setJiaojie("紫色");
        a.setJieshou("白色");
        a.setTest("废物");
        jiaojieService.up(a);




    }
}
