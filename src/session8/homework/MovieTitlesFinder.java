package session8.homework;

public class MovieTitlesFinder {

    public static void main(String[] args) {
        String[] movies = {"Lord of the rings", "Home Alone", "The Matrix", "Jojo Rabbit", "The Prestige"};
        findMovie(movies, "Lord of the rings");
        findMovie(movies, "Jojo Rabbit");
        findMovie(movies, "Jaws");

    }

    public static boolean findMovie(String[] movies, String movieTitle) {
        for (int index = 0; index < movies.length; index++) {
            if (movies[index].equals(movieTitle)) {
                System.out.println("Movie " + movieTitle + " is in the list at position " +
                        index + ".");
                return true;
            }
        }
        System.out.println(movieTitle + " is not in the list.");
        return false;
    }
}
