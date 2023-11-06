package java_programme;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListEmptyOrNot {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> names = new ArrayList<>();
        // Check if the ArrayList is empty
        if (names.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add an element to the ArrayList
        names.add("Alice");

        // Check again if the ArrayList is empty
        if (names.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
