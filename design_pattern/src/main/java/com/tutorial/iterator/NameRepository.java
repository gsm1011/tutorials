package com.tutorial.iterator;

public class NameRepository implements Container {
    private String[] names = {"Robert", "John", "Bob", "Smith"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return (index < names.length) ? true : false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
