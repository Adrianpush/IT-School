package session12_polymorphism.livepractice.change_runtime_behaviour;

public class GameCharacter {

    private Weapon weapon;

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.use();
    }
}
