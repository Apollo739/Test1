 class HomeWorkOperations {
    public static void main (String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.print (i + "  ");
        }
    }
}

 class SumNumbers {
    public static void main(String[] args) {

//        int []ar = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
class Operations{
    public static void main(String[] args){
        int a = 6;
        int b = 1;
        int resalt = 0;
        if (b == 0) {

            System.out.println("b is equals zero, please enter another number");
        } else {
             resalt = a / b;
        }
        System.out.println(resalt);
    }

}

 class main {
    public static void main ( String[] args ) {
        int i = 1;
        while (i <= 10) {
            System.out.print (i); i++;
        }
    }
}

class HW {
    public static void main (String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e){
            System.out.println ("Arithmetical exception, please enter another number");
        } finally {
            System.out.println ("Finally block is exist");
        }
        System.out.println ("Program is continue working...");
    }
}
class HW2{
    public static void main(String[] args){
        int[] mass = {1, 2, 3, 4, 5};
        try {
            int value = mass [5];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Going beyond array boundaries");
        }
    }
}