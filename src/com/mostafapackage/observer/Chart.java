package com.mostafapackage.observer;

public class Chart implements Observer {
    DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("chart updated with value" + dataSource.getValue());
    }
}
