package queue;

class UnderflowException extends Exception{
    UnderflowException(){
        super("Queue is empty...");
    }
}
class Queue{
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    Queue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int ele){
        if(rear == capacity - 1){
            System.out.println("Queue is full...");
        }else{
            rear++;
            arr[rear] = ele;
            size++;
        }
    }

    int dequeue() throws UnderflowException{
        if(rear < front){
            throw new UnderflowException();
        }else{
            int ele = arr[front];
            front++;
            size--;
            return ele;
        }

    }

    void printQueue(){
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    int getFront() throws UnderflowException{
        if(size > 0){
            return arr[front];
        }else{
            throw new UnderflowException();
        }
    }

    int getRear() throws UnderflowException{
        if(size > 0){
            return arr[rear];
        }else{
            throw new UnderflowException();
        }
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == capacity;
    }

    int size(){
        return size;
    }
}
public class QueueUsingArray {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(4);
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.isFull());
        q.printQueue();
        q.dequeue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.size());

    }
}
