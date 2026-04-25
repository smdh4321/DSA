package searching_sorting;

public class QuickSort {
    static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pIndex = partition(arr,low,high);
            quickSort(arr,low,pIndex - 1);
            quickSort(arr,pIndex + 1,high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int left = low;
        int right = high;
        while(left < right){
            while(left < high && arr[left] <= pivot){
                left++;
            }
            while(right > low && arr[right] > pivot){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;
        return right;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low,high);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
