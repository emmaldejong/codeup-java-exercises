public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!!");
        System.out.println("Hello, Emma!!!!");

        int myFavoriteNumber = 19;
        System.out.println(myFavoriteNumber);

        String myString = "Annie & DeeDee";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);
        float number = (float)3.14;
        System.out.println(number);

        //questions about long variable, why could you put L in there?
//        longs don't hold decimals
//        long is only hanging onto whole numbers
//        if the number is out of the range of integers you put an L at the end
        //questions about how to fix float on the value side, just changed it to double because I know double is decimals
//        double contains twice the available options than a float does, you can cast the (float) to 3.14 to be more specific and make the float variable work
//          all floats are doubles, not all doubles are floats
//          or you can put an F at the end of the number with float will make it work

        int z = 5;
        System.out.println(++z);
        System.out.println(z);

        //String class = "class"; class is a reserved word

        int x = 4;
        x += 5;
        System.out.println(x);

        int a = 3;
        int y = 4;
        y *= a;
        System.out.println(y);

        int b = 10;
        int c = 2;
        // b = b / c;
        // c = c - b;
        c -= (b / c);
        System.out.println(c);
    }
}
