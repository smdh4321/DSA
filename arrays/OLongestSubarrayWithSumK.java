package arrays;

public class OLongestSubarrayWithSumK {
    static int longestSubarrayWithSumK(int[] arr,int k){
        int maxLen = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < arr.length){
            sum += arr[j];
            if(sum == k){
                maxLen = Math.max(maxLen, j - i + 1);
            }while(i <= j && sum > k){
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,0,0,1,1,1,4,2,3};
        int k = 6;
        System.out.println(longestSubarrayWithSumK(arr,k));
    }
}
