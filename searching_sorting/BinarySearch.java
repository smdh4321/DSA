package searching_sorting;

public class BinarySearch {
    static int binarySearch(int[] arr,int ele){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] == ele){
                return mid + 1;
            }else if(arr[mid] < ele){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10};
        int ele = 7;
        System.out.println(binarySearch(arr,ele));
    }
}
