public class Warrior extends Character {

    public Warrior(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword!");
    }
}
