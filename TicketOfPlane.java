import java.util.Scanner;

public class TicketOfPlane {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double km, payment;
        int age;
        int type;
        System.out.print("Enter the km: ");
        km = inp.nextDouble();
        System.out.print("Enter your age: ");
        age = inp.nextInt();
        System.out.print("Enter your flight type(1=> One way 2=> Two way)");
        type = inp.nextInt();
        payment = km * 0.10;
        if (age < 12)
            payment /= 2;
        else if (age < 24)
            payment *= 0.9;
        else if (age > 65)
            payment *= 0.7;
        if (type == 2)
            payment *= 0.8 * 2;
        if (age >= 0 && km >= 0 && (type == 1 || type == 2)) {
            System.out.println("Total payment is: " + payment);
        } else {
            System.out.println("Entered invalid value.");
        }

    }
}
