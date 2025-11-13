package Arrays;

import java.util.HashSet;

public class UnionOfTwoSortedArr {

    // Method Using HashSet
    public static void UniorArray(int[] arr1, int[] arr2) {
        HashSet<Integer> union = new HashSet<>();

        for (int x : arr1) union.add(x);

        for (int x : arr2) union.add(x);

        for (int u : union) {
            System.out.print(u + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 7, 9, 11};
        int[] arr2 = {3, 4, 6, 8, 10};

        UniorArray(arr1, arr2);
    }
}
