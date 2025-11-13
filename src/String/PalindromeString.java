package String;

public class PalindromeString {
    static boolean isPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abba";
        String str2 = "abcdba";

        System.out.println(str + " isPalindrome " + isPalindrome(str));

        System.out.println(str2 + " isPalindrome " + isPalindrome(str2));

    }
}
