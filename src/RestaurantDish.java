public class RestaurantDish {

//  instance fields(properties and methods)
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public String eat () {
        return "Nom nom nom";

    }
//GETTER AND SETTER
    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

//    CONSTRUCTORS
//    public RestaurantDish(int cost) {
//        costInCents = cost;
//    }
//    public RestaurantDish(String name) {
//        nameOfDish = name;
//    }
//    public RestaurantDish(boolean recommend) {
//        wouldRecommend = recommend;
//    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }
}
