package arrays;

import java.util.ArrayList;

public class SmallestEleFromLeftSide {
    static ArrayList<Integer> smallestEleFromLeftSide(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i - 1; j >= 0; j--){
                if(arr[i] > arr[j]){
                    min = Math.min(min,arr[j]);
                }
            }
            if(min != Integer.MAX_VALUE){
                res.add(min);
            }else{
                res.add(-1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,3,12,9};
        ArrayList<Integer> res = smallestEleFromLeftSide(arr);
        System.out.println(res);
    }
}
