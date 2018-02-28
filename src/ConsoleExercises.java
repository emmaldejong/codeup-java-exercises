import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//  ######## SIMPLE INPUT #############
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int input = reader.nextInt();
//        System.out.println("You entered: --> \"" + input + "\" <--");


//  ######### 3 WORDS INPUT #############
//        String firstWord;
//        String secondWord;
//        String thirdWord;
//
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Please enter three words: ");
//
//        firstWord = reader.next();
//        secondWord = reader.next();
//        thirdWord = reader.next();
//
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
//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Enter the width of the Codeup Classroom: ");
//        String widthInput = reader.nextLine();
//        double width = Double.parseDouble(widthInput);
//
//        System.out.println("Enter the length of the Codeup Classroom: ");
//        String lengthInput = reader.nextLine();
//        double length = Double.parseDouble(lengthInput);
//
//        System.out.println("Enter the height of the Codeup Classroom: ");
//        String heightInput = reader.nextLine();
//        double height = Double.parseDouble(heightInput);
//
//        System.out.println("area = " + (width * length));
//        System.out.println("perimeter = " + ((2 * width) + (2 * length)));
//        System.out.println("volume = " + (width * length * height));

// ################ BONUSES ######################
// #1
//Prompt the user to enter a favorite quote
//Output the quote
//Ask them to enter how many words are in the sentence
//Output the number they entered
//        Scanner reader = new Scanner(System.in);
//        System.out.print("ENTER YOUR FAVORITE QUOTE: ");
//        String favQuote = reader.nextLine();
//        System.out.println("Your Favorite quote is: '" + favQuote + "'");
//        System.out.println("HOW MANY WORDS ARE IN THAT SENTENCE?");
//        int numberOfWords = reader.nextInt();
//        System.out.println("You said there are " + numberOfWords + " words in that sentence.");

// #2
//Prompt the user to enter a list of top three favorite foods separated by only spaces
//Use the printf() to output there three top foods with the format:
//1) FirstFood
//2) SecondFood
//3) ThirdFood
        String firstFood;
        String secondFood;
        String thirdFood;

        Scanner reader = new Scanner(System.in);
        System.out.println("ENTER YOUR 3 FAV FOODS SEPARATED BY SPACES: ");

        firstFood = reader.next();
        secondFood = reader.next();
        thirdFood = reader.next();

        System.out.printf("1) ", firstFood);
        System.out.printf("2) ", secondFood);
        System.out.printf("3) ", thirdFood);

// #3
//Prompt the user to enter a grocery list of three items
//Each item should only be separated by a comma (no spaces)
//You will need to use the .useDelimiter() method on your scanner object
//Output the result as a comma-separated list using printf()

    }
}




