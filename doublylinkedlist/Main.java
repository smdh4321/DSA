package doublylinkedlist;
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

class DoublyLinkedList{
    Node head;
    Node tail;

    void add(int ele){
        Node temp = new Node(ele);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    void printDLLInForwardDir(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printDLLInReverseDir(){
        Node curr = tail;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    void addFirst(int ele){
        Node temp = new Node(ele);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }

    void addEleAtSpecifiedPos(int index,int ele){
        Node temp = new Node(ele);
        if(index == 0){
            addFirst(ele);
        }else{
            Node curr = head;
            int count = 0;
            while(count < index - 1){
                curr = curr.next;
                count++;
            }
            curr.next.prev = temp;
            temp.next = curr.next;
            curr.next = temp;
            temp.prev = curr;
        }
    }

    void addAll(int[] arr){
        for(int ele : arr){
            add(ele);
        }
    }

    void removeFirst(){
        if(head == null){
            System.out.println("Doubly Linkedlist is empty....");
        }else if(head.next == null){
            head = null;
            tail = null;
        }else if(head.next != null){
            Node curr = head;
            head = head.next;
            curr.next = null;
            head.prev = null;
        }
    }

    void removeLast(){
        if(head == null){
            System.out.println("Doubly Linkedlist is empty....");
        }else if(head.next == null){
            head = null;
            tail = null;
        }else{
            Node curr = tail;
            tail = tail.prev;
            curr.prev = null;
            tail.next = null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.printDLLInForwardDir();
        System.out.println("-------------------------------");
        dll.printDLLInReverseDir();
        dll.addFirst(50);
        System.out.println("-------------------------------");
        dll.printDLLInForwardDir();
        System.out.println("-------------------------------");
        dll.addEleAtSpecifiedPos(3,25);
        dll.printDLLInForwardDir();
        int[] arr = {1,2,3,4};
        dll.addAll(arr);
        System.out.println("-------------------------------");
        dll.printDLLInForwardDir();
        dll.removeFirst();
        System.out.println("-------------------------------");
        dll.printDLLInForwardDir();
        dll.removeLast();
        System.out.println("-------------------------------");
        dll.printDLLInForwardDir();
    }
}
