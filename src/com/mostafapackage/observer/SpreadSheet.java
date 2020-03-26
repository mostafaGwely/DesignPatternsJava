package com.mostafapackage.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("spread sheet updated with value "+ value);
    }
}
