package binarysearchproblems;

public class NextAlphabeticalElement {
    static char nextAlphabeticalElement(char[] str,char ch){
        char res = str[0];
        int i = 0;
        int j = str.length - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(str[mid] <= ch){
                i = mid + 1;
            }else{
                res = str[mid];
                j = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        char[] str = {'a','c','f','h'};
        char ch = 'f';
        System.out.println(nextAlphabeticalElement(str,ch));
    }
}
