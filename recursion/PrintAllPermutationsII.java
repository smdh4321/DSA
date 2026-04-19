package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsII {
    static void permutations(int[] arr,int index,List<List<Integer>> ans){
        if(index == arr.length){
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                res.add(arr[i]);
            }
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = index; i < arr.length; i++){
            swap(arr,i,index);
            permutations(arr,index + 1,ans);
            swap(arr,i,index);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static List<List<Integer>> printAllPermutaions(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        permutations(arr,0,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = printAllPermutaions(arr);
        System.out.println(ans);
    }
}
