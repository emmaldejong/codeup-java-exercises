package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;


    private ArrayList<Integer> grades;

    //CONSTRUCTOR
    public Student(String studentName) {
        this.studentName = studentName;
        grades = new ArrayList<>();
    }

    // RETURN'S THE STUDENT'S NAME
    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
    //ADDS THE GIVEN GRADE TO THE GRADES PROPERTY
    public void addGrade(int grade){
        grades.add(grade);
    }

    //RETURNS THE AVERAGE OF THE STUDENTS GRADES
    public double getGradeAverage() {
        double sumOfAllGrades = 0;

        for(int grade : grades) {
            sumOfAllGrades += grade;
        }
        double average = sumOfAllGrades / grades.size();
        return average;
    }

    public static void main(String[] args) {
        Student student = new Student("Emma");

        student.grades.add(86);
        student.grades.add(88);
        student.grades.add(90);

        System.out.println("Here are " + student.getStudentName() + "'s current grades: " + student.grades);

        System.out.println("Here is the average of " + student.getStudentName() + "'s average grade: " + student.getGradeAverage());

    }
}
