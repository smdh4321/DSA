package stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    static String convertToPostfix(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    char temp = st.pop();
                    sb.append(temp);
                }
                st.pop();
            }else{
                if(!st.isEmpty() && precedence(ch) > precedence(st.peek())){
                    st.push(ch);
                }else{
                    while(!st.isEmpty() && precedence(ch) <= precedence(st.peek())){
                        char temp = st.pop();
                        sb.append(temp);
                    }
                    st.push(ch);
                }
            }
        }

        while(!st.isEmpty()){
            char temp = st.pop();
            sb.append(temp);
        }

        return sb.toString();
    }
    static int precedence(char ch){
        if(ch == '^'){
            return 3;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if(ch == '+' || ch == '-'){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Infix Expression :- ");
        String str = sc.nextLine();
        String res = convertToPostfix(str);
        System.out.println(res);
    }
}
