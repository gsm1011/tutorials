package com.tutorial.decorator;

public abstract class ShapeDecorator implements Shape {
    Shape decoratedShape;
    ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
//        System.out.println("Adding decoration.");
    }

    protected abstract void decorate();
}
