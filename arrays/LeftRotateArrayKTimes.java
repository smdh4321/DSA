package arrays;

public class LeftRotateArrayKTimes {
    static void leftRotate(int[] nums, int k){
        k = k % nums.length;
        reverseArr(nums, nums.length - k, nums.length -1);
        reverseArr(nums,0,nums.length - k -1);
        reverseArr(nums,0, nums.length -1);
    }
    static void reverseArr(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        leftRotate(arr,k);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
