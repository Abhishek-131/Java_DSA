package Recursion;

public class FibonacciNumber {
    private static int Fib(int num){
        if(num<2)
            return num;
        int last = Fib(num-1);
        int slast = Fib(num-2);
        return last+slast;
    }
    public static void main(String[] args) {
        int num = 4;
        int ans = Fib(num);
        System.out.println(ans);
    }
}
 //TC: o(2^n) nearby