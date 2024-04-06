/**
 * This method finds the minimum element in an array using recursion.
 * It calls a recursive helper function to find the minimum element in the array.
 * Time complexity: O(n), where n is the number of elements in the array.
 * The algorithm makes n - 1 recursive calls, each time reducing the size of the array by 1.
 * @param arr The array of elements.
 * @return The minimum element in the array.
 */

import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minElement = findMinimum(arr);
        System.out.println("Minimum element: " + minElement);
        scanner.close();}

    public static int findMinimum(int[] arr) {
        return findMinimumHelper(arr, arr.length);}

    private static int findMinimumHelper(int[] arr, int n) {
        if (n == 1) {
            return arr[0];}
        return Math.min(arr[n - 1], findMinimumHelper(arr, n - 1));}}

