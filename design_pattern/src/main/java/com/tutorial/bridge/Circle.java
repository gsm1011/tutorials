package com.tutorial.bridge;

public class Circle extends Shape {
    Circle(DrawAPI api) {
        super(api);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle();
    }
}
