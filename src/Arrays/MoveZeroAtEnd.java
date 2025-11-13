package Arrays;

import java.util.ArrayList;

public class MoveZeroAtEnd {
    public static int[] ZeroAtEnd(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        //add all the non-zero into arraylist
        for (int x : arr) {
            if (x != 0) ans.add(x);
        }

        int nonZero = ans.size();
        //copy all nox-zero element from ArrayList to Original-Array
        for (int i = 0; i < nonZero; i++) {
            arr[i] = ans.get(i);
        }

        //fill Rest element with zero
        for (int i = nonZero; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 0, 4, 0, 6, 9};

        int[] ans = ZeroAtEnd(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ", ");

        }

    }
}
