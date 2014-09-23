package com.xuchao.pojo.beaninjection;

public class Sonnet implements Poem {

    private static String[] LINES = {
            "aaaaaaaa",
            "abbbbbbb",
            "aabbbbbb",
            "aaabbbbb",
            "aaaabbbb",
            "aaaaabbb",
            "aaaaaabb",
            "aaaaaaab",
            "aaaaabba",
            "aabbbbba"
    };

    public Sonnet() {

    }

    @Override
    public void recite() {
        for(String str : LINES){
            System.out.println(str);
        }
    }

    void prepare(){

    }

    void end(){

    }

}
