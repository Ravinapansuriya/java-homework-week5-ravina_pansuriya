package java_programme;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        //Create Hashmap to store String keys and integer value
        Map<String, Integer> student = new HashMap();
        student.put("Ravina", 56);
        student.put("Pratik", 30);
        student.put("Harsh", 22);
        student.put("jatin", 26);

        //use a for-each loop to iterate the value in the map
        System.out.println("Rollno of the student in the map");
        for (Integer rollno : student.values()) {
            System.out.println(rollno);
        }
    }
}
