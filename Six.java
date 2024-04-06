import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        long result = power(a, n);
        System.out.println(a + " raised to the power of " + n + " is: " + result);
        scanner.close();}

    /**
     * This method calculates the result of raising a to the power of n using recursion.
     * Time complexity: O(log n).
     * The algorithm uses a divide-and-conquer approach to reduce the number of multiplications.
     * @param a The base.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            long halfPower = power(a, n / 2);
            return halfPower * halfPower;
        } else {
            return a * power(a, n - 1);}}}

