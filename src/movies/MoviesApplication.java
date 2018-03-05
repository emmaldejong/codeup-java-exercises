package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MoviesApplication {

    static Movie[] viewAll = MoviesArray.findAll();

    public static void main(String[] args) {
        Input input = new Input();

        do {
            int userInput = input.getInt(0, 6, "What would you like to do?\n" +
//                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a new movie\n" +
                    "Enter your choice: ");

            displaySelection(userInput);

            System.out.println("===========================================================");

        } while (input.yesNo("Would you like to make another selection or add a movie?"));

        System.out.println("Goodbye!");

//        String[] thisIsAStringArray = {"Car", "Van", "Bike"};
//        MoviesArray = add(MoviesArray, "SUV");
//        for (String element:MoviesArray) {
//            System.out.println( element );
//        }
    }

    public static void viewAllMovies() {
        for (Movie movie : viewAll) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void viewByCategory(String category) {
        for (Movie movie : viewAll) {
            if (category.equalsIgnoreCase(movie.getCategory())) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
    public static void addMovie() {
        Input input = new Input();
        String newMovieName = input.getString("Enter the new movie's name:");
        String newMovieCategory = input.getString("Enter the new movie's category:");
        Movie userNewMovie = new Movie(newMovieName, newMovieCategory);
//        Movie[] moviesArray = Arrays.copyOf(viewAll, viewAll.length + 1);
        ArrayList<Movie> moviesArray = new ArrayList<>();
        moviesArray.add(userNewMovie);
    }

    public static void displaySelection(int userInput) {

        switch (userInput) {
            case 1:
                viewAllMovies();
                break;
            case 2:
                viewByCategory("animated");
                break;
            case 3:
                viewByCategory("drama");
                break;
            case 4:
                viewByCategory("horror");
                break;
            case 5:
                viewByCategory("scifi");
                break;
            case 6:
                addMovie();
                break;
            default:
                System.out.println("Goodbye!");
                break;
        }
    }


}







