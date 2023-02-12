/*
 * Loop 1 with If-Else Statement
 * Author: Marc Victor L. Velasquez
*/

import java.util.Scanner;

public class JavaExercise2 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = userInput.nextInt();

		userInput.close();

		for (int i = 1; i <= number; i++) {
			if (i == number) {
				System.out.println(i);
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}
