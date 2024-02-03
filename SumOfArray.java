public class SumOfArray {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 5, 6, 7, 3, 34, 89 };
        double harmonicAverage = 0;
        int harmonicSum = 0;
        for (int i : list) {
            harmonicSum += 1 / i;
        }
        harmonicAverage = list.length / (1.0 + harmonicSum);
        System.out.println("The harmonic average of the array is: " + harmonicAverage);
    }

}
