package queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void enqueue(int val){
        st1.push(val);
    }

    public int dequeue(){
        if(st1.isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int val = st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return val;
    }

    public int peek(){
        if(st1.isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int val = st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return val;
    }
    public static void main(String[] args) {
        QueueUsingStack qs = new QueueUsingStack();
        qs.enqueue(10);
        qs.enqueue(20);
        qs.enqueue(30);
        System.out.println(qs.peek());
        System.out.println(qs.dequeue());
        System.out.println(qs.peek());
    }
}
