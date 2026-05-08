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
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
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

    void removeFirst(){
        if(head == null){
            System.out.println("LinkedList is empty...");
        }else if(head.next == null){
            head = null;
        }else if(head.next != null){
            Node curr = head;
            head = head.next;
            curr.next = null;
        }
    }

    void removeLast(){
        if(head == null){
            System.out.println("LinkedList is empty...");
        }else if(head.next == null){
            head = null;
        }else if(head.next != null){
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    int indexOfSpecificELe(int ele){
        Node curr = head;
        int index = 0;
        while(curr != null){
            if(curr.data == ele){
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    int lastIndexOfSpecificEle(int ele){
        Node curr = head;
        int index = 0;
        int res = -1;
        while(curr != null){
            if(curr.data == ele){
                res = index;
            }
            curr = curr.next;
            index++;
        }
        return res;
    }

    int sizeOfLL(){
        Node curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        return size;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinkedList ll = new LinkedList();
        ll.addNode(10);
        ll.addEleAtFirst(5);
        ll.addEleAtSpecifiedPos(2,100);
        ll.addAll(arr);
        ll.addNode(1);
        ll.printList();
        System.out.println("--------------------------");
        ll.removeFirst();
        ll.printList();
        System.out.println("--------------------------");
        ll.removeLast();
        ll.printList();
        System.out.println("--------------------------");
        System.out.println(ll.indexOfSpecificELe(1));
        System.out.println("--------------------------");
        System.out.println(ll.lastIndexOfSpecificEle(1));
        System.out.println("--------------------------");
        System.out.println(ll.sizeOfLL());
    }
}
