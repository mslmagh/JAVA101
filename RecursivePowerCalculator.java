import java.util.Scanner;

public class RecursivePowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent value: ");
        int exponent = scanner.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);

        // Scanner nesnesini kapat
        scanner.close();

    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Any number to the power of 0 is 1.
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}
