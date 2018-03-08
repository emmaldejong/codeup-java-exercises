package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static Input input = new Input();

    public static void main(String[] args) {
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
                System.out.println("ERROR 404 - Student not found with the GitHub username of \"" + usernameInput + "\".");
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
            System.out.println("Name: " + current.getStudentName() +"\n" +
                    "Average Grade: " + current.getGradeAverage() + "\n" +
                    "All Current Grades:" + current.getGrades());
        }
    }
}

//refactor the program so that on initial output, it asks the user to if they want to [0] exit the program [1]view individual grades [2] view classroom report [3] view classroom average [4] add student to classroom

//    - Add an attendance property to your Student objects. It should be a
//      HashMap<String, String>. The keys should be strings representing the date,
//      in the format "2017-10-02", and the values should be Strings that are one
//      of:
//        - "A": Absent
//        - "P": Present
//
//        - Add a method named `recordAttendance(String date, String value)` that
//          adds records to the HashMap this method should make sure `value` is an
//          an acceptable string
//        - Create an instance method on your Student class to calculate a
//          student's attendance percentage -- (Total Days - Absences) / Total Days
//        - Add the attendance information to the output of your command line
//          interface, this should require only a small change
//        - Create an instance method on Student that finds the specific days a
//          student was absent. This method should return a List of Strings, where
//          each string is the date of the absence


// ============================= EXTRA COLLECTION BONUSES =============================
//BONUS 1
//
//Create a grocery list command line application.
//You will use your input class from previous exercises.
//
//- A user should be prompted if they would like to create a grocery list.
//- If they pick yes, they will be prompted if they would like to enter a new item.
//- If the users picks yes, they should be given the following three prompts:
// 1. Given an ordered list of grocery categories to choose from, select the category
// 2. Enter name of the item
// 3. Enter how many
//- The user will then be given the choice to finalize the list or add an additional item.
//- Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by category, and including quantity.
//- For an extra bonus, allow users to filter the results by only one category of items at a time
//- For a super gold star bonus, allow users to edit the list items
//
//Consider before coding how the data should be organized.
//Using ArrayLists and HashMaps will be helpful.
//
//
//BONUS 2
//
//In a package called government, define the following classes:
//
//    Abstract class Government
//    class TexasGovernment, CamelotGovernment
//
//Consider creative examples of the following and include them in your classes where
//it makes sense to include them:
//
//    static properties
//    instance properties
//    abstract methods
//    instance methods
//
//Choose some of the following interfaces with a few methods defined for each and implement them
//in some of your classes:
//
//    Tradeable
//    Negotiable
//    Taxable
//    Fightable