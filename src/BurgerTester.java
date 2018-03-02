public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools.mostPopularTopping = "cheese";
        BurgerTools.averageDaysBeforeExpiration = 2;
        BurgerTools.temperatureWhenCooked = 280;

        BurgerTools.grill();
    }
}
