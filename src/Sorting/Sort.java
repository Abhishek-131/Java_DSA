package Sorting;

public class Sort {
    static int[] Selection_Sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    //
//    static int[] Bubble_Sort(int arr[], int n){
//
//    }
    public static void main(String[] args) {
        int arr[] = {12, 23, 8, 45, 6};
        int n = arr.length;
        System.out.println("Before Sorting : ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

        Selection_Sort(arr, n);

        System.out.println("After Sorting : ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }
}
