import java.util.Scanner;

public class DIS02Sequences3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = userInput.nextInt();

        userInput.close();
        
        for (int i = 0; i <= inputNumber; i++) {
            if (i == inputNumber) {
                System.out.print(i * i);
                continue;
            }
            System.out.print((i * i) + ", ");
        }
    }
}