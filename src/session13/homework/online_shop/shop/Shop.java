package session13.homework.online_shop.shop;

import session13.homework.online_shop.client.Client;
import session13.homework.online_shop.order.Order;
import session13.homework.online_shop.order.OrderStatus;

import java.util.HashMap;
import java.util.HashSet;

public class Shop implements Recipient {

    public static final int OUT_OF_STOCK = 0;
    private String shopName;
    private HashMap<Product, Integer> products;
    private HashSet<Client> registeredClients;
    private double credit;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.products = new HashMap<>();
        this.registeredClients = new HashSet<>();
        this.credit = 0;
    }

    public String getShopName() {
        return shopName;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void receiveMoney(double amount) {
        credit += amount;
    }

    public void addProduct(Product product) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + 1);
        } else {
            products.put(product, 1);
        }
    }

    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public Product getProductByName(String desiredProductName) {
        for (Product product : products.keySet()) {
            if (product.getProductName().equals(desiredProductName)) {
                return product;
            }
        }
        return null;
    }

    public void registerClient(Client client) {
        this.registeredClients.add(client);
        client.setShop(this);
    }

    public void processOrder(Order order, Client client) {
        StringBuilder items = new StringBuilder();
        for (Product product : order.getOrderProducts()) {
            items.append(" ").append(product.getProductName());
        }
        order.setOrderStatus(OrderStatus.SHIPPED);
        System.out.println("Sending items: " + items +
                " to " + client.getClientName() + " at " + client.getShippingAddress());
    }

    public void printProducts() {
        for (Product product : products.keySet()) {
            System.out.println("Product: " + product.getProductName() +
                    " Price: " + product.getProductPrice() +
                    " Quantity: " + products.get(product));
        }
    }

    public boolean productInStock(Product product) {
        return products.containsKey(product) && products.get(product) > OUT_OF_STOCK;
    }

    public void reserveProduct(Product product) {
        products.put(product, products.get(product) - 1);
    }

    public void unReserveProducts(Order order) {
        for (Product product : order.getOrderProducts()) {
            products.put(product, products.get(product) + 1);
        }
    }
}
