package oop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeSet;

public class CollectionsHomeWork {
    public static void main (String... args) {
        HashSet<String> HashSetColors = new HashSet<>();
        HashSetColors.add("black");
        HashSetColors.add("red");
        HashSetColors.add("white");
        System.out.println("HashSet color");
        for (String color : HashSetColors) {
            System.out.println(color);
        }
        TreeSet<String> TreeSetColors = new TreeSet<>(HashSetColors);
        System.out.println("TreeSet color");
        for (String color : TreeSetColors) {
            System.out.println(color);
        }
        HashMap<String, String> ColorCodeMap = new HashMap<>();
        ColorCodeMap.put("#000000", "black");
        ColorCodeMap.put("#FF0000", "red");
        ColorCodeMap.put("#FFFFFF", "white");
        System.out.println("HashMap code + color:");
        for (String code : ColorCodeMap.keySet()) {
            String color = ColorCodeMap.get(code);
            System.out.println(code + "" + color);
        }
    }
}
