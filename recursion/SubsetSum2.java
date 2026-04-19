package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2 {
    static void subSets(int[] arr, int index, List<Integer> res, List<List<Integer>> ans){
        ans.add(new ArrayList<>(res));
        for(int i = index; i < arr.length; i++){
            if(i != index && arr[i] == arr[i - 1]){
                continue;
            }
            res.add(arr[i]);
            subSets(arr,i+1,res,ans);
            res.remove(res.size() - 1);
        }
    }
    static List<List<Integer>> subSetSum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        subSets(arr,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subSetSum(arr);
        System.out.println(ans);
    }
}
