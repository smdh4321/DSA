package stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class StackLL{
    Node top;

    StackLL(){
        this.top = null;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(top == null){
            top = temp;
        }else{
            temp.next = top;
            top = temp;
        }
    }

    int pop() throws StackUnderFlowException{
        if(top == null){
            throw new StackUnderFlowException();
        }
        int t = top.data;
        top = top.next;
        return t;
    }
}
public class StackImplementedUsingLL{
    public static void main(String[] args) throws Exception{
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
