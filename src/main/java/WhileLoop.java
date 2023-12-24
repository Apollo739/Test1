public class WhileLoop {

    public static void main(String[] args) {
        //for applying for data srtucters with index
        //foreach 

        //while 

        int a = 7;
        int b = 7;

        while (a < b){
            a *=7; // 7+ 7 + 7 + ... =98
            System.out.println(a);
        }

        do {
            a +=7;
            System.out.println(a);
        }
        while(a < b);
    }
}