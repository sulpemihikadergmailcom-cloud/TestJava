public class Main {
    public static void main(String[] args) {

        Archer archer = new Archer("Robin", 23, false);
        Mage mage = new Mage("Merlin", 40, false);
        Warrior warrior = new Warrior("Arthur", 30, false);

        archer.displayCharInfo();
        archer.attack();

        System.out.println();

        mage.displayCharInfo();
        mage.attack();

        System.out.println();

        warrior.displayCharInfo();
        warrior.attack();
    }
}