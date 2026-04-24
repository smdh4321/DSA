package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    static int longestSubstringWithoutRepeatingChars(String str){
        int res = 0;
        int i = 0;
        int j = 0;
        int startIndex = -1;
        Map<Character,Integer> hmap = new HashMap<>();
        while(j < str.length()){
            hmap.put(str.charAt(j),hmap.getOrDefault(str.charAt(j),0)+1);
            while(hmap.size() < j - i + 1){
                hmap.put(str.charAt(i),hmap.getOrDefault(str.charAt(i),0)-1);
                if(hmap.get(str.charAt(i)) == 0){
                    hmap.remove(str.charAt(i));
                }
                i++;
            }
            if(hmap.size() == j - i + 1){
                res = Math.max(j - i + 1,res);
                startIndex = i;
            }
            j++;
        }
        System.out.println(str.substring(startIndex,startIndex+res));
        return res;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestSubstringWithoutRepeatingChars(str));
    }
}
