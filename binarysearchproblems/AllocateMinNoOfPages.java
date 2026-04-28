package binarysearchproblems;

public class AllocateMinNoOfPages {
    static int allocateMinNoOfPages(int[] arr, int stud){
        int start = max(arr);
        int end = sum(arr);
        int res = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isValid(arr,stud,mid)){
                res = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }
    static boolean isValid(int[] arr, int stud, int mid){
        int student = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > mid){
                student++;
                sum = arr[i];
            }
            if(student > stud){
                return false;
            }
        }
        return true;
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int stud = 2;
        System.out.println(allocateMinNoOfPages(arr,stud));
    }
}
