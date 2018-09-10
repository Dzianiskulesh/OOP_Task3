package com.epam.task3.package01;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

// TODO: DK: Не совсем понятно почему Calculator и Phone экстендят Device, а Watch - нет.
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
        // TODO: DK: В данном случае получается что при каждом запросе будет создаваться новый Clock. Его можно было объявить как private поле и инициализировать один раз в конструкторе.
        Clock clock = Clock.tickSeconds(ZoneId.systemDefault());
        // TODO: DK: Лучше было бы возвращать время из метода. А уже в клиенте (в данном случае метод main) решать что с ней делать (выводить к консоле, писать в базу, или например играть мелодию будильника если время равно определённому, и т.д).
        System.out.println(LocalTime.now(clock));
    }

}
