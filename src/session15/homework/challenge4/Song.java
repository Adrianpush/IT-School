package session15.homework.challenge4;

//Create a Song class with title, artist, and length fields.
// Implement the equals() method to check only the title and artist fields.
// Implement the hashCode() method to use the title and artist fields to calculate the hash code.
// Test that two instances with the same title and artist return true for equals() and have the same hash code.

import java.time.Duration;
import java.util.Objects;

public class Song {

    String title;
    String artists;
    Duration length;

    public Song(String title, String artists) {
        this.title = title;
        this.artists = artists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return Objects.equals(title, song.title) && Objects.equals(artists, song.artists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artists);
    }

    public void setLength(Duration length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Song song1 = new Song("Enter Sandman", "M");
        Song song2 = new Song("Hit the lights", "M");
        Song song3 = new Song("Enter Sandman", "M");

        System.out.println(song1.equals(song1));
        System.out.println(song1.equals(song2));
        System.out.println(song1.equals(song3));
    }
}
