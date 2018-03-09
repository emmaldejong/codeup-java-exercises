package movies;

import util.Input;

import java.util.Arrays;
//
//public class MoviesApplication {
//
//    static Movie[] viewAll = MoviesArray.findAll();
//
//    public static void main(String[] args) {
//        Input input = new Input();
//
//        do {
//            int userInput = input.getInt(0, 8, "What would you like to do?\n" +
//                    "0 - exit application\n" +
//                    "1 - view all movies\n" +
//                    "2 - view movies in the animated category\n" +
//                    "3 - view movies in the drama category\n" +
//                    "4 - view movies in the horror category\n" +
//                    "5 - view movies in the scifi category\n" +
//                    "6 - view movies in the comedy category\n" +
//                    "7 - view movies in the musical category\n" +
//                    "8 - add a new movie\n" +
//                    "===========================================\n" +
//                    "Enter your choice: ");
//
//            displaySelection(userInput);
//
//            System.out.println("===========================================================");
//
//        } while (input.yesNo("Would you like to make another selection or add a movie? [Y/N]"));
//
//        System.out.println("Goodbye!");
//    }
//
//    public static void viewAllMovies() {
//        for (Movie movie : viewAll) {
//            System.out.println(movie.getName() + " -- " + movie.getCategory());
//        }
//    }
//
//    public static void viewByCategory(String category) {
//        for (Movie movie : viewAll) {
//            if (category.equalsIgnoreCase(movie.getCategory())) {
//                System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }
//    }
//
//    public static void addMovie() {
//        Input input = new Input();
//        String newMovieName = input.getString("Step #1 - Enter the new movie's name:");
//        String newMovieCategory = input.getString("Step #2 - Enter the new movie's category:");
//        Movie userNewMovie = new Movie(newMovieName, newMovieCategory);
//        Movie[] moviesArray = Arrays.copyOf(viewAll, viewAll.length + 1);
//        int lastIndex = moviesArray.length - 1;
//        moviesArray[lastIndex] = userNewMovie;
//        viewAll = moviesArray;
//    }
//
//    public static void displaySelection(int userInput) {
//
//        switch (userInput) {
//            case 0:
//                System.exit(0);
//                return;
//            case 1:
//                viewAllMovies();
//                break;
//            case 2:
//                viewByCategory("animated");
//                break;
//            case 3:
//                viewByCategory("drama");
//                break;
//            case 4:
//                viewByCategory("horror");
//                break;
//            case 5:
//                viewByCategory("scifi");
//                break;
//            case 6:
//                viewByCategory("comedy");
//                break;
//            case 7:
//                viewByCategory("musical");
//                break;
//            case 8:
//                addMovie();
//                break;
//            default:
//                System.out.println("ERROR!");
//                break;
//        }
//    }
//}
//
////Thought Process: separate the logic of the application from handling the user input, when you first begin
//                    // to help break down the functionality of the application
//
//
//
//
//
