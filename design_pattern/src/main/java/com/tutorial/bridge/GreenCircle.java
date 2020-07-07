package com.tutorial.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle() {
        System.out.println("Drawing green circle.");
    }
}
