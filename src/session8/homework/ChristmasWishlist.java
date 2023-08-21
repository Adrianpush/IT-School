package session8.homework;

import java.util.ArrayList;
import java.util.List;

public class ChristmasWishlist {

    public static void main(String[] args) {
        List<String> wishlist = new ArrayList<>();
        wishlist.add("Lego Millennium Falcon");
        wishlist.add("Potatoes");
        wishlist.add("IT School Java Course");
        wishlist.add("Rum");
        wishlist.add("Eye patch");
        wishlist.add("Wooden Leg");

        System.out.println(wishlist);

        StringBuilder stringBuilder = new StringBuilder();
        for (String item : wishlist) {
            stringBuilder.append(item + ", ");
        }
        stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), ".");
        System.out.print(stringBuilder);
    }
}
