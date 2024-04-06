import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = scanner.nextInt();

        if (isPrime(n, 2)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }

        scanner.close();
    }

    /**
     * This method checks whether a given number is prime recursively.
     * It divides the number by all integers from 2 to sqrt(n) (inclusive)
     * and checks if any of them divides n evenly.
     * If such a divisor is found, the number is not prime.
     * Time complexity: O(sqrt(n)).
     * The algorithm divides the number by at most sqrt(n) integers.
     * @param n The number to check for primality.
     * @param i The current divisor being checked.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);}}

