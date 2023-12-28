package core;

import java.util.Arrays;

public class Loops {

    public static void main(String[] args) {
        String[] array = {"String 1", "String 2", "String 3"}; // length = 3
        String[] array2 = new String[4]; // length = 4
        String array3 = "String";
        int[] numbers = {1, 2, 3, 4, 5,};

        // List subjects: Math, Literature, IT, Biology
        String math = "Math";
        String lit = "Literature";
        String it = "IT";
        String bio = "Biology";

        String[] subjects = {"Math", "Literature", "IT", "Biology"};
        int size = subjects.length;
//        System.out.println(subjects[0]);

//        for(int i = 0; i < subjects.length; i++) {
//            if(subjects[i].equals("Literature")) {
//                System.out.println(i);
//            }else {
//                System.out.println("subject is not Literature");
//            }
//        }

        for(String item: subjects) { //foreach
            if(item.equals("Math")) {
                System.out.println("Math is here");
            }
        }

//       System.out.println(Arrays.toString(subjects));
    }
}
