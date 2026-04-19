package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations {
    static void permutations(int[] arr,List<List<Integer>> ans, List<Integer> res,boolean[] used){
        if(res.size() == arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!used[i]){
                used[i] = true;
                res.add(arr[i]);
                permutations(arr,ans,res,used);
                res.remove(res.size() - 1);
                used[i] = false;
            }
        }
    }
    static List<List<Integer>> printAllPermutations(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        permutations(arr,ans,new ArrayList<>(),used);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans =printAllPermutations(arr);
        System.out.println(ans);
    }
}


//Time Complexity  : O(n! * n)
//Space Complexity : O(n)