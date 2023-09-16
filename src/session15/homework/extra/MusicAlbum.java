package session15.homework.extra;

import java.time.Duration;

public class MusicAlbum implements Rating {

    String title;
    String artist;
    Duration duration;
    int rating;

    public MusicAlbum(String title, String artist, Duration duration, int rating) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
