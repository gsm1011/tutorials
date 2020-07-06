package com.tutorial.factory;

// The factory design pattern.
public class Factory {
    public static void main(String[] args) {
        System.out.println("This is the factory design pattern in java.");

        Factory factory = new Factory();
        Shape shape;

        shape = factory.getShape("circle");
        shape.draw();

        shape = factory.getShape("square");
        shape.draw();
    }

    Shape getShape(String name) {
        if (name.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (name.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}