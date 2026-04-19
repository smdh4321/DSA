package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum1 {
    static void subsetSum(int[] arr, int i,int sum,List<Integer> ans){
        if(i == arr.length){
            ans.add(sum);
            return;
        }

        sum += arr[i];
        subsetSum(arr, i + 1,sum,ans);
        sum -= arr[i];
        subsetSum(arr, i + 1,sum,ans);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int sum = 0;
        List<Integer> ans = new ArrayList<>();
        subsetSum(arr,0,sum,ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
