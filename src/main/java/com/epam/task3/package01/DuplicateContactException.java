package com.epam.task3.package01;

public class DuplicateContactException extends Exception {
    // Parameterless Constructor
    public DuplicateContactException() {}

    // Constructor that accepts a message
    public DuplicateContactException(String message)
    {
        super(message);
    }
}
