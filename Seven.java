import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        reverseArray(array, 0, n - 1);
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();}
    /**
     * This method reverses the given array using recursion.
     * Time complexity: O(n).
     * The algorithm swaps the first and last elements, then recursively
     * reverses the subarray without the first and last elements.
     * @param array The array to be reversed.
     * @param start The starting index of the subarray to be reversed.
     * @param end The ending index of the subarray to be reversed.
     */
    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end) {
            return;}
        // Swap the first and last elements
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // Recursively reverse the subarray without the first and last elements
        reverseArray(array, start + 1, end - 1);}}

