import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height, mass, index;
        System.out.print("Enter your height with meter: ");
        height = scan.nextDouble();
        System.out.print("Enter your mass: ");
        mass = scan.nextDouble();
        index = mass / (height * height);
        System.out.println("Your body mass index is: " + index);
    }
}
