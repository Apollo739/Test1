import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

    public static void main(String... args) {
        //List {ArrayList}
        int[] mass = {1, 4};
        int a = mass[0];
        mass[0] = 6;
        Arrays.toString(mass);
        Arrays.sort(mass);

        List<Integer> array = new ArrayList<>();
        array.add(1); //adding
        array.add(1);
        //        System.out.println(array.get(0)); //read
        array.add(1);
        array.set(0, 9); //change
        array.remove(1);
        array.clear();
        java.util.Collections.sort(array);
        //        for (Integer value: array) {
        //            System.out.println(value);
        //        }

        //Set
        Set<String> stringSet = new HashSet<>(); //inorder set
        Set<String> stringSetOrder = new TreeSet<>(); //order set
        stringSetOrder.add("String6");
        stringSetOrder.add("String0");
        stringSetOrder.add("String8");
        System.out.println(stringSetOrder.size());
        stringSetOrder.add("String8");
        System.out.println(stringSetOrder.size());
        stringSetOrder.remove("String0");
//        stringSetOrder.clear();
//        System.out.println(stringSetOrder.contains("String8"));
//        for (String value : stringSetOrder) {
//            System.out.println(value);
//        }

        //Map <key, value>
        // save user credentials (login/password)
        Map<String, String> userCredentials = new HashMap();
        userCredentials.put("login", "password"); //adding
        userCredentials.put("tatyana", "mypassword");
        userCredentials.put("login", "90899887");
        userCredentials.size();
//        System.out.println(userCredentials);
//        System.out.println(userCredentials.keySet());
//        System.out.println(userCredentials.values());

        List<String>color = new ArrayList<>();
        color.add("white");
        color.add("red");
        color.add("black");
        System.out.println(color.get(2));
    }
}
