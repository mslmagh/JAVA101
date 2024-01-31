public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // Recursive olarak önceki iki Fibonacci sayısını topla
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
