package com.epam.task3.package01;

public class Phone extends Device {

    private int batteryLevel;

    public Phone() {
        batteryLevel = 100;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean callByNumber(String str) {
        boolean isValidNumber;

        //Validate against Belarus number
        isValidNumber = str.matches("[+][3][7][5][0-9]{9}");

        //Validate against letters
        try
        {
            if(str.matches(".*[A-Za-zА-Яа-я].*"))
            {
                throw new WrongPhoneNumberException();
            }
        }
        catch(WrongPhoneNumberException ex)
        {
            System.out.println("Incorrect phone number format! Only digits are allowed!");
        }

        //Print success message
        if(isValidNumber) {
            System.out.println("You are calling to " + str + "..");
        } else {
            System.out.println("Please check the number you are trying to callByNumber!");
        }

        return isValidNumber;
    }
}
