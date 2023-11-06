package java_programme;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        double[] marks = new double[3];
        String[] subjects = {"Math", "Science", "English"};

        for (int i = 0; i < 3; i++) {
            marks[i] = getValidMarks(scanner, subjects[i]);
        }

        double totalMarks = calculateTotalMarks(marks);
        float percentage = (float) calculatePercentage(totalMarks);
        String result = calculateResult(percentage);
        String grade = calculateGrade(percentage);

        printMarkSheet(name, rollNo, subjects, marks, totalMarks, percentage, result, grade);
    }

    //Method to check the user enter valid marks or not
    private static double getValidMarks(Scanner scanner, String subject) {
        double marks;
        do {
            System.out.println("Enter marks for " + subject + ":");
            marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        } while (marks < 0 || marks > 100);

        return marks;
    }

    //method to calculate the total of marks
    private static double calculateTotalMarks(double[] marks) {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    //method to calculate the percentage
    private static double calculatePercentage(double totalMarks) {
        return (totalMarks / 300) * 100;
    }

    //method to check the student is pass or fail
    private static String calculateResult(double percentage) {
        return (percentage >= 35) ? "Pass" : "Fail";
    }

    //method to calculate the grade
    private static String calculateGrade(float percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "D"; // You can define a grade for percentages below 35 if needed.
        }
    }

    //method for printing the marksheet
    private static void printMarkSheet(String name, int rollNo, String[] subjects, double[] marks, double totalMarks, float percentage, String result, String grade) {
        System.out.println("________________________________");
        System.out.println("|         Mark Sheet           |");
        System.out.println("|______________________________|");
        System.out.println("| Name : " + name + "                |");
        System.out.println("| Roll No : " + rollNo + "           |");
        System.out.println("|______________________________|");
        System.out.println("| Subjects : Marks             |");
        System.out.println("|______________________________|");

        for (int i = 0; i < 3; i++) {
            System.out.println("| " + subjects[i] + " : " + marks[i] + "             |");
        }

        System.out.println("|______________________________|");
        System.out.println("| Total : " + totalMarks + "              |");
        System.out.println("|______________________________|");
        System.out.println("| Percentage : " + percentage + "          |");
        System.out.println("| Result : " + result + "                 |");
        System.out.println("| Grade : " + grade + "                   |");
        System.out.println("|_______________________________");
    }

}





