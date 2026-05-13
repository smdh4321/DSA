package queue;

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class QueueLL{
    Node front;
    Node rear;
    int size;

    QueueLL(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    void enqueue(int ele){
        Node temp = new Node(ele);
        if(isEmpty()){
            front = temp;
            rear = temp;
        }else{
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    int dequeue() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }else{
            int ele = front.data;
            front = front.next;
            size--;
            return ele;
        }
    }

    boolean isEmpty(){
        return size == 0;
    }
    int size(){
        return size;
    }

    int getFront() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }else{
            return front.data;
        }
    }

    int getRear() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }else{
            return rear.data;
        }
    }


    void print() throws UnderflowException{
        if(front == null){
            throw new UnderflowException();
        }
        Node curr = front;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void reverseQueue() throws Exception{
        Stack<Integer> st = new Stack<>();

        while(!isEmpty()){
            st.push(dequeue());
        }

        while(!st.isEmpty()){
            enqueue(st.pop());
        }

        print();
    }
}
public class QueueUsingLL {
    public static void main(String[] args) throws Exception {
        QueueLL ql = new QueueLL();
        System.out.println(ql.isEmpty());
        ql.enqueue(10);
        ql.enqueue(20);
        ql.enqueue(30);
        System.out.println(ql.isEmpty());
        ql.enqueue(40);
        System.out.println(ql.size());
        System.out.println(ql.dequeue());
        System.out.println(ql.dequeue());
        System.out.println(ql.getFront());
        System.out.println(ql.getRear());
        ql.enqueue(100);
        System.out.println("_________________________");
        ql.print();
        System.out.println("_________________________");
        ql.reverseQueue();
    }
}
