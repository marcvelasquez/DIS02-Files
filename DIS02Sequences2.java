import java.util.Scanner;

public class DIS02Sequences2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = userInput.nextInt();

        userInput.close();

        for (int i = 1; i < inputNumber; i += 3) {
            System.out.print(i + ", ");
        }
        
        System.out.println(inputNumber);
    }
}
