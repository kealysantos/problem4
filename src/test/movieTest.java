package test;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myfavs = new movie();

        movieItem item1 = new movieItem("Maleficent", "Charles Perrault");
        movieItem item2 = new movieItem("GIA", "Cristofer and Jay Mclnerney");
        movieItem item3 = new movieItem("Mr and Ms Smith", "Simon Kinberg");

        myfavs.addMovieItem(item1);
        myfavs.addMovieItem(item2);
        myfavs.addMovieItem(item3);


        myfavs.printMovieDetails();
    }
}
