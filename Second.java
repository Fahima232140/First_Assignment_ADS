import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double average = calculateAverage(array, 0, n);
        System.out.println("Average: " + average);
        scanner.close();
    }

    /**
     * This method calculates the average of elements in an array using recursion.
     * It recursively calculates the sum of elements in the array and divides
     * the sum by the number of elements to find the average.
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm makes n recursive calls, each time reducing the size of the array by 1.
     * @param arr The array of elements.
     * @param start The starting index of the current subarray.
     * @param end The ending index of the current subarray.
     * @return The average of elements in the array.
     */
    public static double calculateAverage(int[] arr, int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("Invalid start and end indices");}

        if (start == end - 1) {
            return arr[start];}
        int mid = start + (end - start) / 2;
        double leftAvg = calculateAverage(arr, start, mid);
        double rightAvg = calculateAverage(arr, mid, end);

        return (leftAvg * (mid - start) + rightAvg * (end - mid)) / (end - start);}}
