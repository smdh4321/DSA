package binarysearchproblems;

public class PeakElement {
    static int peakElement(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(mid > 0 &&  mid < arr.length - 1){
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    return mid;
                }else if(arr[mid] < arr[mid - 1]){
                    j = mid - 1;
                }else{
                    i = mid + 1;
                }
            }else if(mid == 0){
                if(arr[0] > arr[1]){
                    return 0;
                }else{
                    return 1;
                }
            }else if(mid == arr.length - 1){
                if(arr[arr.length - 1] > arr[arr.length - 2]){
                    return arr.length - 1;
                }else{
                    return arr.length - 2;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {20,10,5,2};
        System.out.println(peakElement(arr));
    }
}
