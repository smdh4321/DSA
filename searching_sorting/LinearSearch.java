package searching_sorting;

public class LinearSearch {
    static int linearSearch(int[] arr, int ele){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,3};
        int searchEle = 6;
        System.out.println(linearSearch(arr,searchEle));
    }
}
