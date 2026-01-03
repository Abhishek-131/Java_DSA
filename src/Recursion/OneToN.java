package Recursion;

public class OneToN {
    private static void NNumber(int n){
        int i = 0;
     if(i>n) return ;
     System.out.println(i);
     NNumber(n-1);

    }
    public static void main(String[] args) {
        int n = 10;
        NNumber(n);
    }
}
