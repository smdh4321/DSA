package queue;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
    String data;
    Node1 next;
    Node1(String data){
        this.data = data;
        this.next = null;
    }
}

class QueueLL1{
    Node1 front;
    Node1 rear;
    int size;

    QueueLL1(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    void enqueue(String ele){
        Node1 temp = new Node1(ele);
        if(isEmpty()){
            front = temp;
            rear = temp;
        }else{
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    String dequeue() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }else{
            String ele = front.data;
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

    String getFront() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }else{
            return front.data;
        }
    }

    String getRear() throws UnderflowException{
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
        Node1 curr = front;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}


public class NumberSeries {
    static void numberSeries(int capacity) throws Exception{
        QueueLL1 q = new QueueLL1();
        q.enqueue("5");
        q.enqueue("6");
        for(int i = 0; i < capacity; i++){
            String temp = q.dequeue();
            System.out.print(temp+ " ");
            q.enqueue(temp + "5");
            q.enqueue(temp + "6");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        int capacity = 12;
        numberSeries(capacity);
    }
}
