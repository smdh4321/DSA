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

    void addEleAtFirst(int ele){
        Node curr = new Node(ele);
        if(head == null){
            head = curr;
        }else{
            curr.next = head;
            head = curr;
        }
    }

    void addEleAtSpecifiedPos(int index, int ele) throws IndexOutOfBoundsException{

        try{
            if(index == 0){
                addEleAtFirst(ele);
            }else{
                int count = 0 ;
                Node curr = head;
                Node temp = new Node(ele);
                while(count < index - 1){
                    curr = curr.next;
                    count++;
                }
                temp.next = curr.next;
                curr.next = temp;
            }
        }catch (NullPointerException e){
            throw new IndexOutOfBoundsException();
        }
    }

    void addAll(int[] arr){
        for(int ele : arr){
            addNode(ele);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinkedList ll = new LinkedList();
        ll.addNode(10);
        ll.addEleAtFirst(50);
        ll.addEleAtSpecifiedPos(2,100);
        ll.addAll(arr);
        ll.printList();
    }
}
