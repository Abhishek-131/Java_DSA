package Pattern;

public class TriangleDown {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            //start
            for (int j=0; j<2*5-(2*i+1); j++){
                System.out.print("*");
            }
            //space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
