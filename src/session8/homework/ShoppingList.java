package session8.homework;

public class ShoppingList {

    public static void main(String[] args) {
        String[] shoppingList = new String[5];
        shoppingList[0] = "Fuchsia Crocks";
        shoppingList[1] = "Mustard";
        shoppingList[2] = "Hot dogs";
        shoppingList[3] = "Sky mask";
        shoppingList[4] = "Invisible ink";
        for (int index = 0; index < shoppingList.length; index++) {
            System.out.print(shoppingList[index] + " ");
        }
    }
}
