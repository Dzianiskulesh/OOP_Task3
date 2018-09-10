package com.epam.task3.package01;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class Watch {
    private int batteryLevel;

    public Watch() {
        batteryLevel = 100;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void displayTime() {
        Clock clock = Clock.tickSeconds(ZoneId.systemDefault());
        System.out.println(LocalTime.now(clock));
    }

}
