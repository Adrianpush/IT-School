package session14_collections.homework;

import java.util.ArrayList;
import java.util.List;

public class Client {

    List<ShoppingCart> shoppingHistory = new ArrayList<>();

    public void addToShoppingHistory(ShoppingCart shoppingCart) {
        shoppingHistory.add(shoppingCart);
    }

    public List<ShoppingCart> getShoppingHistory() {
        return shoppingHistory;
    }
}
