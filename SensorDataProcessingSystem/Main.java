import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
        System.out.println("\n=====SENSOR DATA PROCESSING SYSTEM =====");
        System.out.println("1. Sensor Data Operations");
        System.out.println("2. Search Sensor Readings");
        System.out.println("3. Sort Sensor Readings");
        System.out.println("4. Status Message Analysis");
        System.out.println("0. Exit");
        System.out.println("4. Enter your choice: ");

        choice = sc.nextInt();
        switch (choice){
            case 1 -> SensorOperations.sensorMenu(sc);
            case 2 -> SearchAlgorithms.searchMenu(sc);
            case 3 -> SortAlgorithms.sortMenu(sc);
            case 4 -> StringOperations.stringMenu(sc);
            case 0 -> System.out.println("System shutting down...");
            default -> System.out.println("Invalid choice!");
        }

        }while (choice != 0);
        sc.close();
    }
}
