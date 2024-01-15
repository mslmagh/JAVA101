import java.util.Scanner;

public class SmallestAndBiggestNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        System.out.print("How many numbers will you enter: ");
        int count = inp.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter " + i + ". number: ");
            int number1 = inp.nextInt();
            if (number1 > maxValue)
                maxValue = number1;
            if (number1 < minValue)
                minValue = number1;
        }
        System.out.println("Smallest number is: "+minValue);
        System.out.println("Biggest number is: "+maxValue);

    }
}
