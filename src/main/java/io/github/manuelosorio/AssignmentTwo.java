package io.github.manuelosorio;
public class AssignmentTwo {
    public static void main(String[] args) {
        int fibonacciResult = fibonacci(10);
        System.out.println("Fibonacci result: " + fibonacciResult);

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}