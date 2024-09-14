package movie;

import java.util.ArrayList;
import java.util.*;
public class movie {
    private List<movieItem>movieItem = new ArrayList<movieItem>();
    public void addMovieItem(movieItem movieItem) {
        this.movieItem.add(movieItem);
    }
    public List<movieItem> getMovieItem() {
        return movieItem;
    }

    public void printMovieDetails() {
        for (movieItem movieItem : movieItem){
            System.out.println(movieItem);
        }
    }
}
