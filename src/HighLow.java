import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        System.out.println(guessGame(1));
    }

    public static int guessGame(int one) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        String guessAgain;

        do {
            System.out.println("Can you guess what number I'm thinking?");
            int input = scanner.nextInt();

            if(input < randomNumber) {
                System.out.println("HIGHER");
            } else if(input > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
            System.out.println("Continue? [y/n] ");
            guessAgain = scanner.next();
        } while (guessAgain.equalsIgnoreCase("y"));
        return randomNumber;
    }
}
