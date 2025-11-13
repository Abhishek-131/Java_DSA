package Arrays;

public class LargestElement {
    //Largest Element
    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Smallest Element
    public static int smallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, -5, -12, 34, 4, 67};
        int large = largestElement(arr);
        System.out.println(large);

        int minEle = smallestElement(arr);
        System.out.println(minEle);
    }
}
