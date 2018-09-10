package com.epam.task3.package01;

public class Calculator extends Device {
    private int batteryLevel;

    public Calculator() {
        batteryLevel = 100;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int sum(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

}
