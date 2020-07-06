package com.tutorial.observer;

// one to many, behavioral pattern®®
public class ObserverDemo {
    public static void main(String[] args) {
        Subject s = new Subject();

        BinaryObserver bo = new BinaryObserver();
        HexaObserver ho = new HexaObserver();
        OctalObserver oo = new OctalObserver();

        bo.observe(s);
        ho.observe(s);
        oo.observe(s);

        // current state.
        System.out.println(s.getState());

        // change state.
        s.setState(11);

        s.setState(1000);
    }
}
