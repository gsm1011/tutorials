package com.tutorial.proxy;

public class ProxyImage implements Image {
    private RealImage image;
    private String fileName;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == image) {
            image = new RealImage(fileName);
        }
        System.out.println("This is from the proxy image.");
        image.display();
    }
}
