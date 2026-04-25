package binarysearchproblems;

public class FindAnElementInRotatedSortedArray {
    static int findAnElementInRotatedSortedArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length;
        while(i <= j){
            if(arr[i] <= arr[j]){
                return i;
            }
            int mid = i + (j - i)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }else if(arr[i] <= arr[mid]){
                i = mid + 1;
            }else if(arr[mid] <= arr[j]){
                j = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int ele,int start,int end){
        int i =  start;
        int j = end;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] == ele){
                return mid;
            }else if(arr[mid] < ele){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {11,12,15,18,2,5,6,8};
        int ele = 15;
        int min = findAnElementInRotatedSortedArray(arr);
        int bs1 = binarySearch(arr,ele,0,min - 1);
        int bs2 = binarySearch(arr,ele,min,arr.length-1);
        int res = -1;
        if(bs1 != -1){
            res = bs1;
        }else if(bs2 != -1){
            res = bs2;
        }
        System.out.println(res);
    }
}
