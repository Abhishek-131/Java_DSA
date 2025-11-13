package Arrays;

public class LeftRotateByOnePlace {

    // Left RotateByOne Place
    public static void leftRotateOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        System.out.println("---------- Left Rotated By One Place -----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateOne(arr);

    }
}
