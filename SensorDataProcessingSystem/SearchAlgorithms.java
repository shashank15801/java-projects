import java.util.Scanner;
public class SearchAlgorithms {
    public static void searchMenu(Scanner sc) {
        System.out.println("Enter number of readings:");
        int n = sc.nextInt();
        int[] readings = new int[n];
        System.out.println("Enter sorted sensor readings:");
        for (int i = 0; i < n; i++) {
            readings[i] = sc.nextInt();
        }
        System.out.println("Enter value to search: ");
        int target = sc.nextInt();
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int ch = sc.nextInt();
        int result = (ch == 1) ? linearSearch(readings, target) : binarySearch(readings, target);
        if (result == -1)
            System.out.println("Reading not found ");
        else
            System.out.println("Reading found at index:" + result);
    }
    static int linearSearch(int[] arr, int target) {
        System.out.println("Time Complexity: O(n)");
        for (int i =0; i < arr.length; i++)
            if (arr[i] == target)
                return i;
        return -1;
    }
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        System.out.println("Time Complexity: O(log n)");
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
