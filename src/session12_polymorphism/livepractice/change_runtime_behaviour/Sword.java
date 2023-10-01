package session12_polymorphism.livepractice.change_runtime_behaviour;

public class Sword implements Weapon{

    @Override
    public void use() {
        System.out.println("Using sword.");
    }
}
