package Recursion;

import java.util.ArrayList;

public class SubSequences {
    private static void printSubsequence(int[] arr, int index, ArrayList<Integer> list){
        if(index == arr.length){
            System.out.println(list);
            return;
        }
        //add the curr element
        list.add(arr[index]);
        printSubsequence(arr,index+1,list);

        //Exclude the current element(backtrack)
        list.remove(list.size()-1);
        printSubsequence(arr,index+1,list);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequence(arr, 0, list);

    }
}
