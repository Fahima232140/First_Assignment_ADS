import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        long result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
        scanner.close();}

    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     * It uses the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
     * Time complexity: O(n*k).
     * The algorithm calculates each binomial coefficient using the formula recursively.
     * @param n The value of n.
     * @param k The value of k.
     * @return The value of C(n, k).
     */
    public static long binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);}}
