import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your amount of money: ");
        double a = scan.nextDouble();
        System.out.println("Your money with KDV: " + (a*118/100));
        System.out.println();
    }

}
