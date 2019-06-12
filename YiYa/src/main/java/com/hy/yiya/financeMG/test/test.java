package com.hy.yiya.financeMG.test;

import com.hy.yiya.financeMG.service.DanjuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Spring/applicationContext.xml");
        DanjuService danjuService=(DanjuService)applicationContext.getBean(DanjuService.class);
       System.out.println(danjuService.queryByID(2));



    }
}
