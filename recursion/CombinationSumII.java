package recursion;

import java.util.*;

public class CombinationSumII {

    static void findCombinations(int[] arr, int start, int target, List<List<Integer>> ans, List<Integer> res) {
        if (target == 0) {
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            // Skip duplicates
            if (i > start && arr[i] == arr[i - 1]) continue;
            // Stop if exceeds target
            if (arr[i] > target) break;

            res.add(arr[i]);
            findCombinations(arr, i + 1, target - arr[i], ans, res);
            res.remove(res.size() - 1);
        }
    }

    static List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(arr, 0, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        int target = 4;
        List<List<Integer>> ans = combinationSum2(arr, target);
        System.out.println(ans);
    }
}