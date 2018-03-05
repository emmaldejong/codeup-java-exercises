package movies;

import util.Input;

public class MoviesApplication {

    public static void viewAllMovies() {
        Movie[] viewAll = MoviesArray.findAll();
        for(Movie movie : viewAll) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void viewByCategory(String category) {
        Movie[] viewAll = MoviesArray.findAll();
        for(Movie movie : viewAll) {
            if(category.equalsIgnoreCase(movie.getCategory())) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {

        Input input = new Input();
        int choice = input.getInt("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "Enter your choice: ");

        switch (choice) {
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
            default:
                System.out.println("Goodbye!");
                break;
        }
    }
 }





