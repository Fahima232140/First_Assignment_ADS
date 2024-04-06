import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd);
        scanner.close();}
    /**
     * This method calculates the greatest common divisor (GCD) of two numbers a and b using the Euclidean Algorithm.
     * Time complexity: O(log(min(a, b))).
     * The algorithm divides the larger number by the smaller number repeatedly until the remainder is 0,
     * then returns the last non-zero remainder as the GCD.
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);}}
