package oop;

public class MainClass {

    public static void main(String... args) {
        Ruslan ruslan = new Ruslan("Ruslan");
        Ruslan ruslan1 = new Ruslan();
        Ruslan ruslan2 = new Ruslan("Rus", 123);
        ruslan.changeName("Ruslan");
        Tatyana tatyana = new Tatyana("Tatyana");
        tatyana.changeName("Tatyana");
        System.out.println(ruslan.sayName());
        System.out.println(tatyana.sayName()); // input param String
//        ruslan.walk(5); // input param int
//        tatyana.walk();
//        System.out.println(tatyana.sayName());
    }
}
