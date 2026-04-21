package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegNumSizeK {
    static List<Integer> firstNegNumSizeK(int[] arr, int k){
        List<Integer> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] < 0){
                res.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }else if(j - i + 1 == k){
                if(res.size() == 0){
                    ans.add(0);
                }else{
                    ans.add(res.get(0));
                    if(arr[i] == res.get(0)){
                        res.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        List<Integer> res = firstNegNumSizeK(arr,3);
        System.out.println(res);
    }
}
