import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstNameValidation(String FirstName) {
        // String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        //Pattern p = Pattern.compile(regex);
        //if (FirstName == null){
        ///   return false;
        //  }
        // Matcher m = p.matcher(FirstName);
        // return m.matches();
        boolean validation = Pattern.matches("^[A-Z][a-z]{2,}", FirstName);

        return validation;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Registration System");
        Scanner input = new Scanner(System.in);
        boolean validName;

        System.out.print("Please Enter firstname: ");
        String FirstName = input.nextLine();
        if (firstNameValidation(FirstName)) {
            System.out.println(FirstName + " is Valid name");
        } else {
            System.out.println(FirstName + " is Invalid name");
        }

    }
}