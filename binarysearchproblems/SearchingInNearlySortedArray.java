package binarysearchproblems;

public class SearchingInNearlySortedArray {
    static int searchingInNearlySortedArray(int[] arr,int ele){
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length;
        while(i <= j){
            int mid = i + (j - i) / 2;

            if(arr[mid] == ele){
                return mid;
            }
            if(mid - 1 >= i && arr[mid - 1] == ele){
                return mid - 1;
            }
            if(mid + 1 <= j && arr[mid + 1] == ele){
                return mid + 1;
            }

            if(arr[mid] < ele){
                i = mid + 2;
            }else{
                j = mid - 2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,30,20,40};
        int ele = 20;
        System.out.println(searchingInNearlySortedArray(arr,ele));
    }
}
