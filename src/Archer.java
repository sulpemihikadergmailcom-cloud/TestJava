public class Archer extends Character {

    public Archer(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow!");
    }
}
