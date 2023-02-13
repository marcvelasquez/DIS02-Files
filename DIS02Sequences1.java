/*
 * Java Exercise 3
 * Author: 
 */

import java.util.Scanner;

public class DIS02Sequences1 {
    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int iNum = sInput.nextInt();

        sInput.close();

        for (int i = 1; i < iNum; i++) {
            System.out.print(i + ", ");

        }

        System.out.println(iNum);
    }
}
