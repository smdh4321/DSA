package binarysearchproblems;

public class SearchElementInBitonicArray {
    static int findPeakEle(int[] arr){
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
    static int binarySearch(int[] arr,int key,int i, int j){
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return - 1;
    }

    static int binarySearchDesc(int[] arr, int key, int i, int j){
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                j = mid - 1; // reverse direction
            }else{
                i = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,8,12,4,2};
        int key = 4;
        int peak = findPeakEle(arr);
        int left = binarySearch(arr, key, 0, peak);
        if(left != -1){
            System.out.println(left);
            return;
        }
        int right = binarySearchDesc(arr, key, peak + 1, arr.length - 1);
        System.out.println(right);
    }
}
