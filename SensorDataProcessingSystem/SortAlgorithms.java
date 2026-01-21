import java.util.Scanner;
public class SortAlgorithms {
    public static void sortMenu(Scanner sc) {
        System.out.print("Enter number of sensor readings:");
        int n = sc.nextInt();
        int[] readings = new int[n];
        System.out.println("Enter sensor readings: ");
        for (int i = 0; i < n; i++) {
            readings[i] = sc.nextInt();
        }
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> bubbleSort(readings);
            case 2 -> selectionSort(readings);
            case 3 -> insertionSort(readings);
            default -> System.out.println("Invalid choice");
        }
        System.out.println("Sorted Readings: ");
        for (int x : readings)
            System.out.println(x + " ");
        System.out.println();
    }
    static void bubbleSort(int[] arr) {
        System.out.println("Time Complexity: O(n^2)");
                for (int i = 0; i < arr.length -1; i++)
                    for(int j = 0; j < arr.length - i - 1; j++)
                        if (arr[j] > arr[j + 1]) {
                            int t = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = t;
                        }
    }
    static void selectionSort(int[] arr) {
        System.out.println("Time Complexity: O(n^2)");
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++ )
                if(arr[j] < arr[min]) min=j;
            int t = arr[min];
            arr[min]=arr[i];
            arr[i] = t;
        }
    }
    static void insertionSort(int[] arr) {
        System.out.println("Time Complexity: O(n^2) | Best Case: O(n)");
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
