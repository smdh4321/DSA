package binarysearchproblems;

public class FindPosOfEleInInfiniteSortedArray {
    static int findPosOfEleInInfiniteSortedArray(int[] arr,int ele){
        int i = 0;
        int j = 1;
        while(ele > arr[j]){
            i = j;
            j = j * 2;
        }
        int res = binarySearch(arr,ele,i,j);
        return res;
    }
    static int binarySearch(int[] arr,int ele,int i,int j){
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == ele){
                return mid;
            }else if(arr[mid] < ele){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int ele = 7;
        System.out.println(findPosOfEleInInfiniteSortedArray(arr,ele));
    }
}
