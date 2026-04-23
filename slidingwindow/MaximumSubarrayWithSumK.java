package slidingwindow;

public class MaximumSubarrayWithSumK {
    static int maximumSubarrayWithSumk(int[] arr,int sumK){
        int res = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < arr.length){
            sum += arr[j];
            while(sum > sumK){
                sum -= arr[i];
                i++;
            }
            if(sum == sumK){
                res = Math.max(res, j - i + 1);
            }
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,1,1,2,3,5};
        int sumK = 5;
        System.out.println(maximumSubarrayWithSumk(arr,sumK));
    }
}
