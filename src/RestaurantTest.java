public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();

        dish.costInCents = 20;
        dish.nameOfDish = "Pasta";
        dish.wouldRecommend = true;
        System.out.println(dish.eat());
    }
}
