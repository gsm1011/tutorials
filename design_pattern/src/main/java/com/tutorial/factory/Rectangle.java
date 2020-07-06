package com.tutorial.factory;

public class Rectangle implements Shape {

    private double height;
    private double width;

    Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Drawning a rectangle.");
    }
}
