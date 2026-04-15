package recursion;

import java.util.ArrayList;
import java.util.List;

public class FirstSubsequenceWithSumK {

    static boolean firstSubsequencesWithSumK(int[] arr, int sum, int auxSum, int index, List<Integer> res){
        if(index == arr.length){
            if(auxSum == sum){
                System.out.println(res);
                return true;
            }
            return false;
        }
        res.add(arr[index]);
        auxSum += arr[index];
        if(firstSubsequencesWithSumK(arr,sum,auxSum,index + 1,res)){
            return true;
        }
        res.remove(res.size() -  1);
        auxSum -= arr[index];
        if(firstSubsequencesWithSumK(arr,sum,auxSum,index + 1,res)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 2;
        int index = 0;
        int auxSum = 0;
        List<Integer> res = new ArrayList<>();
        firstSubsequencesWithSumK(arr,sum,auxSum,index,res);
    }
}
