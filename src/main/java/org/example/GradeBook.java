package org.example;

public class GradeBook {

     Student[] students;
    private int studentCount;

    public GradeBook(int maxStudents) {
        students = new Student[maxStudents];
        studentCount = 0;
    }

    public void addStudent(String name, int[] grade) {
        if (studentCount < students.length) {
            students[studentCount] = new Student(name, grade);
            studentCount++;
            System.out.println("Student added sucessfully.");
        } else {
            System.out.println("The gradebook is full.");
        }
    }

    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println("Student name" + student.getName());
            System.out.println("Grades: ");
            for (int grade : student.getGrade()) {
                System.out.println(grade + " ");
            }
            System.out.println();

        }

    }

    public void calculateStudentsAVarage() {
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            double average = student.calculateAverage();
            System.out.println(student.getName() + "-Average grades" + average);

        }

    }
    public double calculateClassAverage(){
        int totalGrades=0;
        int sum=0;
        for(int i=0;i<studentCount;i++){
            int[] grade =students[i].getGrade();
            for(int grades: grade){
                sum+=grades;
                totalGrades++;
            }
        }
       if(totalGrades>0){
           return (double) sum/totalGrades;
       }else
           return 0.0;
    }
}
