import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        scanner.close();}
    /**
     * This method calculates the factorial of a non-negative integer using recursion.
     * The factorial of a number n is the product of all positive integers less than or equal to n.
     * Time complexity: O(n).
     * The algorithm makes n-1 recursive calls.
     * @param n The non-negative integer for which to calculate the factorial.
     * @return The factorial of n.
     */
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;}
        return n * calculateFactorial(n - 1);}}
