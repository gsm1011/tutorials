package com.tutorial.builder;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 1.1f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
