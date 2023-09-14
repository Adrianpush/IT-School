package session14.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void fillShoppingCart(int numberOfProducts) {
        Random random = new Random();
        for (int number = 0; number < numberOfProducts; number++) {
            int stringLength = random.nextInt(2, 6);
            StringBuilder stringBuilder = new StringBuilder();
            for (int charIndex = 0; charIndex < stringLength; charIndex++) {
                stringBuilder.append((char) random.nextInt(97, 100));
            }
            String productID = stringBuilder.toString().trim();
            products.add(new Product(productID));
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
