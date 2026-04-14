package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {
    static void printAllSubsequence(int[] arr,int i,List<Integer> res){
        if(i == arr.length){
            System.out.println(res);
            return;
        }
        res.add(arr[i]);
        printAllSubsequence(arr,i + 1, res);
        res.remove(res.size() - 1);
        printAllSubsequence(arr, i + 1, res);
    }
    public static void main(String[] args) {
        int[] arr  = {3,1,2};
        List<Integer> res = new ArrayList<>();
        printAllSubsequence(arr,0,res);
    }
}
