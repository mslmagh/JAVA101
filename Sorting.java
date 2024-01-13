import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Sorting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double number1, number2, number3;
        double smallest, middle, biggest;
        System.out.print("Enter your first number: ");
        number1 = inp.nextDouble();
        System.out.print("Enter your second number: ");
        number2 = inp.nextDouble();
        System.out.print("Enter your third number: ");
        number3 = inp.nextDouble();
        if (number1 > number2) {
            if (number2 > number3) {
                biggest = number1;
                middle = number2;
                smallest = number3;
                System.out.println("aa");
            } else {
                biggest = number1;
                middle = number3;
                smallest = number2;
                System.out.println("bb");

            }
        } else {
            if (number2 > number3) {
                biggest = number2;
                if (number1 > number3) {
                    middle = number1;
                    smallest = number3;
                }else{
                    middle = number3;
                    smallest = number1;
                }
            } else {
                biggest = number3;
                middle = number2;
                smallest = number1;
            }
        }

        System.out.println(smallest + " " + middle + " " + biggest);

    }
}
