package session13.homework.online_shop.client;

import session13.homework.online_shop.order.Order;
import session13.homework.online_shop.order.OrderStatus;
import session13.homework.online_shop.payment.Payment;
import session13.homework.online_shop.shop.Product;
import session13.homework.online_shop.shop.Shop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Client implements Payer {

    private String clientName;
    private String eMail;
    private String shippingAddress;
    private String billingAddress;
    private Shop shop;
    private List<Order> pastOrders;
    private Order currentOrder;
    private double credit;

    public Client(String clientName, String eMail, String shippingAddress, String billingAddress) {
        this.clientName = clientName;
        this.eMail = eMail;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.pastOrders = new ArrayList<>();
    }

    public String getClientName() {
        return clientName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void addProductToOrder(Product product) {
        if (currentOrder == null) {
            currentOrder = new Order(this);
        }
        if (shop.productInStock(product)) {
            currentOrder.addToOrder(product);
            shop.reserveProduct(product);
        }
    }

    public void finalizeCurrentOrder() {
        double orderTotal = currentOrder.getTotal();
        currentOrder.setOrderFinalized(LocalDateTime.now());
        Payment orderPayment = new Payment(shop, this, orderTotal);
        if (orderPayment.processPayment()) {
            shop.processOrder(currentOrder, this);
            currentOrder.setOrderStatus(OrderStatus.SENT);
            pastOrders.add(currentOrder);
        } else {
            currentOrder.setOrderStatus(OrderStatus.CANCELED);
            shop.unReserveProducts(currentOrder);
        }
        currentOrder = null;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public boolean payMoney(double amount) {
        if (amount <= credit) {
            credit -= amount;
            return true;
        }
        return false;
    }
}
