import java.time.format.SignStyle;
import java.util.*;

public class ReverseString {

    public static String ReverseString(String str) {

        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
            //ch = str.charAt(i);
            nstr = str.charAt(i) + nstr;
        }
        return nstr;
    }

    public static Boolean isPalindrome(String str) {

        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
            //ch = str.charAt(i);
            nstr = str.charAt(i) + nstr;
        }
        if (str.equals(nstr)) {
            return true;
        }
        return false;
    }

    public static String UsingStackReverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String temp = "";
        while (!stack.isEmpty()) {
            temp = temp + stack.pop();
        }

        return temp;
    }

//    public static String wapReverse(String str)
//    {
//        int low =0;
//        int high = str.length()-1;
//        while (low < high)
//        {
//            char temp;
//            temp = str.charAt(low);
//            str.charAt(low) = str.charAt(high);
//            str.charAt(high) = temp;
//            low++;
//            high--;
//        }
//        return;
//    }


    public static void main(String[] args) {
        String str = "Abhishek Kumar";
        //String reverse = ReverseString(str);
        //   System.out.println("Reverse String : " +reverse);

        // String reverse1 = UsingStackReverse(str);
        //   System.out.println( "Using Stack Reverse : "+reverse1);


        Boolean palindrome = isPalindrome(str);
        System.out.println("String is Palindrome : " + palindrome);


    }
}

