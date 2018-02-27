import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//  ######## SIMPLE INPUT #############
//        String input;
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        input = reader.nextLine();
//        System.out.println("You entered: --> \"" + input + "\" <--");


//  ######### 3 WORDS INPUT #############
//        String firstWord;
//        String secondWord;
//        String thirdWord;
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Please enter three words: ");
//        firstWord = reader.nextLine();
//        secondWord = reader.nextLine();
//        thirdWord = reader.nextLine();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);


//  ####### SENTENCE INPUT ###########
//        String input;
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Please type a sentence: ");
//        input = reader.nextLine();
//        System.out.println("You entered: --> \"" + input + "\" <--");


//  ######## CODEUP CLASSROOM MEASUREMENTS #############
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the width of the Codeup Classroom: ");
        String widthInput = reader.nextLine();
        double width = Double.parseDouble(widthInput);

        System.out.println("Enter the length of the Codeup Classroom: ");
        String lengthInput = reader.nextLine();
        double length = Double.parseDouble(lengthInput);

        System.out.println("area = " + (width * length));
        System.out.println("perimeter = " + ((2 * width) + (2 * length)));


    }
}




