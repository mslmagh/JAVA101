import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("How many rows do you want: ");
        int row = inp.nextInt();
        int a;
        int b = row+1;
        for (int i = 1; i < row*2+1; i += 2) {
            for (int j = b; j > 2; j--) {
                System.out.print(" ");
            }
            for (a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
            b--;
        }
    }
}
