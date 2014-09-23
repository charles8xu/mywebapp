package com.xuchao.pojo.beaninjection;

public class Stage {

    private Stage(){

    }

    /**
     * 采用静态内部类的方式，使用外部类Stage的构造方法
     */
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

}
