package com.tutorial.prototype;

public class Circle extends Shape {
    Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Draw from circle.");
    }
}
