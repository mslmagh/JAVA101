import java.lang.reflect.Array;
import java.util.Arrays;

public class RepeatingNumbers { // Dizide ki tekrar eden çift sayıları bulur.
    public static void main(String[] args) {
        int[] list = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1,8,2,8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i]) && list[i] % 2 == 0) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }
}
