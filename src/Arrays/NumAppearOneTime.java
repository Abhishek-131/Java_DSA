package Arrays;

import java.util.HashMap;

import java.util.Map;

public class NumAppearOneTime {

    //Method Using HashMap
    public static int NumberAppearOnes(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        //Count the frequency of the number
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // return which frequency is 1
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4, 5, 5};
        int num = NumberAppearOnes(arr);
        System.out.println(num);

    }
}


//Method -2 Using xor
// 1^1 = 0
//0^0 = 0
//1^0 = 1
//0^1 = 1

