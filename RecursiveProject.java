import java.util.Scanner;

public class RecursiveProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inp.nextInt();
        int firstNumber = number;
        recursive(number, firstNumber);

    }

    public static int recursive(int number, int firstNumber) {
        System.out.print(number + " ");
        if (number == 0 || number < 0) {
            while (number != firstNumber) {
                number += 5;
                System.out.print(number + " ");
            }
            return firstNumber;
        } else {
            return recursive(number - 5, firstNumber);
        }

    }
}
