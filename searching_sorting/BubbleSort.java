package searching_sorting;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int isSwap = 0;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = 1;
                }
            }
            if(isSwap == 0){
                break;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
    }
}
