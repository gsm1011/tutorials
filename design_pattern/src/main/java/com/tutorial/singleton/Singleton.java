package com.tutorial.singleton;

public class Singleton {
    public static void main(String[] args) {
//        SingletonObject o = new SingletonObject();
        SingletonObject object = SingletonObject.getInstance();
        object.testMethod();
    }
}
