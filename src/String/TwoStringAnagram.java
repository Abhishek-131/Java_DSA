package String;

import java.util.Arrays;

public class TwoStringAnagram {

    public static boolean areAnagram(String s1, String s2) {
        char[] str = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str2);

        return Arrays.equals(str, str2);
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "baa";
        TwoStringAnagram anagram = new TwoStringAnagram();
        if (anagram.areAnagram(s1, s2)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
