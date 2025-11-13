package Test;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        if (a < b) {
            throw new ArithmeticException("Incorrect Value");
        } else {
            System.out.println("correct Value");
        }
    }
}
