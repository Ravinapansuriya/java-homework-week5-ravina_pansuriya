package java_programme;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseValue {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        printArray(originalArray);

        int[] reversedArray = reverse(originalArray);

        System.out.println("Reversed Array:");
        printArray(reversedArray);
    }

    // Method to reverse an array of integers
    public static int[] reverse(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }

        return reversedArray;
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
