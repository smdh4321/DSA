package recursion;

public class ReverseAnArray {
    static void revArr(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        revArr(arr, low + 1, high - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        revArr(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
