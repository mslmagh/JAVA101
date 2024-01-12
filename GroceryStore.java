import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pear, apple, tomato, banana, eggplant, total;
        System.out.print("how much pear ? :");
        pear = scan.nextDouble();
        System.out.print("how much apple ? :");
        apple = scan.nextDouble();
        System.out.print("how much tomato ? :");
        tomato = scan.nextDouble();
        System.out.print("how much banana ? :");
        banana = scan.nextDouble();
        System.out.print("how much eggplant ? :");
        eggplant = scan.nextDouble();
        total = pear * 2.14 + apple * 3.67 + tomato * 1.11 + banana * 0.95 + eggplant * 5.0;
        System.out.println("Total amount: " + total);

    }
}
