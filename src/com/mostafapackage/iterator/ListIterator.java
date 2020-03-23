package com.mostafapackage.iterator;


public class ListIterator implements Iterator<String> {

    private BrowseHistory history;
    private int index;

    public ListIterator(BrowseHistory history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return (index < history.getUrls().size());
    }

    @Override
    public String current() {
        return history.getUrls().get(index);
    }

    @Override
    public void next() {
        index++;
    }
}