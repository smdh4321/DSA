package slidingwindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurencesOfAnagram {
    static int countOccurencesOfAnagram(String str,String pattern){
        int res = 0;
        Map<Character,Integer> freq = frequency(pattern);
        int count = freq.size();
        int k = pattern.length();
        int i = 0;
        int j = 0;
        while(j < str.length()){
            char ch = str.charAt(j);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)-1);
                if(freq.get(ch) == 0){
                    count--;
                }
            }
            if(j - i + 1 < k){
                j++;
            }else if(j - i + 1 == k){
                if(count == 0){
                    res++;
                }
                if(freq.containsKey(str.charAt(i))){
                    if(freq.get(str.charAt(i)) == 0){
                        count++;
                    }
                    freq.put(str.charAt(i),freq.get(str.charAt(i))+1);
                }
                i++;
                j++;
            }
        }
        return res;
    }
    static Map<Character,Integer> frequency(String pattern){
        Map<Character,Integer> lmap = new LinkedHashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            lmap.put(pattern.charAt(i),lmap.getOrDefault(pattern.charAt(i),0)+1);
        }
        return lmap;
    }
    public static void main(String[] args) {
        String str = "aacbabaaba";
        String pattern = "aaba";
        System.out.println(countOccurencesOfAnagram(str,pattern));
    }
}
