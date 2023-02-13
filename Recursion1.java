/*
 * Recursion 1
 * Author: 
 */

import java.util.Scanner;

public class Recursion1 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);

		System.out.print("Enter a number: ");
		int inputNumber = userInput.nextInt();

		userInput.close();

		int helloWorld = recursionDemo(inputNumber); // 120

		System.out.println(helloWorld);
	}

	public static int recursionDemo(int number) {
		if (number == 1) {
			return 1;
		} else {
			return recursionDemo(number - 1) * number;
		}
	}
}