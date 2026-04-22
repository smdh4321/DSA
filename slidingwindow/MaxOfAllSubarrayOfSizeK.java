import java.util.*;

public class MaxOfAllSubarrayOfSizeK {
    static List<Integer> maxOfAllSubarrayOfSizeK(int[] arr, int k){
        List<Integer> res = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int i = 0, j = 0;

        while(j < arr.length){
            // Add current element
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                // Get max (lastKey)
                res.add(map.lastKey());

                // Remove arr[i] (sliding window)
                map.put(arr[i], map.get(arr[i]) - 1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }

                i++;
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,4,3,5,3,6,7};
        int size = 3;
        System.out.println(maxOfAllSubarrayOfSizeK(arr,size));
    }
}