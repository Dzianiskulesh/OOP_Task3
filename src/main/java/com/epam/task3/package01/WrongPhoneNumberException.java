package com.epam.task3.package01;

class WrongPhoneNumberException extends Exception
{
    // Parameterless Constructor
    public WrongPhoneNumberException() {}

    // Constructor that accepts a message
    public WrongPhoneNumberException(String message)
    {
        super(message);
    }
}