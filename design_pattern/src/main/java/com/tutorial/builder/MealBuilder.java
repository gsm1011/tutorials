package com.tutorial.builder;

public class MealBuilder {
    public Meal prepareVegeMeal() {
        Meal meal = new Meal();

        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegeMeal() {
        Meal meal = new Meal();

        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
