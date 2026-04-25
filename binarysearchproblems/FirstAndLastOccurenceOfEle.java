package binarysearchproblems;

public class FirstAndLastOccurenceOfEle {
    static int findOccurence(int[] arr,int ele,boolean isFirst){
        int i = 0;
        int j = arr.length - 1;
        int startIdx = -1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] == ele){
                startIdx = mid;
                if(isFirst){
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
        return startIdx;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,18,20};
        int ele = 10;
        int startIdx = findOccurence(arr,ele,true);
        int endIdx = findOccurence(arr,ele,false);
        System.out.println("Start Index = "+ startIdx+" End Index = " +endIdx);
    }
}
