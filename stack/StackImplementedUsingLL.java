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
    int size;

    StackLL(){
        this.top = null;
        this.size = 0;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(top == null){
            top = temp;
        }else{
            temp.next = top;
            top = temp;
        }
        size++;
    }

    int pop() throws StackUnderFlowException{
        if(top == null){
            throw new StackUnderFlowException();
        }
        size--;
        int t = top.data;
        top = top.next;
        return t;
    }

    int size(){
        return size;
    }

    int peek(){
        return top.data;
    }

    boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
}
public class StackImplementedUsingLL{
    public static void main(String[] args) throws Exception{
        StackLL st = new StackLL();
        System.out.println(st.size());
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
