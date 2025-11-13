package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    // Method 1-----------------------
    public static boolean Anagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase(); //replace all the spaces and convert in lower case
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;
    }

    //Method 2-----------------------
    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!hm.containsKey(ch)) return false;
            hm.put(ch, hm.get(ch) - 1);
            if (hm.get(ch) == 0) hm.remove(ch);
        }

        return hm.isEmpty();
    }


    public static void main(String[] args) {
        String str1 = "Abhi";
        String str2 = "abhi";

        // boolean ans = Anagram(str1,str2);
        boolean ans = isAnagram(str1, str2);
        System.out.println(ans);
    }
}
