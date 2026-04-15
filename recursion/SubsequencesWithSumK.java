package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesWithSumK {
    static void subsequencesWithSumK(int[] arr, int sum, int auxSum,int index,List<Integer> res){
        if(index == arr.length){
            if(auxSum == sum){
                System.out.println(res);
            }
            return;
        }
        res.add(arr[index]);
        auxSum += arr[index];
        subsequencesWithSumK(arr,sum,auxSum,index + 1,res);
        res.remove(res.size() -  1);
        auxSum -= arr[index];
        subsequencesWithSumK(arr,sum,auxSum,index + 1,res);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 2;
        int index = 0;
        int auxSum = 0;
        List<Integer> res = new ArrayList<>();
        subsequencesWithSumK(arr,sum,auxSum,index,res);
    }
}
