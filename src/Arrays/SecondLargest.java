package Arrays;

public class SecondLargest {

    //Method - 1
    public static int SecondLargestElement(int[] arr) {
        int largeEle = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //First find the largest then find then find the secondLargest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeEle) {
                largeEle = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largeEle) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    //Method-2  TC : O(N)  & SC: O(1)
    public static int secondLargest(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                secondLargest = largestElement;
                largestElement = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largestElement) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 712, 34, 567, 1};

        //method-1
        System.out.println(SecondLargestElement(arr));

        //method-2  --- Optimal Approch
        System.out.println(secondLargest(arr));
    }
}
