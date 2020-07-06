package com.tutorial.factory;

public class Square extends Rectangle {

    private double length;

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
