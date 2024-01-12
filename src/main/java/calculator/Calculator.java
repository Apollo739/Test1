package calculator;

public class Calculator {

    private int a; //0
    private int b;  //0
    private int result; //0

    //sum
    public int summ(int a, int b) {
        this.a = a;
        this.b = b;
        result = a + b;
        return result;
    }

    //minus
    public int minus(int a, int b) {
        this.a = a;
        this.b = b;
        result = a - b;
        return result;
    }

    //mult
    public int mult(int a, int b) {
        this.a = a;
        this.b = b;
        result = a * b;
        return result;
    }


    //div
    public int div(int a, int b) {
        this.a = a;
        this.b = b;
        try {result = a / b;}
        catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
        }
        return result;
    }

    //mod
    public int mod(int a, int b) {
        this.a = a;
        this.b = b;
        try{
        result = a % b;}
        catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
        }
        return result;
    }
}
