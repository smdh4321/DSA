package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachEleInArray {
    static void frequencyOfEachEle(int[] arr){
        Map<Integer,Integer> lmap = new LinkedHashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(lmap.containsKey(arr[i])){
                lmap.put(arr[i],lmap.get(arr[i]) + 1);
            }else{
                lmap.put(arr[i],1);
            }
        }
        for(int item : lmap.keySet()){
            System.out.println(item + " ->"+lmap.get(item));
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,2,1,4,5,6,7};
        frequencyOfEachEle(arr);
    }
}
