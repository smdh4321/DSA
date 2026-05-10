package stack;

import java.util.ArrayList;


class StackUnderFlowException extends  Exception{
    StackUnderFlowException(){
        super("Stack is empty");
    }
}
class Stack{
    ArrayList list;
    int top;
    Stack(){
        list = new ArrayList<Integer>();
        top = -1;
    }

    void push(int ele){
        list.add(ele);
    }

    int pop() throws StackUnderFlowException{
        if(list.size() == 0){
            throw new StackUnderFlowException();
        }
        int lastIdx =  list.size() - 1;
        int t = (Integer) list.get(lastIdx);
        list.remove(lastIdx);
        return t;
    }
}
public class Main {
    public static void main(String[] args) throws  Exception{
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
