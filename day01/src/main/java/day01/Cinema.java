package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> onShow = new ArrayList<>();

    public void addMovie(Movie movie){
        onShow.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> result = new ArrayList<>();

        for (Movie movie : onShow) {
            if (movie.isPlayingAt(time)) {
                result.add(movie.getTitle());
            }
        }


        return result;
    }
}
