package binarysearchproblems;

import java.util.ArrayList;
import java.util.List;

public class SearchIn2DMatrix {
    static List<Integer> searchIn2DMatrix(int[][] arr,int ele){
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = arr[0].length - 1;
        while(i <= arr.length - 1 && j >= 0){
            if(arr[i][j] == ele){
                res.add(i);
                res.add(j);
                return res;
            }else if(arr[i][j] > ele){
                j--;
            }else{
                i++;
            }
        }
        res.add(-1);
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                {15,25,35,45},
                {20,29,42,50},
                {33,44,55,66}};
        int ele = 29;
        List<Integer> res = searchIn2DMatrix(arr,ele);
        System.out.println(res);
    }
}
