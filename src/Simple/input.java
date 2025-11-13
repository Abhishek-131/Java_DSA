package Simple;

import java.text.DecimalFormat;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        float avg = 0;
        DecimalFormat obj = new DecimalFormat("#.##");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Day " + i + " duration is: ");
            int num = sc.nextInt();
            total += num;
        }
        obj.format(avg = total / 7);
        System.out.println("Total duration is: " + total);
        System.out.printf("Average is: %.3f", avg);
    }
}
