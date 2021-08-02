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

    /*
      EmailID Validation method
     */
    public static boolean emailValidation(String Email){
        String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
        Pattern p = Pattern.compile(regexEmail);
        if (Email == null) {
            return false;
        }
        Matcher m = p.matcher(Email);
        return  m.matches();

    }

    /*
      MobileNumber Validation method
     */
    public static boolean mobileNumValidation(String MobileNum ){
        String regexMobileNum = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(regexMobileNum);
        if (MobileNum == null){
            return false;
        }
        Matcher m =p.matcher(MobileNum);

        return m.matches();
    }
    /*
      Password Validation method
     */
    public static boolean PasswordValidation(String password) {
        String regexPassword = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern p = Pattern.compile(regexPassword);
        if (password == null){
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
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

        //Email
        System.out.println("Please Enter your Email: ");
        String EmailID = input.nextLine();
        if (emailValidation(EmailID)) {
            System.out.println(EmailID + " is Valid email");
        } else {
            System.out.println(EmailID + " is Invalid email");
        }

        //Mobile Number
        System.out.println("Please Enter the mobile number with country code 91: ");
        String MobileNum = input.nextLine();
        if (mobileNumValidation(MobileNum)) {
            System.out.println(MobileNum + " is Valid PhoneNumber");
        } else {
            System.out.println(MobileNum + " is Invalid PhoneNumber");
        }

        //Password
        System.out.println("please enter the Password");
        String Password = input.nextLine();
        System.out.println(PasswordValidation(Password));
        if (PasswordValidation(Password)) {
            System.out.println(Password + " is Valid Password");
        } else {
            System.out.println(Password + " is Invalid Password");
        }
    }
}