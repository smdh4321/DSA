package recursion;

public class BinarySearch {
    static int binarySearch(int[] arr,int ele,int l, int r){
        if(l > r){
            return -1;
        }

        int mid = l + (r - l) / 2;
        if(arr[mid] > ele){
            return binarySearch(arr,ele,l,mid - 1);
        }else if(arr[mid] < ele){
            return binarySearch(arr,ele,mid + 1,r);
        }else{
            return mid;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int ele = 6;
        System.out.println(binarySearch(arr,ele,0,arr.length - 1));
    }
}
