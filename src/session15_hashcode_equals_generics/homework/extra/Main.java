package session15_hashcode_equals_generics.homework.extra;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "JKR", 140, 87);
        Book book2 = new Book("Lord of the Rings", "JRRT", 241, 99);
        Book book3 = new Book("A game of thrones", "GRRM", 340, 93);

        MusicAlbum album1 = new MusicAlbum("Meteora", "LP", Duration.ofMinutes(40), 94);
        MusicAlbum album2 = new MusicAlbum("Nevermind", "N", Duration.ofMinutes(67), 84);
        MusicAlbum album3 = new MusicAlbum("Spice", "S", Duration.ofMinutes(30), 54);

        List<Rating> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(album1);
        list.add(album2);
        list.add(album3);

        Comparator<Rating> ratingComparator = new RatingComparator();
        System.out.println(list);
        list.sort(ratingComparator);
        System.out.println(list);
    }
}
