import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        int perKm;
        int startPrize = 10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the km: ");
        perKm = scan.nextInt();
        double payment = perKm * 2.20 + startPrize;
        payment = (payment < 20) ? 20 : payment;
        System.out.println(payment);
    }
}
