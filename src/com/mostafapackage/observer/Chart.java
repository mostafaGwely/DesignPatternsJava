package com.mostafapackage.observer;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("chart updated with value "+ value);
    }
}
