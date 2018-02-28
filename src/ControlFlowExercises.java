import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//############# WHILE LOOPS #############
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//############ DO WHILE LOOPS ##############
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

//########### FIZZ BUZZ ##################
//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//############# TABLE OF POWERS ################
//        Scanner scanner = new Scanner(System.in);
//        boolean confirmCont = true;
//
//            do {
//                System.out.print("Please enter a number: ");
//                int input = scanner.nextInt();
//
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | --------| ------");
//
//                for (int i = 1; i <= input; i += 1) {
//                    String output = "";
//                    output += String.format("%-7d", i);
//                    output += String.format("|%-9d", i * i);
//                    output += String.format("|%d", i * i * i);
//                    System.out.println(output);
//                }
//
//                System.out.print("Continue? [y/n]");
//                String userChoice = scanner.next();
//                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                    confirmCont = true;
//                } else {
//                    confirmCont = false;
//                }
//
//            } while (confirmCont);

//################## GRADE CONVERTER ###################
//        Scanner scanner = new Scanner(System.in);
//            String input;
//
//            do {
//
//                System.out.print("Enter numeric grade: ");
//                int grade = scanner.nextInt();
//                char letterGrade = ' ';
//
//                if (grade >= 88) {
//                    letterGrade = 'A';
//                } else if (grade >= 80) {
//                    letterGrade = 'B';
//                } else if (grade >= 67) {
//                    letterGrade = 'C';
//                } else if (grade >= 60) {
//                    letterGrade = 'D';
//                } else if (grade >= 0) {
//                    letterGrade = 'F';
//                }
//
//                System.out.println(letterGrade);
//
//                System.out.println("Continue? [y/n] ");
//                input = scanner.next();
//
//            } while(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));

//################ Bonuses #########################
// 1. Prompt the user to enter an integer between 1 and 7
// and output the day of the week it maps to (Sunday is 1 and Saturday is 7)
//        Scanner scanner = new Scanner(System.in);
//        String input;
//        do {
//            System.out.println("Please enter any number between 1 and 7: ");
//            int numberInput = scanner.nextInt();
//            String dayOfWeek = " ";
//            switch (numberInput) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default:
//                    System.out.println("Default case");
//                    break;
//            }
//            System.out.println("Continue? [y/n] ");
//                input = scanner.next();
//        } while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));

// 2. Prompt the user for an integer. Output whether or not the number is prime.
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter any integer: ");
            int numberInput = scanner.nextInt();

            for (int i = 2; i < numberInput; i++) {
                if (numberInput % i == 0) {
                    System.out.println(numberInput + "is not Prime... :O");
                } else {
                    System.out.println(numberInput + "is Prime! :D");
                }
            }
            System.out.println("Continue? [y/n");
            input = scanner.next();
        } while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));

// 3. Prompt the user to enter an integer and output all the days of the week that
//have no more letters than the integer given.

// 4. Prompt the user to enter their name. Output whether the name is
// - short (less than 4 characters), medium (less than 9), long (more than 8)
// - contains the letter 'y'
// - is a palindrome

// 5. Print out all times from 1:00am to 12:00pm.
//      Example:
//      1:00am
//      1:01am
//      1:02am
//      etc.
//  this will help you for this bonus...
//  https://stackoverflow.com/questions/12421444/how-to-format-a-number-0-9-to-display-with-2-digits-its-not-a-date
        
    }
}
