import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth Fibonacci number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            long fibonacciNumber = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
        }
        scanner.close();}

    /**
     * This method calculates the nth Fibonacci number using recursion.
     * Time complexity: O(2^n).
     * The algorithm has exponential time complexity due to repeated calculations of the same Fibonacci numbers.
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);}}}
