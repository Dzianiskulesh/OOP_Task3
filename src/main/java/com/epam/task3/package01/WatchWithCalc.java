package com.epam.task3.package01;

// TODO: DK: Не совсем понятно почему Calculator и Phone экстендят Device, а WatchWithCalc - нет.
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

    //
    // TODO: DK: Композиция применена правильно. Оснавная идея , что часы калькулятор должны содеражать в себе часы и калькулятор тоже сделана верно.
    //
    //   Но эту концепцию можно доработать. Это не ошибка, просто не всегда нужно открывать во внешний мир внутренние поля класса (часы и калькулятор).
    //   Что я имею ввиду: я как пользователь , хочу чтобы я мог узнать время по часам-калькулятору и посчитать простые вычисления. Т.е. мне не нужен сам объект часов,
    //   мне даже не нужно знать что он есть внутри часов-калькулятора, всё что я хочу - узнать время.
    //      В связи с этим можно сделать метод displayTime() в часах-калькуляторе, но не добавлять его имплементацию здесь, а вместо этого делегировать объекту Watch
    //          public void displayTime() {
    //              watch.displayTime();
    //          }

    public Watch getWatch() {
        return watch;
    }

    //   тоже самое с калькулятором. Так как сделал ты тоже правильно но как я писал выше - не всегда нам нужны внутренние объекты.
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
