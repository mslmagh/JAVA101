public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(iterFibonacci(6));
    }

    public static int iterFibonacci(int n) {

        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;
        for (int i = 0; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

}
