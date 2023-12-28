package oop;

public class Human {

    int age;
    protected String name = "Human"; //will be private
    String fullName; //capabilities

    public void walk(int distance) {
        System.out.println(" I'm walking for " + distance + "km");
    }

    void walk() { // package
        System.out.println("I'm walking...");
    }

    String sayName() {
        return name;
    }

    void changeName(String newName) {
        name = newName;
    }
}
