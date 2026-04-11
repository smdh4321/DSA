package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j != (i + 1) && nums[j] == nums[j - 1]) {
                    continue;
                }
                int low = j + 1;
                int high = nums.length - 1;
                long sum = (long) target - nums[i] - nums[j];
                while (low < high) {
                    long twoSum = (long) nums[low] + nums[high];
                    if (twoSum < sum) {
                        low++;
                    } else if (twoSum > sum) {
                        high--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> res = fourSum(arr,target);
        System.out.println(res);
    }
}
