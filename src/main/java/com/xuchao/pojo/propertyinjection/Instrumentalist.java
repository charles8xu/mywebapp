package com.xuchao.pojo.propertyinjection;

import com.xuchao.pojo.beaninjection.Performer;

public class Instrumentalist implements Performer{

    private String song;
    private int age;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String screamSong(){
        return song;
    }

    @Override
    public void perform() {
        System.out.println("Person "+age+" Playing "+song+" ....");
        instrument.play();
    }
}
