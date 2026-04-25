package binarysearchproblems;

public class FloorOfAnELementInSortedArray {
    static int floorOfAnELementInSortedArray(int[] arr,int ele){
        int res = -1;
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == ele){
                return mid; // returns index
            }else if(arr[mid] < ele){
                res = mid; // stores index of floor ele
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10,10,12,14};
        int ele = 5;
        System.out.println(floorOfAnELementInSortedArray(arr,ele));
    }
}
