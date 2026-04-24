package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueChars {
    static int longestSubstringWithKUniqueChars(String str,int k){
        int max = 0;
        int i = 0;
        int j = 0;
        int startIndex = -1;
        Map<Character,Integer> hmap = new HashMap<>();
        while(j < str.length()){
            char ch = str.charAt(j);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            while(hmap.size() > k){
                hmap.put(str.charAt(i),hmap.getOrDefault(str.charAt(i),0)-1);
                if(hmap.get(str.charAt(i)) == 0){
                    hmap.remove(str.charAt(i));
                }
                i++;
            }
            if(hmap.size() == k){
                max = Math.max(j- i + 1,max);
                startIndex = i;
            }
            j++;
        }
        System.out.println(str.substring(startIndex,startIndex+max));
        return max;
    }
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;
        System.out.println(longestSubstringWithKUniqueChars(str,k));
    }
}
