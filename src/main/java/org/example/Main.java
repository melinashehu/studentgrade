package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum of students in the gradebook: ");
        int maxStudents = scan.nextInt();

        GradeBook gradeB = new GradeBook(maxStudents);
        while (true) {
            System.out.println("Student Gradebook Menu: ");
            System.out.println("1. Add a new student.");
            System.out.println("2. Display the list of students and their grades.");
            System.out.println("3. Calculate and display the average grade for each student.");
            System.out.println("4. Calculate and display the class average.");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of student: ");
                    String name = scan.nextLine();
                    System.out.println("Enter the number of grades: ");
                    int numGrades = scan.nextInt();
                    scan.nextLine();//desplay a next line

                    int[] grade = new int[numGrades];
                    for (int i = 0; i < numGrades; i++) {
                        System.out.println("Enter grade" + (i + 1));
                        grade[i] = scan.nextInt();
                    }
                    scan.nextLine();
                    gradeB.addStudent(name, grade);
                    break;

                case 2:
                    //Display the list of students and their grades.
                    gradeB.displayStudents();
                    break;

                case 3:
                    gradeB.calculateStudentsAVarage();
                    //Calculate and display the average grade for each student.

                    break;
                case 4:
                    double classAverage=gradeB.calculateClassAverage();
                    System.out.println("Class average grades "+ classAverage);
                    break;
                case 5:
                    System.out.println("Exit the menu ");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }

        }


    }
}