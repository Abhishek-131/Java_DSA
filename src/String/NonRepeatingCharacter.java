package String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void NonRepeat(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);// find frequency of the character
        }
        //print Non-repeating character
        System.out.println("Print Non-repeating character : ");
        for (char ch : str.toCharArray()) {
            if (hm.get(ch) == 1) {
                System.out.print(ch + ", ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "abhishek";
        NonRepeat(str);
    }
}
