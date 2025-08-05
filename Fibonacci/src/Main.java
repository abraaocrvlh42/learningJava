public class Main {
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate the sequence up to the n-th term
        System.out.println("Fibonacci sequence up to the " + n + "th term:");
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("The number must be positive.");
            return;
        }

        long a = 0;
        long b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
}