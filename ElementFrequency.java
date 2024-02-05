import java.util.Arrays;
import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {

        int[] dizi = new int[10];
        for (int i = 0; i < 10; i++) {
            dizi[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(dizi));
        // Eleman frekanslarını hesapla
        int[] frekanslar = new int[10];

        for (int i = 0; i < 10; i++) {
            int eleman = dizi[i];
            int frekans = 1;

            // Daha önce işlenmemişse, diğer elemanları kontrol et
            for (int j = i + 1; j < 10; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                    dizi[j] = -1;
                }
            }

            if (dizi[i] != -1) {
                System.out.println(eleman + " sayısı " + frekans + " kez tekrar edildi.");
            }
        }
    }
}
