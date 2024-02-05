import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(dizi));
    }
}

