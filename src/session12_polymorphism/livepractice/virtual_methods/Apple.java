package session12_polymorphism.livepractice.virtual_methods;

public class Apple extends Fruit {

    @Override
    public String taste() {
        return "apple is bittersweet";
    }

    @Override
    public String colour() {
        return "apple is green";
    }
}
