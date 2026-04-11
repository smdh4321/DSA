package arrays;

public class SecondLargestELe {
    static int secondLargestEle(int[] nums){
        int secLargest = Integer.MIN_VALUE;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >  max){
                secLargest = max;
                max = nums[i];
            }
            else if(secLargest < nums[i] && nums[i] != max){
                secLargest = nums[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12,3,4,2,9,5};
        System.out.println(secondLargestEle(arr));
    }
}
