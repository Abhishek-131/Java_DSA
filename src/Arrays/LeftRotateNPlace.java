package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateNPlace {
    public static void solver(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        if (d == 0) return;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        //shifting
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // System.out.println("Array before rotation : "+ Arrays.toString(array));
        System.out.println("Enter the number of rotation ");
        int rotation = sc.nextInt();
        solver(array, rotation);
    }
}
