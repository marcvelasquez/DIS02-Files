/*
 * Java Exercise 3
 * Author: Marc Victor L. Velasquez
 * Input: Last number in the sequence
 * Output: Sequence from 1 to the provided input number
 * Example
 * Input = 7
 * Output: 1, 2, 3. 4, 5, 6, 7
 */

import java.util.Scanner;

public class DIS02Sequences1 {
    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int iNum = sInput.nextInt();

        sInput.close();

        for (int i = 1; i < iNum; i++) {
            // Please ignore this commented out code, I just did this part for fun xD
            //
            // if (i < 10) {
            //     System.out.print("0" + i + ", ");
            //     continue;
            // }
            // if ((i % 10) == 0) {
            //     System.out.println(i);
            //     continue;
            // }
            System.out.print(i + ", ");

        }

        System.out.println(iNum);
    }
}
