package linkedlist;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        ll.head = p1;
        ll.printList();
    }
}
