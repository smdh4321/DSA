package binarysearchproblems;

public class MinimumDiffEleInSortedArray {
    static int minimumDiffEleInSortedArray(int[] arr,int key){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == key){
                return arr[mid];
            }else if(arr[mid] < key){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }

        // Edge cases
        if(i >= arr.length) return arr[j];
        if(j < 0) return arr[i];

        if(Math.abs(arr[i] - key) < Math.abs(arr[j] - key)){
            return arr[i];
        }else{
            return arr[j];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,8,10,15};
        int key = 12;
        System.out.println(minimumDiffEleInSortedArray(arr,key));
    }
}
