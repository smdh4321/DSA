package binarysearchproblems;

public class NumberOfTimesASortedArrayIsRotated {
    static int numberOfTimesASortedArrayIsRotated(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            if(arr[i] <= arr[j]){
                return i;
            }
            int mid = i + (j - i)/2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }else if(arr[i] <= arr[mid]){
                i = mid + 1;
            }else if(arr[mid] <= arr[j]){
                j = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18,2,5,6,8,11,12,15};
        System.out.println(numberOfTimesASortedArrayIsRotated(arr));
    }
}
