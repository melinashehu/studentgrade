package org.example;

public class Student {
    String name;
    int[] grade = new int[8];

    public Student(String name, int[] grade) {
        this.name = name;
        this.grade = grade;

    }

    public String getName() {
        return name;
    }

    public int[] getGrade() {

        return grade;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grades : grade) {
            sum += grades;
        }
        return (double) sum / (grade.length);
    }


}


