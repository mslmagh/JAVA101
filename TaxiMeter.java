import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        int perKm;
        int startPrize = 10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the km: ");
        perKm = scan.nextInt();
        double payment = perKm * 2.20 + startPrize;
        if (payment < 20)
            System.out.println("The payment is: 20 TL");
        else
            System.out.println("The payment is: " + payment + " TL");
    }
}
