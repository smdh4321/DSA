package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void findCombinations(int[] arr,int target,int i,List<Integer> res,List<List<Integer>> ds){
        if(i == arr.length){
            if(target == 0){
                ds.add(new ArrayList<>(res));
            }
            return;
        }
        if(target >= arr[i]){
            res.add(arr[i]);
            findCombinations(arr,target - arr[i],i,res,ds);
            res.remove(res.size() - 1);
        }
        findCombinations(arr,target,i + 1,res,ds);
    }
    static List<List<Integer>> combinationSum(int[] arr, int target){
        List<List<Integer>> ds = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        findCombinations(arr,target,0,res,ds);
        return ds;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinationSum(arr,target);
        System.out.println(ans);
    }
}
