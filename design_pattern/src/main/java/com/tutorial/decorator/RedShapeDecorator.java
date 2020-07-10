package com.tutorial.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        decorate();
    }

    @Override
    protected void decorate() {
        System.out.println("Setting red border.");
    }
}
