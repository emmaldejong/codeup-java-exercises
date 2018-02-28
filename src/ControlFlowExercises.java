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
        Scanner scanner = new Scanner(System.in);
        boolean confirmCont = true;

            do {
                System.out.print("Please enter a number: ");
                int input = scanner.nextInt();

                System.out.println("\nnumber | squared | cubed");
                System.out.println("---- | ---- | ----");

                for (int i = 1; i <= input; i += 1) {
                    String output = "";
                    output += String.format("%-7d", i);
                    output += String.format("|%-9d", i * i);
                    output += String.format("|%d", i * i * i);
                    System.out.println(output);
                }

                System.out.print("\nDo you wish to continue? [y/n]");
                String userChoice = scanner.next();
                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                    confirmCont = true;
                } else {
                    confirmCont = false;
                }

            } while (confirmCont);


    }
}
