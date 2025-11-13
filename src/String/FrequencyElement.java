package String;


import javax.swing.text.AttributeSet;
import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {
    public static void frequency(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }
        //print the frequency------------
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Abhishek Kumar";
        frequency(str);
    }
}
