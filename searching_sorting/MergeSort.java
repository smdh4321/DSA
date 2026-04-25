package searching_sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    static void mergeSort(int[] arr, int low,int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr,low, mid);
        mergeSort(arr, mid + 1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i + low] = temp.get(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr,low,high);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
