import java.util.Scanner;
public class SensorOperations {
    public static void sensorMenu(Scanner sc) {
        System.out.println("Enter number of sensor readings:");
        int n = sc.nextInt();
        int[] sensorReadings = new int[n];
        System.out.println("Enter sensor readings (e.g., voltage values):");
        for (int i = 0; i <n; i++){
            sensorReadings[i] = sc.nextInt();
        }
        System.out.println("\n1. Find Maximum Reading");
        System.out.println("2. Find Minimum Reading");
        System.out.println("3. Find Reverse Readings");
        System.out.println("4. Detect Over-Voltage Fault");
        System.out.println("Choose Operation:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 -> System.out.println("Max Reading: " + findMax(sensorReadings));
            case 2 -> System.out.println("Min Reading: " + findMin(sensorReadings));
            case 3 -> {
                reverse(sensorReadings);
                print(sensorReadings);
            }
            case 4 -> detectFaults(sensorReadings);
            default -> System.out.println("Invalid choice");
        }
    }
    static int findMax(int[] arr){
    int max = arr[0];
    for (int x : arr)
        if (x > max) max = x;
    System.out.println("Time Complexity: O(n)");
    return max;
    }
static int findMin(int[] arr){
        int min = arr[0];
        for (int x : arr)
            if (x < min) min = x;
        System.out.println("Time Complexity: O(n)");
        return min;
    }
static void reverse(int[] arr){
        int i =0, j = arr.length - 1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        System.out.println("Time Complexity: O(n)");
    }
static void detectFaults(int[] readings) {
        System.out.println("Checking for abnormal voltage values...");
        for (int value : readings) {
            if (value > 420 ) {
                System.out.println("Over-voltage detected:" + value);
            }
        }
        System.out.println("Time Complexity: O(n)");
    }
static void print(int[] arr) {
        System.out.println("Sensor Readings:");
        for (int x : arr)
            System.out.println(x + " ");
        System.out.println();
    }
}
