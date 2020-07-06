package com.tutorial.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return items.stream().map(i -> i.price())
                .reduce(0f, Float::sum);
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.println("Item: " + item.name());
            System.out.println("Packing: " + item.packing().pack());
            System.out.println("Price: " + item.price());
        });
    }
}
