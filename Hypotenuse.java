import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first side : ");
        int a = scan.nextInt();
        System.out.print("Enter your second side : ");
        int b = scan.nextInt();
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(hypotenuse);
    }
}