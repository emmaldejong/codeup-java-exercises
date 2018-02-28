import java.util.Scanner;

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
    public static int calculateFactorial(int one, int ten) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between one & ten: ");
        int userInput = scanner.nextInt();
        int result = 1;
        String userChoice = "";
        do {
            if (userInput >= one && userInput <= ten) {
                for (int i = 1; i <= userInput; i++) {
                    result = result * i;
                    System.out.println(userInput);
                }
            } else {
                return calculateFactorial(one, ten);
            }

            System.out.print("Continue? [y/n]");
            userChoice = scanner.next();

        } while (userChoice.toLowerCase().startsWith("y"));
        return userInput;
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
        System.out.println(calculateFactorial(1, 10));
    }

}
