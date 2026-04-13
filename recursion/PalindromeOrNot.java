package recursion;

public class PalindromeOrNot {
    static boolean palindrome(String str,int i){
        if(i >= str.length() / 2 ){
            return true;
        }else if(str.charAt(i) != str.charAt(str.length() - i - 1)){
            return false;
        }
        return palindrome(str, i + 1);
    }
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(palindrome(str, 0));
    }
}
