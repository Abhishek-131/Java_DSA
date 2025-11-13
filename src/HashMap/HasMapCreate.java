package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HasMapCreate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Abhishek", 10);
        map.put("Ganesh", 50);
        map.put("Ram", 30);

        System.out.println(map);
        System.out.println(map.remove("Ganesh"));
        System.out.println(map);
        System.out.println("HashMap Element : " + map.size());

        if (map.containsKey("Abhishek")) {
            Integer a = map.get("Abhishek");
            System.out.println("value for key " + a);
        }

        //Iterate using for each loop
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", value: " + e.getValue());
        }
    }
}
