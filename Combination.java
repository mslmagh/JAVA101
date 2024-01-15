public class Combination {
    public static void main(String[] args) {
        System.out.println(combination(6, 3));
    }

    public static int factorial(int f) {
        int a = 1;
        for (int i = 1; i <= f; i++) {
            a *= i;
        }
        return a;
    }

    public static double combination(int n, int r) {
        double a;
        a = factorial(n) / (factorial(r) * factorial(n - r));
        return a;
    }
}
