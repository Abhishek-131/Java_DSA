package Arrays;

public class MaxConsecutiveOne {
    public static int MaxConsecutive(int[] arr) {
        int cnt = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                cnt++;
            else
                cnt = 0;
            if (cnt > res)
                res = cnt;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1};
        int n = MaxConsecutive(arr);
        System.out.println(n);
    }
}

