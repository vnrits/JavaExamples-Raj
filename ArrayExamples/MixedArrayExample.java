import java.util.ArrayList;
import java.util.Scanner;

public class MixedArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold Object arrays
        ArrayList<Object[]> list = new ArrayList<>();

        // Initialize the list with integer and string pairs
        list.add(new Object[]{1, "First"});
        list.add(new Object[]{2, "Second"});
        list.add(new Object[]{3, "Third"});

        // Print the initial contents of the list
        printList(list);

        // Get user input for the item to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer value of the item to remove: ");
        int valueToRemove = scanner.nextInt();

        // Remove the item based on user input
        removeItem(list, valueToRemove);

        // Print the contents of the list after removal
        printList(list);

        scanner.close();
    }

    // Method to print the contents of the list
    public static void printList(ArrayList<Object[]> list) {
        System.out.println("Current list contents:");
        for (Object[] item : list) {
            System.out.println("Integer: " + item[0] + ", String: " + item[1]);
        }
    }

    // Method to remove an item from the list based on integer value
    public static void removeItem(ArrayList<Object[]> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0].equals(value)) {
                list.remove(i);
                System.out.println("Item with integer value " + value + " removed.");
                return;
            }
        }
        System.out.println("Item with integer value " + value + " not found.");
    }
}
