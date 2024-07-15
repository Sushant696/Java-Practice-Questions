
import java.util.Scanner;

// **8. Design and implement a simple Java application that prompts the user to enter a valid email address. Your application should throw and handle a custom exception if the user enters an invalid email address:**

// - InvalidEmailException: A custom exception that is thrown when the user enters an email address that does not match a valid email pattern 
// (e.g. it should contain '@' and '.' characters).

public class Task8 {

    public static String ValidateEmail(String email) {

        try {
            if (!email.contains("@") || !email.contains(".")) {
                throw new InvalidEmailException("Please enter a valid email address");
            } else {
                System.out.println("Great job! You entered a valid email address");
            }

        } catch (InvalidEmailException e) {
            System.out.println("Invalid Input: " + e.getMessage());

        } finally {
        }
        return email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Email = sc.nextLine();
        sc.close();
        ValidateEmail(Email);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
