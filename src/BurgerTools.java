public class BurgerTools {

    public static String mostPopularTopping;
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;

    public static void grill() {
        System.out.println( "grilling burger");
//  adding static after public takes away the need to instance the object in the main method so that these can be called
    }
}
