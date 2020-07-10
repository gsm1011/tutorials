package com.tutorial.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iter = nameRepository.getIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
