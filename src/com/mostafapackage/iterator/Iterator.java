package com.mostafapackage.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
