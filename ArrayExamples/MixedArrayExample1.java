import java.util.Scanner;

public class MixedArrayExample1 {
    public static void main(String[] args) {
        // Create a two-dimensional array of Objects
        Object[][] array = {
            {1, "First"},
            {2, "Second"},
            {3, "Third"}
        };

        // Print the initial contents of the array
        printArray(array);

        // Get user input for the item to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer value of the item to remove: ");
        int valueToRemove = scanner.nextInt();

        // Remove the item based on user input
        array = removeItem(array, valueToRemove);

        // Print the contents of the array after removal
        printArray(array);

        scanner.close();
    }

    // Method to print the contents of the array
    public static void printArray(Object[][] array) {
        System.out.println("Current array contents:");
        for (Object[] item : array) {
            if (item[0] != null) { // Only print non-null items
                System.out.println("Integer: " + item[0] + ", String: " + item[1]);
            }
        }
    }

    // Method to remove an item from the array based on integer value
    public static Object[][] removeItem(Object[][] array, int value) {
        int removedIndex = -1;

        // Find the index of the item to remove
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(value)) {
                removedIndex = i;
                break;
            }
        }

        // If item not found, return the original array
        if (removedIndex == -1) {
            System.out.println("Item with integer value " + value + " not found.");
            return array;
        }

        // Create a new array with one less element
        Object[][] newArray = new Object[array.length - 1][2];
        int newIndex = 0;

        // Copy elements to the new array, skipping the removed element
        for (int i = 0; i < array.length; i++) {
            if (i != removedIndex) {
                newArray[newIndex++] = array[i];
            }
        }

        System.out.println("Item with integer value " + value + " removed.");
        return newArray;
    }
}
