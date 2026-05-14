package dequeue;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Dequeue{
    Node front;
    Node rear;
    int size;
    Dequeue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    void offerFirst(int ele){
        Node temp = new Node(ele);
        if(size == 0){
            front = temp;
            rear = temp;
        }else{
            temp.next = front;
            front = temp;
            front.prev = temp;
        }
        size++;
    }

    void offerLast(int ele){
        Node temp = new Node(ele);
        if(size == 0){
            front = temp;
            rear = temp;
        }else{
            temp.prev = rear;
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    int pollFirst(){
        if(size == 0){
            System.out.println("Dequeue is empty..");
            return -1;
        }else{
            Node curr = front;
            int ele = curr.data;
            front = front.next;
            curr.next = null;
            size--;
            return ele;
        }
    }

    int pollLast(){
        if(size == 0){
            System.out.println("Dequeue is empty..");
            return -1;
        }else{
            Node curr = rear;
            int ele = curr.data;
            rear = rear.prev;
            curr.prev = null;
            size--;
            return ele;
        }
    }

    int peekFirst(){
        if(size == 0){
            System.out.println("Dequeue is empty..");
            return -1;
        }else{
            return front.data;
        }
    }

    int peekLast(){
        if(size == 0){
            System.out.println("Dequeue is empty..");
            return -1;
        }else{
            return rear.data;
        }
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    void print(){
        if(size == 0){
            System.out.println("Dequeue is empty..");
        }else{
            Node curr = front;
            while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
        System.out.println();
    }
}

public class DequeueUsingDLL {
    public static void main(String[] args) {
        Dequeue dq = new Dequeue();
        System.out.println(dq.isEmpty());
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);
        dq.offerLast(40);
        dq.print();
        System.out.println("-----------------");
        System.out.println(dq.pollFirst());
        dq.print();
        System.out.println("-----------------");
        System.out.println(dq.pollLast());
        dq.print();
        System.out.println("-----------------");
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
    }
}
