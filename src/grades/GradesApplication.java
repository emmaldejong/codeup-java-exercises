package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();

        Student ryan = new Student("Ryan");
        ryan.addGrade(89);
        ryan.addGrade(92);
        ryan.addGrade(84);

        Student justin = new Student("Justin");
        justin.addGrade(98);
        justin.addGrade(80);
        justin.addGrade(88);

        Student zach = new Student("Zach");
        zach.addGrade(94);
        zach.addGrade(91);
        zach.addGrade(89);

        Student jordan = new Student("Jordan");
        jordan.addGrade(86);
        jordan.addGrade(93);
        jordan.addGrade(90);

        students.put("ryanorsinger", ryan);
        students.put("jreich5", justin);
        students.put("zgulde", zach);
        students.put("jordanisawesome", jordan);

        System.out.println("Welcome!");
        System.out.println("============================================");

        System.out.println("Here are the github usernames of our students: ");

        for(String student : students.keySet()) {
            System.out.println("|" + student + "|");
        }

        boolean willContinue;

        do {
            System.out.println("============================================");
            String usernameInput = input.getString("What student would you like to see more information on?");

            if(students.containsKey(usernameInput)) {
                System.out.println("Name: " + students.get(usernameInput).getStudentName() + "\n" +
                        "Github Username: " + usernameInput + "\n" +
                        "Average Grade: " + students.get(usernameInput).getGradeAverage() + "\n" +
                        "All Current Grades: " + students.get(usernameInput).getGrades());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + usernameInput + "\".");
            }

            System.out.println("============================================");
            System.out.println();
            willContinue = input.yesNo("Would you like to view another student? [Y/N]");

        } while (willContinue);

        System.out.println("Goodbye!");
    }

    public static void viewAllGrades(HashMap<String, Student> students) {
        for(String student : students.keySet()) {
            Student current = students.get(student);
            System.out.println(current.getStudentName());
        }
    }
}

//refactor the program so that on initial output, it asks the user to if they want to [0] exit the program [1]view individual grades [2] view classroom report [3] view classroom average
