package session17_streams.homework;

import java.util.*;
import java.util.stream.Collectors;

enum ProductCategory {
    ENTERTAINMENT, APPLIANCES, CLOTHES;
}

public class HighestAveragePrice {

    public static void main(String[] args) {
        Random random = new Random();
        List<Product> products = Arrays.asList(
                new Product("Laptop", ProductCategory.APPLIANCES, random.nextDouble(10)),
                new Product("T-shirt", ProductCategory.CLOTHES, random.nextDouble(1)),
                new Product("TV", ProductCategory.ENTERTAINMENT, random.nextDouble(1000)),
                new Product("Skirt", ProductCategory.CLOTHES, random.nextDouble(1)),
                new Product("Pants", ProductCategory.CLOTHES, random.nextDouble(1))
        );
        System.out.println(getHighestAveragePrice(products).orElseThrow());
    }

    /**
     * Given a list of products with attributes: name, category, and price;
     * find the category with the highest average price.
     * @param products - List of Product Objects
     * @return
     */
    private static Optional<ProductCategory> getHighestAveragePrice(List<Product> products) {
        Optional<Map.Entry<ProductCategory, Double>> highestPaid = products.stream()
                .collect(Collectors.groupingBy(Product::getProductCategory,
                        Collectors.averagingDouble(Product::getPrice)))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        return highestPaid.map(Map.Entry::getKey);
    }
}

class Product {
    String name;
    ProductCategory productCategory;
    double price;

    public Product(String name, ProductCategory productCategory, double price) {
        this.name = name;
        this.productCategory = productCategory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productCategory=" + productCategory +
                ", price=" + price +
                '}';
    }
}
