package String;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternateString {
    public static ArrayList<String> Alter(String str1, String str2) {
        ArrayList<String> str = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (i == j) {
                str.add(str1);
                str.add(str2);
            }
        }
        while (i < str1.length()) {
            str.add(str1);
        }
        while (j < str2.length()) {
            str.add(str2);
        }
        return str;
    }

    public static void main(String[] args) {
        String str1 = "abhishek";
        String str2 = "monu";
        System.out.println(str1);
        ArrayList<String> ans = Alter(str1, str2);
        System.out.println(ans);
    }
}
