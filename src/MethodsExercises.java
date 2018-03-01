import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

//########################## Basic Arithmetic ##########################
// 1: Create four separate methods. Each will perform an arithmetic operation (add, sub, multi, div).
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//    public static int sub(int num1, int num2) {
//        return num1 - num2;
//    }
//    public static int multi(int num1, int num2) {
//        return num1 * num2;
//    }
//    public static int div(int num1, int num2) {
//        return num1 / num2;
//    }
//    public static int mod(int num1, int num2) {
//        return num1 % num2;
//    }

// 2: Create a method that validates that user input is in a certain range. If the input is invalid, prompt the user again.
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//
//        if(userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            return getInteger(min, max);
//        }
//    }

// 3: Calculate the factorial of a number.
//    public static int calculateFactorial(int one, int ten) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer between one & ten: ");
//        int userInput = scanner.nextInt();
//        String userChoice = userInput + "! = ";
//        userChoice += userInput;
//        if (userInput >= one && userInput <= ten) {
//            for (int i = userInput -1; i >= 1; i--) {
//                long total = userInput * i;
//                userChoice += " x " + i;
//                userInput *= i;
//                System.out.println(userChoice + " = " + total);
//            }
//        } else {
//            return calculateFactorial(one, ten);
//        }
//        return userInput;
//    }

// 4: Create an application that simulates dice rolling.
    public static int rollDice(int one) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sides does your dice have?");
        int sidesOfDice = scanner.nextInt();
        String input;

        Random random = new Random();


        do {
            int die = (int)(Math.random() * sidesOfDice +1);
            int dieTwo = (int)(Math.random() * sidesOfDice +1);
            System.out.println("You have rolled a " + die + " and a " + dieTwo);
            System.out.println("Continue? [y/n] ");
                input = scanner.next();
        } while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
        return sidesOfDice;
    }


    public static void main(String[] args) {
// 1: TESTING EXERCISE #1
//        System.out.println(add(1, 0));
//        System.out.println(sub(4, 2));
//        System.out.println(multi(3, 1));
//        System.out.println(div(8, 2));
//        System.out.println(mod(9,3));

// 2: TESTING EXERCISE #2
//        System.out.println(getInteger(1, 10));

// 3: TESTING EXERCISE #3
//        System.out.println(calculateFactorial(1, 10));

// 4: TESTING EXERCISE #4
        System.out.println(rollDice(1));

    }

}
