package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int val){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(val);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    public int pop(){
        return q1.poll();
    }

    public int peek(){
        return q1.peek();
    }
    public static void main(String[] args) {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        System.out.println(sq.peek());
        System.out.println(sq.pop());
        System.out.println(sq.peek());
    }
}
