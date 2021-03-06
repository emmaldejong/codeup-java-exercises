package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

//############## refactored to ryan's code - simplified to reuse instead of write scan.nextLine in every problem
    public String getString () {
        return scan.next();
    }

//    this was my original code that is hard to reuse throughout an application because I'm specifying that the argument has to be a string
    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scan.next();
        return userInput;
    }

//############### refactored ryan's code to separate the yesNo() method and overload it, this helps to reuse the first yesNo method to other functions that might need to ask a boolean yesNo question
    public boolean yesNo() {
        String userInput = getString();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        String answer = scan.nextLine();
//        return (answer.toLowerCase().startsWith("y"));
//    }

// ############# refactored to ryan's code to separate the getInt method into several simplified and reusable methods that call on each other to preform different tasks

    public int getInt(String prompt) {
        System.out.println(prompt);
        String input = scan.nextLine();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("ERROR - Please enter an integer");
            return getInt(prompt);
        }

    }

    public int getInt(int min, int max, String prompt) {
        int intInput = getInt(prompt);
        if(intInput < min || intInput > max) {
            System.out.println("The number you have selected is outside the range of " + min + " & " + max + "! Please make another selection.");
            return getInt(min, max, prompt);
        } else {
            System.out.println("ERROR");
            return intInput;
        }
    }


//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        int integer = scan.nextInt();
//        return integer;
//    }

//    public int getIntWithinRange(String prompt, int min, int max) {
//        int intInput = getInt(prompt);
//
//        if(intInput < min || intInput > max) {
//            System.out.println("Number is out of range between " + min + " and " + max + ".");
//            return getIntWithinRange(prompt, min, max);
//        } else {
//            System.out.println("Your number is within range!");
//        }
//        return intInput;
//    }

// ############# ryan's code just like the getInt methods to make then reusable and call on each other to build their functionality

    public double getDouble(String prompt) {
        System.out.println(prompt);
        String input = scan.nextLine();
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("ERROR - Please enter an double");
            return getDouble(prompt);
        }
    }

    public double getDouble(double min, double max, String prompt) {
        double input = getDouble(prompt);
        if(input < min || input > max) {
            System.out.println("The number you have selected is outside the range of " + min + " & " + max + "! Please make another selection.");
            return getDouble(min, max, prompt);
        } else {
            return input;
        }
    }
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        double answer = scan.nextDouble();
//        return answer;
//    }
//
//    public double getDoubleWithinRange(String prompt, double min, double max) {
//        double doubleInput = getDouble(prompt);
//
//        if(doubleInput < min || doubleInput > max) {
//            System.out.println("Your decimal is not within range of " + min + " and " + max + ".");
//            return getDoubleWithinRange(prompt, min, max);
//        } else {
//            System.out.println("Your decimal is within range!");
//        }
//        return doubleInput;
//    }
}
