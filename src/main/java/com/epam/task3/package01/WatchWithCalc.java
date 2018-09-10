package com.epam.task3.package01;

public class WatchWithCalc {
    private int batteryLevel;
    private Watch watch;
    private Calculator calc;

    public WatchWithCalc() {
        batteryLevel = 100;
        watch = new Watch();
        calc = new Calculator();
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Watch getWatch() {
        return watch;
    }

    public Calculator getCalc() {
        return calc;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public void setCalc(Calculator calc) {
        this.calc = calc;
    }
}
