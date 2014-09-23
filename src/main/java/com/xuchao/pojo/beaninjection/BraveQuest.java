package com.xuchao.pojo.beaninjection;

public class BraveQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("knight kill a boss!");
    }
}
