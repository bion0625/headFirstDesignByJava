package ch07.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<T> implements Enumeration<T> {
    Iterator<T> tIterator;

    public IteratorEnumeration(Iterator<T> tIterator) {
        this.tIterator = tIterator;
    }

    @Override
    public boolean hasMoreElements() {
        return tIterator.hasNext();
    }

    @Override
    public T nextElement() {
        return tIterator.next();
    }
}
