package matrices;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] arr){
        List<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                res.add(arr[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res.add(arr[i][right]);
            }
            right--;

            if(!(top <= bottom && left <= right)){
                break;
            }

            for(int i = right; i>= left; i--){
                res.add(arr[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                res.add(arr[i][left]);
            }
            left++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> res = spiralOrder(arr);
        System.out.println(res);
    }
}
