package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceCountWithSumK {
    static int subseqCount(int[] arr,int i,int sum,int auxSum){
        if(i == arr.length){
            if(sum == auxSum){
                return 1;
            }
            return 0;
        }

        auxSum += arr[i];
        int l = subseqCount(arr,i+1,sum,auxSum);
        auxSum -= arr[i];
        int r = subseqCount(arr,i+1,sum,auxSum);

        return l + r;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int count = 0;
        int index = 0;
        int sum = 2;
        int auxSum = 0;
        System.out.println(subseqCount(arr,index,sum,auxSum));
    }
}
