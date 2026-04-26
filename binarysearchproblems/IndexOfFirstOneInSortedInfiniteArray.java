package binarysearchproblems;

public class IndexOfFirstOneInSortedInfiniteArray {
    static int findingIndexOfStartAndEnd(int[] arr,int key){
        int res = -1;
        int i = 0;
        int j = 1;
        while(arr[j] < key){
            i = j;
            j =  j * 2;
        }
        res = indexOfFirstOneInSortedInfiniteArray(arr,key,i,j);
        return res;
    }
    static int indexOfFirstOneInSortedInfiniteArray(int[] arr,int key,int i, int j){
        int res = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == key){
                res = mid;
                j = mid - 1;
            }else if(arr[mid] < key){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1};
        int key = 1;
        System.out.println(findingIndexOfStartAndEnd(arr,key));
    }
}
