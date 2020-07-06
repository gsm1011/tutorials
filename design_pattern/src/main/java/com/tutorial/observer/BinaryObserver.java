package com.tutorial.observer;

public class BinaryObserver extends Observer {
    @Override
    public void update(Object o) {
        System.out.println("This is binary observer, new state: " + o.toString());
    }

    public String toString() {
        return "Binary Observer";
    }

}
