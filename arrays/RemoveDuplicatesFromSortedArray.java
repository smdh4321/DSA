package arrays;

public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length - 1; j++){
           if(nums[i] != nums[j]){
               nums[i + 1] = nums[j];
               i++;
           }
        }
        for(int k = 0; k < nums.length; k++){
            System.out.print(nums[k]+" ");
        }
        System.out.println();
        return i + 1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
