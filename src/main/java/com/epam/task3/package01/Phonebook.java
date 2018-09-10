package com.epam.task3.package01;

import java.util.HashMap;

public class Phonebook {
    private int batteryLevel;
    private HashMap<String, String> phonesList;

    public Phonebook() {
        batteryLevel = 100;
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
            if(this.getPhonesList().containsKey(name)) {
                System.out.println(name + " phone number: " + this.getPhonesList().get(name));
                return this.getPhonesList().get(name);
            } else {
                throw new NoSuchContactException();
            }
        } catch(NoSuchContactException ex) {
            System.out.println("No such contact in your phone book!");
            return null;
        }
    }

    public void addContact(String name, String number) {
        try {
            if(this.getPhonesList().containsKey(name)) {
                throw new DuplicateContactException();
            } else {
                this.phonesList.put(name, number);
                System.out.println("Contact added successfully!");
            }
        } catch (DuplicateContactException ex) {
            System.out.println("Contact with such name already exists!");
        }
    }
}
