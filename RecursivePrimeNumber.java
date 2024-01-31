import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (recursivePrime(number, number / 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
        scanner.close();
    }

    public static boolean recursivePrime(int number, int divisor) {
        if (divisor == 1) {
            return true; 
        } else {
            if (number % divisor == 0) {
                return false; 
            } else {
               
                return recursivePrime(number, divisor - 1);
            }
        }
    }
}
