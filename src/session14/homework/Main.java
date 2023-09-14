package session14.homework;

import session14.homework.que.CustomQ;
import session14.homework.que.Pair;
import session14.homework.trie.Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        //Initialize client shopping history
        Client client = new Client();
        for (int indexShoppingCart = 0; indexShoppingCart < 20; indexShoppingCart++) {
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.fillShoppingCart(20);
            client.addToShoppingHistory(shoppingCart);
        }

        //Find most common items
        // 1. Add all items in a HashMap
        HashMap<String, Integer> hashMap = getHashMap(client);
        // 2. Push all items to PriorityQue
        CustomQ customQ = new CustomQ();
        PriorityQueue<Pair> myPriorityQue = customQ.getPriorityQueue();
        for (Map.Entry<String, Integer> product : hashMap.entrySet()) {
            myPriorityQue.add(new Pair(product.getValue(), product.getKey()));
        }

        // 3. Get k most common items
        int k = 5;
        for (int index = 0; index < Math.min(k, myPriorityQue.size()); index++) {
            Pair product = myPriorityQue.poll();
            System.out.println("Product ID: " + product.getProductID()
                    + " Product frequency: " + product.getFrequency());
        }
    }

    private static HashMap<String, Integer> getHashMap(Client client) {
        Trie myTrie = new Trie();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (ShoppingCart shoppingCart : client.getShoppingHistory()) {
            for (Product product : shoppingCart.getProducts()) {
                String productID = product.getProductID();
                System.out.println("Current ID " + productID);
                if (myTrie.isWordPresent(productID)) {
                    System.out.println("Checking " + productID);
                    hashMap.put(productID, hashMap.get(productID) + 1);
                } else {
                    System.out.println("Adding " + productID);
                    hashMap.put(productID, 1);
                    myTrie.addWord(productID);
                }
            }
        }
        return hashMap;
    }
}
