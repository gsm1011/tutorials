package com.tutorial.proxy;

public class RealImage implements Image {
    private String fileName;
    RealImage(String fname) {
        this.fileName = fname;
        loadFromDisk(fname);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + this.fileName);
    }
}
