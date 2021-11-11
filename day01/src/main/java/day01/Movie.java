package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> performances;

    public Movie(String title, List<LocalDateTime> performances) {
        this.title = title;
        this.performances = performances;
    }

    public boolean isPlayingAt(LocalDateTime time) {

        return performances.contains(time);
    }

    public String getTitle() {
        return title;
    }
}
