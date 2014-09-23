package com.xuchao.pojo.beaninjection;

public class PoemJuggler extends  Juggler {

    private Poem poem;

    public PoemJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoemJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("while reciting....");
        poem.recite();
    }
}
