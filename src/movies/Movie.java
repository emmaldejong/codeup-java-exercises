package movies;

public class Movie {
    private String name;
    private String category;

    private static int numberOfMovies = 0;

//############ CONSTRUCTOR
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
        numberOfMovies++;
    }

//############ GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static int getNumberOfMovies() {
        return numberOfMovies;
    }
}
