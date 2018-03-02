public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(20, "Pasta", true);

//        dish.costInCents = 20;
//        dish.nameOfDish = "Pasta";
//        dish.wouldRecommend = true;
        System.out.println(dish.eat());

//        dish.setCostInCents(20);
        System.out.println(dish.getCostInCents());

//        dish.setNameOfDish("Pasta");
        System.out.println(dish.getNameOfDish());

//        dish.setWouldRecommend(true);
        System.out.println(dish.isWouldRecommend());

    }
}
