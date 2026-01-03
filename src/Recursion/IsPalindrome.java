package Recursion;

public class IsPalindrome {
    private static boolean Palindrome(int i,String str){
        int n = str.length();
        if(i<=n/2) ;
        char[] ch = str.toCharArray();
        if(ch[i] != ch[n-i-1]) return false;
        return Palindrome(i+1,str);
    }
    public static void main(String[] args) {
        String str = "MADSM";
        boolean res = Palindrome(0,str);
        System.out.println(res);

    }
}
