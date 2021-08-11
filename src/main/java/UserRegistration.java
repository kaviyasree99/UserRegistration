package com.bridgelabz;
import java.util.regex.Pattern;
/*
Program Of UserRegistration By Using Junit Testing
 */
public class UserRegistration {
    private Pattern pattern;//Declaring The Pattern variable as private
    /*
    Declaring Validate First Name Method
    The Pattern Defines The First Name Starts With Capital Letter
    The Name Should Have Min 3 Words
     */
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";//The First Letter With Cap And Min 3 Letters
        boolean match =  pattern.matches(Name_Pattern, firstName);//Matching The Name Pattern And FirstName And Returning It
        if(match) {
            System.out.println("First Name Is Valid");
        } else{
            throw new UserRegistrationException("Invalid First Name");
        }
        return match;
    }
    /*
    Declaring Validate Last Name Method
    The Pattern Defines The Last Name Starts With Capital Letter
    The Name Should Have Min 3 Words
    */
    public boolean validateLastName(String LastName) throws UserRegistrationException {
        String Name_pattern = "^[A-Z]{1}[a-z]{2,}$";//The First Letter With Cap And Min 3 Letters
        boolean match = pattern.matches(Name_pattern , LastName);//Matching0 The Name Pattern And LastName And Returning It.
        if(match) {
            System.out.println("Last Name Is Valid");
        } else{
            throw new UserRegistrationException("Invalid Last Name");
        }
        return match;
    }
    /*
    Declaring Valid Email Method
    The Email Should Starts With Small Letter
    Here Declaring The Email Pattern
    */
    public boolean validateemail(String Email) throws UserRegistrationException {
        String Email_pattern = "[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z]{5}+.[a-zA-Z]{2,3}(.[a-zA-Z]{2})?$";
        boolean match = pattern.matches(Email_pattern,Email);//Matching The Email Pattern And Email And Returning It.
        if(match) {
            System.out.println("Email Is Valid");
        } else{
            throw new UserRegistrationException("Invalid Email Id");
        }
        return match;

    }
    /*
    Declaring Valid Phone Number Method
    The Phone Number Pattern Contain The Phone Should Have 10 Numbers
    Here Declaring The Phone Number Pattern
    */
    public boolean validatePhoneNumber(String PhoneNumber) throws UserRegistrationException {
        String Number_pattern = "^[9][1][ ][6-9]{1}[0-9]{9}$";
        boolean match = pattern.matches(Number_pattern, PhoneNumber);//Matching The Phone Number Pattern And Phone Number And Returning It
        if(match) {
            System.out.println("Phone Number Is Valid");
        } else{
            throw new UserRegistrationException("Invalid Phone Number");
        }
        return match;
    }
    /*
    Declaring Valid Password Method
    The Password Should Contain The Minimum Of 8 Characters
    Here Declaring The Password Pattern
    */
    public boolean validatePassword(String Password) throws UserRegistrationException {
        String Password_pattern = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}";
        boolean match= pattern.matches(Password_pattern,Password);
        if(match) {
            System.out.println("Password Is Valid");
        } else{
            throw new UserRegistrationException("Invalid Password");
        }
        return match;
    }
}