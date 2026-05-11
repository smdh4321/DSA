package stack;

import java.util.Stack;

public class BalancedParenthesis {
    static boolean balancedParenthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }else if(!st.isEmpty() && (ch == ']' && st.peek() == '['
                    || ch == '}' && st.peek() == '{'
                    || ch == ')' && st.peek() == '(')){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(balancedParenthesis(str));
    }
}
