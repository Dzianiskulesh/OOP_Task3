package com.epam.task3.package01;

// TODO: DK: Тоже не очень понятно, почему это не Device
public class Smartphone {
    private int batteryLevel;
    private Watch watch;
    private Calculator calc;
    private Phone phone;
    private Phonebook phonebook;

    public Smartphone() {
        batteryLevel = 100;
        watch = new Watch();
        calc = new Calculator();
        phone = new Phone();
        phonebook = new Phonebook();
    }

    public void callByName(String name) {
        // TODO: DK: Сделано правлиьно. Единственное можно было проверить а есть ли такой номер, прежде чем пытаться на него звонить.
        String numberOfContact = phonebook.getPhoneNumber(name);
        phone.callByNumber(numberOfContact);

    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public Watch getWatch() {
        return watch;
    }

    // TODO: Опять же возможно вместо простого возвращения калькулятора можно сделать методы sum и subtract и делегировать их калькулятору (Наподобие как ты сделал для метода callByName(String name)).
    public Calculator getCalc() {
        return calc;
    }

    public Phone getPhone() {
        return phone;
    }

    public Phonebook getPhonebook() {
        return phonebook;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public void setCalc(Calculator calc) {
        this.calc = calc;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setPhonebook(Phonebook phonebook) {
        this.phonebook = phonebook;
    }
}
