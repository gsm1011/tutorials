package com.tutorial.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Hashtable<String, Shape> cachedShapes = ShapeCache.getCachedShapes();
        System.out.println(cachedShapes);

        String[] ids = new String[]{"1", "2", "3"};
        ArrayList<String> idsList = new ArrayList<String>(Arrays.asList(ids));
        idsList.forEach(id -> {
            Shape shape = ShapeCache.getShape(id);
            shape.draw();
        });
    }
}
