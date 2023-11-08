package java_programme;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElements {
    public static void main(String[] args) {
        // Create a new ArrayList to store elements
        ArrayList<String> car = new ArrayList<>();

        // Add some car name to the ArrayList
        car.add("Audi");
        car.add("Toyato");
        car.add("Honda");
        car.add("Marcedez");
        car.add("I20");

        // Specify the index from which you want to retrieve the element
        int indexToRetrieve = 2; // Index 2 corresponds to "Honda"

        // Check if the specified index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < car.size()) {
            // Retrieve the element at the specified index
            String element = car.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
