public class Mage extends Character {

    public Mage(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball!");
    }
}
