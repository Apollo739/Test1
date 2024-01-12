package house;

public class House {
   public static void main(String [] args) {

    Citchen citchen = new Citchen(2);
    citchen.windowCount = 2;
    citchen.furniture = "table";

    citchen.name = "citchen";
    System.out.println(citchen.toString());
    System.out.println(citchen.doorCount);
}}
