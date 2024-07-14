// 10. Write a program that prompts the user to enter a sentence and reads it into a string. The program should consist of the following methods:
//  A method named “countVowels" that reads a string and returns the number of vowels in the string.
//  A method named “countConsonants” that reads a string and returns the number of consonants in the string. Invoke the above methods and demonstrate them in the program.

import java.util.Scanner;

public class Task10 {

    public static int countVowels(String userInput, char[] vowels) {
        // params get the user input and the vowels array
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            for (char j : vowels) {
                if (userInput.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countConsonants(String userInput, char[] consonant) {
        // params get the user input and the vowels array
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            for (int j = 0; j < consonant.length; j++) {
                if (userInput.charAt(i) == consonant[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
        char[] consonant = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
                'v', 'w', 'y', 'z' };

        System.out.println("Number of vowels in the string: " + countVowels(userInput, vowels));
        System.out.println("Number of consonants in the string: " + countConsonants(userInput, consonant));

        sc.close();

    }
}
