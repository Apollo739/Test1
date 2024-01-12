package oop;

public abstract class Human implements Voiceble {

    int age;
    protected String name; //will be private
    String fullName; //capabilities

    public Human(String name) {
       this.name = name;
    }

    public Human() {
    }

    public Human(String newName, int id) {
        name = newName;
        System.out.println(id);
    }

    public void walk(int distance) {
        System.out.println(" I'm walking for " + distance + "km");
    }

    void walk() { // package
        System.out.println("I'm walking...");
    }

    String sayName() {
        return name;
    }

    abstract void move();

    void changeName(String newName) {
        name = newName;
    }
}
