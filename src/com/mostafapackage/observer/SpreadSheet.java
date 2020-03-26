package com.mostafapackage.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("spread sheet updated.");
    }
}
