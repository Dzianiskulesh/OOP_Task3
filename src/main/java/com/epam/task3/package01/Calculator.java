package com.epam.task3.package01;

public class Calculator extends Device {
    // TODO: DK: У тебя batteryLevel существует два раз (в Device и в Calculator). Это немного излише. Можно например объявить его protected в Device. Или сделать Device интерфейсом и урать.
    private int batteryLevel;

    public Calculator() {
        batteryLevel = 100;
    }

    // TODO: Если выбирать оставить Device абстрактным классом, то методы  getBatteryLevel и setBatteryLevel можно перенести туда.
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
