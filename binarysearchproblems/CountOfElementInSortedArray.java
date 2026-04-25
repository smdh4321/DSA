package binarysearchproblems;

public class CountOfElementInSortedArray {
    static int findOccurences(int[] arr,int ele,boolean isLeft){
        int idx = -1;
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] == ele){
                idx = mid;
                if(isLeft){
                    j = mid - 1;
                }else{
                    i = mid + 1;
                }
            }else if(arr[mid] < ele){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,10,10,10,18,20};
        int ele = 25;
        int leftSide = findOccurences(arr,ele,true);
        int rightSide = findOccurences(arr,ele,false);
        if(leftSide == -1 || rightSide == -1){
            System.out.println(0);
        }else{
            System.out.println(rightSide - leftSide + 1);
        }
    }
}
