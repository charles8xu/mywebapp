package com.xuchao.pojo.test;

import com.xuchao.pojo.beaninjection.PoemJuggler;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PoemJugglerTest {

    private ApplicationContext context;

    @Before
    public void before(){
        DOMConfigurator.configure("/home/xuchao/IdeaProjects/mywebapp/src/main/resources/config/log4j.xml");
        context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    @Test
    public void test(){
        PoemJuggler juggler = (PoemJuggler) context.getBean("poemDuke");
        System.out.println(juggler);
        PoemJuggler juggler2 = (PoemJuggler) context.getBean("poemDuke");
        System.out.println(juggler2);
        PoemJuggler juggler3 = (PoemJuggler) context.getBean("poemDuke");
        System.out.println(juggler3);
        PoemJuggler juggler4 = (PoemJuggler) context.getBean("poemDuke");
        System.out.println(juggler4);
    }

}
