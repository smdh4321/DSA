package arrays;

import java.util.ArrayList;

public class StockSpan {
    static ArrayList<Integer> stockSpan(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int count  = 1;
            for(int j = i; j >= 0; j--){
                if(i != j && arr[i] > arr[j]){
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {12,14,10,15,6,10};
        ArrayList<Integer> res = stockSpan(arr);
        System.out.println(res);
    }
}
