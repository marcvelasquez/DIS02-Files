import java.util.Scanner;

public class DIS02Sequences4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = userInput.nextInt();

        userInput.close();
        
        for (int i = inputNumber; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i * 5);
                continue;
            }
            System.out.print((i * 5) + ", ");
        }
    }
}