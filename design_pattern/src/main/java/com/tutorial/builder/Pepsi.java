package com.tutorial.builder;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 1.2f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
