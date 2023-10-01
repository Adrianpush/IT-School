package session13_recap.homework.online_shop;

import session13_recap.homework.online_shop.client.Client;
import session13_recap.homework.online_shop.shop.Product;
import session13_recap.homework.online_shop.shop.Shop;

public class OnlineShopMain {

    public static void main(String[] args) {

        Shop myShop = new Shop("Computer parts R us");
        //Adding items to shop
        myShop.addProduct(new Product("Graphic card", 99));
        myShop.addProduct(new Product("Mouse", 9), 20);
        myShop.addProduct(new Product("Monitor", 60), 12);
        System.out.println("After adding items to shop.");
        myShop.printProducts();

        //successful customer purchase
        Client clientOne = new Client("John Doe", "john@doe",
                "Somewhere", "Elsewhere");
        clientOne.setCredit(100);
        myShop.registerClient(clientOne);
        clientOne.addProductToOrder(myShop.getProductByName("Mouse"));
        System.out.println("Products after client added products in order");
        myShop.printProducts();
        clientOne.finalizeCurrentOrder();
        System.out.println("Products after client successfully finalized order.");
        myShop.printProducts();

        //failed customer purchase
        clientOne.setCredit(0);
        clientOne.addProductToOrder(myShop.getProductByName("Mouse"));
        clientOne.addProductToOrder(myShop.getProductByName("Monitor"));
        System.out.println("Products after client added products in order");
        myShop.printProducts();
        clientOne.finalizeCurrentOrder();
        System.out.println("Products after client unsuccessfully finalized order.");
        myShop.printProducts();
    }
}
