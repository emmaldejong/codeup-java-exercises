package grades;

import java.util.HashMap;

public class GradesApplication {
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
    }
}
