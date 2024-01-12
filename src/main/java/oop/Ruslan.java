package oop;

public class Ruslan extends Human {

    public Ruslan(String name) {
        super(name);
    }

    public Ruslan() {
    }

    public Ruslan(String name, int id) {
        super(name, id);
    }

    @Override
    String sayName() {
        return "My name is " + name;
    }

    @Override
    public void move() {
        System.out.println("Running...");
    }

    @Override
    public void voice() {
        System.out.println("Hi");
    }
}
