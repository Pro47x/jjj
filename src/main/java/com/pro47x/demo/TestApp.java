package com.pro47x.demo;

import com.pro47x.demo.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {

    @Test
    public void demo01() {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("accountService ");
        accountService.transfer("jack", "rose", 1000);
    }
}
