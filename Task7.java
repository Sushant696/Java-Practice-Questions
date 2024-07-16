import java.util.Scanner;
// 7. Design and implement a simple Java application that prompts the user to enter a string within a specified length, for example, between 5 and 20 characters
// Your application should throw and handle a custom exception if the user enters a string outside this length: InvalidStringLengthException:
// A custom exception that is thrown when the user enters a string with a length outside the valid range (5 to 20 characters).

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string between 5 and 20 characters: ");
        String userInput = sc.nextLine();
        int length = userInput.length();

        try {
            if (length < 5 || length > 20) {
                throw new InvalidStringLengthException("String length should be between 5 and 20 characters.");
            } else {
                System.out.println("Input string is valid.");
            }
        } catch (InvalidStringLengthException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

class InvalidStringLengthException extends Exception {
    public InvalidStringLengthException(String message) {
        super(message);
    }
}