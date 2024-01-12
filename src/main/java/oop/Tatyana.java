package oop;

public class Tatyana extends Human {

    public Tatyana(String name) {
        super(name);
    }

    @Override // not required
    String sayName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("Go side by side");
    }

    @Override
    public void voice() {
        System.out.println("Hello");
    }
}
