package com.tutorial.singleton;

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {}

    public static SingletonObject getInstance() {
        return instance;
    }

    public void testMethod() {
        System.out.println("This is singleton design pattern.");
    }
}
