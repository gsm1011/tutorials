package com.tutorial.observer;

public class OctalObserver extends Observer {
    @Override
    public void update(Object o) {
        System.out.println("This is octal observer., new state: " + o.toString());
    }

    public String toString() {
        return "Octal Observer";
    }

}
