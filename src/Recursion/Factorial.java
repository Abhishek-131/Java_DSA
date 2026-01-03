package Recursion;

public class Factorial {
    private static int Fact(int n){
        if(n==1 || n== 0) return 1;
        int smallAns = Fact(n-1);
        return n * smallAns;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = Fact(n);
        System.out.println(ans);

    }
}
