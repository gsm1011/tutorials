package com.tutorial.builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 5.5f;
    }

    @Override
    public String name() {
        return "Chicken burger";
    }
}
