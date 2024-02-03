public class findNearestValues {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 11, -30, 3 };
        getMax(arr, 5);

    }

    public static void getMax(int[] array, int value) { // girilen değere en yakın büyük ve küçük değerleri yazdırır.
        int smallNearestValue = 0;
        int bigNearestValue = Integer.MAX_VALUE;
        for (int i : array) {
            if (smallNearestValue <= value && i > smallNearestValue && i <= value)
                smallNearestValue = i;
            if (bigNearestValue >= value && i < bigNearestValue && i >= value)
                bigNearestValue = i;
        }
        System.out.println(smallNearestValue);
        System.out.println(bigNearestValue);
    }
}
