// **9. Write a program that prompts the user to enter five integer values and reads them into an array. The program should consist of the following methods:**

// - A method named “max” that reads an array of integer values and returns the maximum value
// - A method named “indexOfHighest” that returns the index of the highest element in an array of integers. If more than one such element exists, return the smallest index. Invoke the above methods and demonstrate them in the program.

import java.util.Scanner;

public class Task9 {
    static int max(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < 5; i++) {
            if (temp <= arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int indexOfHighest(int[] arr) {
        int temp = arr[0];
        int indexOfTemp = 0;
        for (int i = 0; i < 5; i++) {
            // * Assigning the highest value to the temp and its index.
            if (temp <= arr[i]) {
                temp = arr[i];
                indexOfTemp = i;
            }
        }

        for (int j = 0; j < 5; j++) {
            // * Skiping the loop if it is the index of temp
            if (j == indexOfTemp) {
                continue;
            }
            if (temp == arr[j]) {
                // * returning the lowest index if temp matches with another element is arr
                return 0;
            }
        }

        // * Returning the index of highest
        return indexOfTemp;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myArr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");

            myArr[i] = sc.nextInt();
        }
        System.out.println("Max value is: " + max(myArr));
        System.out.println("Index of highest: " + indexOfHighest(myArr));
        sc.close();
    }

}