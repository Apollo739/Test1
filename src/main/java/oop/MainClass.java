package oop;

public class MainClass {

    public static void main(String... args) {
        Ruslan ruslan = new Ruslan();
        ruslan.changeName("Ruslan");
        Tatyana tatyana = new Tatyana();
        tatyana.changeName("Tatyana");
        System.out.println(ruslan.sayName());
        System.out.println(tatyana.sayName()); // input param String
//        ruslan.walk(5); // input param int
//        tatyana.walk();
//        System.out.println(tatyana.sayName());
    }
}
