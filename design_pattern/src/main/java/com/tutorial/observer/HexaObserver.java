package com.tutorial.observer;

public class HexaObserver extends Observer {
    @Override
    public void update(Object o) {
        System.out.println("This is hex observer., new state: " + o.toString());
    }

    public String toString() {
        return "Hex Observer";
    }

}