package com.tutorial.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal m = mealBuilder.prepareVegeMeal();
        m.showItems();

        System.out.println("Meal cost: " + m.getCost());

        m = mealBuilder.prepareNonVegeMeal();
        m.showItems();

        System.out.println("Meal cost: " + m.getCost());
    }

}
