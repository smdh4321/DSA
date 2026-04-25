package searching_sorting;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,1,4,3,9,5};
        insertionSort(arr);
    }
}
