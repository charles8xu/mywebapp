package com.xuchao.pojo.propertyinjection;

import com.xuchao.pojo.beaninjection.Performer;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerfomerTest {

    private ApplicationContext context;

    @Before
    public void before(){
        DOMConfigurator.configure("/home/xuchao/IdeaProjects/mywebapp/src/main/resources/config/log4j.xml");
        context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    @Test
    public void test(){
        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
    }

}
