package com.tutorial.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        User john = new User("John");
        User bob = new User("Bob");

        john.sendMessage("test from john");
        bob.sendMessage("test from bob");
    }
}
