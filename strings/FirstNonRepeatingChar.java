package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    static char firstNonRepeatingCharBF(String str){
        char c = '\0';
        Map<Character,Integer> lmap = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            lmap.put(str.charAt(i), lmap.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(char item : lmap.keySet()){
            if(lmap.get(item) == 1){
                c = item;
                break;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str = "HuHssain";
        System.out.println(firstNonRepeatingCharBF(str));
    }
}
