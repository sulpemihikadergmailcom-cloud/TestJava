public class Character {
    protected String name;
    protected int age;
    protected boolean gender; // true = male, false = female

    public Character(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayCharInfo() {
        System.out.println("===== CHARACTER INFO =====");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + (gender ? "Male" : "Female"));
    }

    public void attack() {
        System.out.println(name + " attacks normally.");
    }
}