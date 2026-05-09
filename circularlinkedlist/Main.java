package circularlinkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList{
    Node head;

    void print(){
        if(head != null){
            Node curr = head;
            do{
                System.out.print(curr.data + " ");
                curr = curr.next;
            }while (curr != head);
        }
        System.out.println();
    }

    void addFirst(int ele){
        Node temp = new Node(ele);
        if(head == null){
            head = temp;
            head.next = head;
        }else{
            Node curr = head;
            while(curr.next != head){
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            head = temp;
        }
    }

    void addFirstEff(int ele){
        Node temp = new Node(ele);
        if(head == null){
            head = temp;
            head.next = head;
        }else{
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
        }
    }

    void addLast(int ele){
        Node temp = new Node(ele);
        if(head == null){
            head = temp;
            head.next = head;
        }else{
            Node curr = head;
            while(curr.next != head){
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
    }

    void removeFirst(){
        if(head == null){
            System.out.println("Circular LL is empty...");
        }else if(head.next == head){
            head = null;
        }else{
            int t = head.data;
            head.data = head.next.data;
            head.next.data = t;
            head.next = head.next.next;
        }
    }

    void removeLast(){
        if(head == null){
            System.out.println("CLL is empty...");
        }else if(head.next == head){
            head = null;
        }else{
            Node curr = head;
            while(curr.next.next != head){
                curr = curr.next;
            }
            curr.next = head;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(10);
        cll.addFirst(20);
        cll.addFirst(30);
        cll.addFirstEff(40);
        cll.addLast(50);
        cll.print();
        System.out.println("____________________________");
        cll.removeFirst();
        cll.print();
        cll.removeLast();
        System.out.println("____________________________");
        cll.print();
    }
}
