package com.mostafapackage.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {urls.add(url);}
    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public List<String> getUrls() {
        return urls;
    }
}
