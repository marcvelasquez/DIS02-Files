/*
 * DIS02SequenceOnline1
 * Author: 
 */

import java.util.Scanner;

public class DIS02SequenceOnline1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = userInput.nextInt();

        userInput.close();

        for (int i = 1; i <= number; i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
