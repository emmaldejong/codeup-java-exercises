package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("How's your day?"));

        System.out.println(input.yesNo("Do you like cats?"));

        System.out.println(input.getInt("Enter a number..."));

        System.out.println(input.getIntWithinRange("Enter another number...", 0, 20));

        System.out.println(input.getDouble("Enter a decimal number..."));

        System.out.println(input.getDoubleWithinRange("Enter another decimal...", 0, 6));
    }
}
