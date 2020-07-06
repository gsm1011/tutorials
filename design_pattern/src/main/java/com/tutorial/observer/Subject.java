package com.tutorial.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    Subject() {
        this.observers = new ArrayList<>();
    }

    private List<Observer> observers;

    private int state;

    public int getState() { return state; }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> {
            observer.update(state);
        });
    }
}
