package session15.homework.challenge5;

//Create a Product class with name, price, and id fields.
// Implement the equals() method to check only the id field.
// Implement the hashCode() method to use the id field to calculate the hash code.
// Test that two instances with the same id return true for equals() and have the same hash code.
// Then change the id of one instance and test that they are no longer equal and have different hash codes.

import java.util.HashSet;
import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private String id;

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Pan", 15.59, "1");
        Product product2 = new Product("Spoon", 15.59, "2");
        Product product3 = new Product("Fork", 15.59, "1");

        HashSet<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println(product1.equals(product1));
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        System.out.println(products.size());

        product3.setId("3");
        System.out.println(products.size());
        for (Product product : products) {
            System.out.println(product);
        }

        products.add(product3);
        System.out.println(products.size());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
