package java_programme;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_ArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the collection using a for-each loop
        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
