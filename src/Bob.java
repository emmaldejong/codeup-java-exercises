import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob...");
        String input = scanner.nextLine();
//        do {
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.trim().equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (input.endsWith("!") || input.toUpperCase().equals(input)) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }

//        } while (input.equals("x");

    }
}
