package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNoOfCharsInString {
    static void countChars(String str){
        Map<Character,Integer> lmap = new LinkedHashMap<>();
        for(int i = 0; i <  str.length(); i++){
            char ch = str.charAt(i);
            lmap.put(ch,lmap.getOrDefault(ch,0) + 1);
        }
        for(char ch : lmap.keySet()){
            System.out.println(ch + "--->"+lmap.get(ch));
        }
    }
    public static void main(String[] args) {
        String str = "Sunkara Mohammed Hussain";
        countChars(str);
    }
}
