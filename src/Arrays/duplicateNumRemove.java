package Arrays;

import java.util.*;
import java.util.Scanner;

public class duplicateNumRemove {

    //Using HashSet Method-1 TC: O(N*log n))+O(N)
    public static int RemoveDuplicate(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : arr) {
            hs.add(x);
        }
        int size = hs.size();
        int i = 0;
        for (int x : hs) {
            arr[i] = x;
            i++;
        }
        return size;
    }


    //Method -2 TC; O(N)
    public static int removeDuplicate(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 5, 6};

        // int k = RemoveDuplicate(arr);

        int k2 = removeDuplicate(arr);

        for (int i = 0; i < k2; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
