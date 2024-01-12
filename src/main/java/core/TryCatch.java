package core;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TryCatch {

    public static void main(String... args) {

        int a = 1;
        int b = 0;

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetical exception, please enter another number");
        } finally {
            System.out.println("Finally block is exist");
        }
        System.out.println("program is continue working....");

    }
}
