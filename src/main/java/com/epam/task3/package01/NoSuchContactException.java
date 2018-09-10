package com.epam.task3.package01;

public class NoSuchContactException extends Exception {
    // Parameterless Constructor
    public NoSuchContactException() {}

    // Constructor that accepts a message
    public NoSuchContactException(String message)
    {
        super(message);
    }
}
