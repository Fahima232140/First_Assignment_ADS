import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();}
    /**
     * This method checks whether a given string consists only of digits using recursion.
     * Time complexity: O(n), where n is the length of the string.
     * The algorithm checks if the first character is a digit, then recursively checks
     * the rest of the string.
     * @param s The string to check.
     * @return True if the string consists only of digits, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        } else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar)) {
                return isAllDigits(s.substring(1));
            } else {
                return false;}}}}
