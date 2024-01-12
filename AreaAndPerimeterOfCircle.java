import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double pi = 3.14;
      int radius;
      System.out.print("Enter radius of circle: ");
      radius = scan.nextInt();
      System.out.println("The perimeter of the circle is: " + 2 * pi * radius);
      System.out.println("The area of the circle is: " + pi * Math.pow(radius, 2));
   }
}