package arrays;

public class LargestElement {
    static int largestEle(int[] nums){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {5,6,3,2,1,7};
        System.out.println(largestEle(nums));
    }
}
