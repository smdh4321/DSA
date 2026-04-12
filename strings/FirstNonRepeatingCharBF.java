package strings;

public class FirstNonRepeatingCharBF {
    static char firstNonRepeatingCharBF(String str){
        char c = '\0';
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean isRepeated = true;
            for(int j = 0; j < str.length(); j++){
                if(i!=j && ch == str.charAt(j)){
                    isRepeated = false;
                }
            }
            if(isRepeated){
                c = ch;
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
