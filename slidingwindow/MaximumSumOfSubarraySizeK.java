package slidingwindow;

public class MaximumSumOfSubarraySizeK {
    static int maxSumSubarray(int[] arr,int k){
        int maxSum = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        while(j < arr.length){
            sum += arr[j];
            if((j - i + 1) == k){
                if(maxSum < sum){
                    maxSum = sum;
                }
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,9,7,1};
        int k = 3;
        System.out.println(maxSumSubarray(arr,k));
    }
}
