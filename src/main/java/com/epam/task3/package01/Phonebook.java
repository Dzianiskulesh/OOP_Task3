package com.epam.task3.package01;

import java.util.HashMap;

// TODO: DK: Тоже не очень понятно, почему это не Device?
public class Phonebook {
    private int batteryLevel;
    // TODO: DK: Так же как и с List лучше использовать абстракции Map (а не HashMap).
    private HashMap<String, String> phonesList;

    public Phonebook() {
        batteryLevel = 100;
        // TODO: DK: Hashmap используется только здесь. А дальше везде лучше использовать Map.
        phonesList = new HashMap<>();
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public HashMap<String, String> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(HashMap<String, String> phonesList) {
        this.phonesList = phonesList;
    }

    public String getPhoneNumber(String name) {
        try {
            // TODO: DK: this не обязательно писать.
            if(this.getPhonesList().containsKey(name)) {
                System.out.println(name + " phone number: " + this.getPhonesList().get(name));
                return this.getPhonesList().get(name);
            } else {
                throw new NoSuchContactException();
            }
            // TODO: DK: Опять же нет смысла бросать эксепшн и самому же его ловить сразу.
        } catch(NoSuchContactException ex) {
            System.out.println("No such contact in your phone book!");
            return null;
        }
    }

    public void addContact(String name, String number) {
        // TODO: DK: При правильном использовании try не нужно писать будет. Напомни, на митинге обсудим.
        try {
            if(this.getPhonesList().containsKey(name)) {
                throw new DuplicateContactException();
            } else {
                this.phonesList.put(name, number);
                System.out.println("Contact added successfully!");
            }
        } catch (DuplicateContactException ex) {
            // TODO: DK: Текст можно передавать в конструктор эксепшену.
            System.out.println("Contact with such name already exists!");
        }
    }
}
