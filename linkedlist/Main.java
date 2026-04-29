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
    void addNode(int ele){
        Node temp = new Node(ele);
        if(head == null){    // check linkedlist is empty or not
            head = temp;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.printList();
    }
}
