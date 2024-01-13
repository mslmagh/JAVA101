import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        double firstValue = inp.nextDouble();
        System.out.print("Enter your second value: ");
        double secondValue = inp.nextDouble();

        System.out.println("1-Addition\n2-Substraction\n3-Multiplication\n4-Division");
        System.out.print("which operation do you want to perform: ");
        int input = inp.nextInt();

        switch (input) {
            case 1:
                System.out.println("The result is: " + (firstValue + secondValue));
                break;
            case 2:
                System.out.println("The result is: " + (firstValue - secondValue));
                break;
            case 3:
                System.out.println("The result is: " + (firstValue * secondValue));
                break;
            case 4:
                System.out.println("The result is: " + (firstValue / secondValue));
                break;
            default:
                System.out.println("Entered invalid value.");
                break;
        }

    }
}
