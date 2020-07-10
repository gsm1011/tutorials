package com.tutorial.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        redCircle.draw();
        System.out.println("---------------------");
        redRectangle.draw();
    }
}
