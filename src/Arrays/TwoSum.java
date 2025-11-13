package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] TwoSumProblem(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }


    public static String twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need))
                return "YES";
            map.put(arr[i], i);
        }
        return "NO";
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 7};
        int target = 9;
        int[] res = TwoSumProblem(arr, target);
        System.out.println(res[0] + "," + res[1]);


        System.out.println(twoSum(arr, target));
    }
}
