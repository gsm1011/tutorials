package com.tutorial.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle() {
        System.out.println("Draw red circle");
    }
}
