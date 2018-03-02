package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scan.nextLine();
        return userInput;
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String answer = scan.nextLine();
        return (answer.toLowerCase().startsWith("y"));
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int integer = scan.nextInt();
        return integer;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int intInput = getInt(prompt);

        if(intInput < min || intInput > max) {
            System.out.println("Number is out of range between " + min + " and " + max + ".");
            return getIntWithinRange(prompt, min, max);
        } else {
            System.out.println("Your number is within range!");
        }
        return intInput;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double answer = scan.nextDouble();
        return answer;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double doubleInput = getDouble(prompt);

        if(doubleInput < min || doubleInput > max) {
            System.out.println("Your decimal is not within range of " + min + " and " + max + ".");
            return getDoubleWithinRange(prompt, min, max);
        } else {
            System.out.println("Your decimal is within range!");
        }
        return doubleInput;
    }
}
