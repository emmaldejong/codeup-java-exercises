import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob...");
        String input = scanner.nextLine();
//        do {
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

//        } while (input.equals("x");

    }
}
