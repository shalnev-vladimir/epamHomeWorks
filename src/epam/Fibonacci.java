package epam;

// import static java.lang.System.*;

public class Fibonacci {

    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }
}
