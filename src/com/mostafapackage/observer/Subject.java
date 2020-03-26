package com.mostafapackage.observer;

import java.util.ArrayList;
import java.util.List;

//observable
public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer o) {
        observerList.add(o);
    }

    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    public void notifyObservers() {
        for (var o : observerList) {
            o.update();
        }
    }
}
