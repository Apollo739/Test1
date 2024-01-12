package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oop.Human;

public class MainClass {

    public static void main(String[] arg) {
        String[] mass = {"String1", "String2", "String3"};
        int[] intMass = {1,2,3};
        String val1 = mass[0];
        System.out.println("Length of mass is " + mass.length);
        System.out.println("Mass[0] is " + val1);

        List<String> array = new ArrayList<>();
        List<Integer> integerMass = new ArrayList<>();
        array.add("Val1");
        array.add("Val2");
        System.out.println("Size of array is " + array.size());
        System.out.println("Second element is " + array.get(1));

        array.clear();
//        array.set(0, "Value1");
//        System.out.println("Firs element is " + array.get(0));
        array.addAll(List.of(mass));
        System.out.println("All elements of array are " + Arrays.toString(new List[] {array}));

        Integer[] intMas = {1, 2, 3};
        List<Integer> intList = new ArrayList<>();
        intList.addAll(List.of(intMas));
        System.out.println("All elements of array are " + Arrays.toString(new List[] {intList}));

    }

}
