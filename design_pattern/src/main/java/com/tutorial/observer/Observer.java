package com.tutorial.observer;

public abstract class Observer {
    abstract void update(Object o);
    void observe(Subject subject) {
        subject.attach(this);
    }
}
