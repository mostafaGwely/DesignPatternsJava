package com.mostafapackage.observer;

public class SpreadSheet implements Observer {
    DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("spread sheet updated with value "+ dataSource.getValue());
    }
}
