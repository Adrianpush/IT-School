package session14_collections.live;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products = initializeSet();
        Set<String> moreProducts = initializeSet();
        moreProducts.add("S500");
        Set<String> allProducts = mergeProducts(products, moreProducts);
        displayProducts(allProducts);
    }

    private static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P100");
        products.add("P101");
        products.add("P102");
        products.add("P101");
        return products;
    }

    private static void displayProducts(Set<String> products) {
        for (String product : products) {
            System.out.println(product);
        }
    }

    private static Set<String> mergeProducts(Set<String> firstSet, Set<String> secondSet) {
        Set<String> merged = new HashSet<>(firstSet);
        merged.addAll(secondSet);
        return merged;
    }
}
