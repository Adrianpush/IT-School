package session13.homework.online_shop.order;

import session13.homework.online_shop.client.Client;
import session13.homework.online_shop.shop.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Client client;
    private LocalDateTime orderFinalized;
    private List<Product> orderProducts;
    private OrderStatus orderStatus;

    public Order(Client client) {
        this.client = client;
        this.orderProducts = new ArrayList<>();
        this.orderStatus = OrderStatus.INITIALIZED;
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderFinalized(LocalDateTime orderFinalized) {
        this.orderFinalized = orderFinalized;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addToOrder(Product product) {
        orderProducts.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product product : orderProducts) {
            total += product.getProductPrice();
        }
        return total;
    }
}
