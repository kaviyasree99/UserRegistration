import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /*
     FirstName Validation method
     */
    public static boolean firstNameValidation(String FirstName) {
        boolean validation = Pattern.matches("^[A-Z][a-z]{2,}", FirstName);
        return validation;
    }

    /*
      LastName Validation method
     */
    public static boolean lastNameValidation(String LastName) {
        boolean validation = Pattern.matches("^[A-Z][a-z]{2,}", LastName);
        return validation;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Registration System");
        Scanner input = new Scanner(System.in);

        //FirstName
        System.out.print("Please Enter firstname: ");
        String FirstName = input.nextLine();
        if (firstNameValidation(FirstName)) {
            System.out.println(FirstName + " is Valid name");
        } else {
            System.out.println(FirstName + " is Invalid name");
        }

        //LastName
        System.out.println("Please Enter your lastname: ");
        String LastName = input.nextLine();
        if (lastNameValidation(LastName)) {
            System.out.println(LastName + " is Valid name");
        } else {
            System.out.println(LastName + " is Invalid name");
        }
    }
}