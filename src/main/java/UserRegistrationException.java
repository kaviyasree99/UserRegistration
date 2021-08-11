package com.bridgelabz;
/*
Declaring UserRegistration Class With Extends Exception
 */
public class UserRegistrationException extends Exception {
    /*
    Defining The Parametrised Constructor
    Used For Trow The Exception Message By user
    To Print While Exception Handling
    */
    public UserRegistrationException(String message) {
        super(message);
    }
}