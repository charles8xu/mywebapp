package com.xuchao.pojo;

import com.xuchao.pojo.beaninjection.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BraveKnightMain {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
