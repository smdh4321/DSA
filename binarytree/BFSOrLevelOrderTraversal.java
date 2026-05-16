package binarytree;


import java.util.LinkedList;
import java.util.Queue;

class TreeLOT{
    static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
            while(q.size() > 0){
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    static void levelOrderTraversalApproach1(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
            q.add(null);
            while(q.size() > 1){
                Node curr = q.poll();
                if(curr == null){
                    System.out.println();
                    q.add(null);
                }else{
                    System.out.print(curr.data + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }

    static void levelOrderTraversalApproach2(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
            while(q.size() > 0){
                int count = q.size();
                for(int i = 0; i < count; i++){
                    Node curr = q.poll();
                    System.out.print(curr.data + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                System.out.println();
            }
        }
    }

    static void leftView(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
            while(q.size() > 0){
                int count = q.size();
                for(int i = 0;i < count; i++){
                    Node curr = q.poll();
                    if(i == 0){
                        System.out.print(curr.data + " ");
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                System.out.println();
            }
        }
    }
    static void rightView(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
            while(q.size() > 0){
                int count = q.size();
                for(int i = 0;i < count; i++){
                    Node curr = q.poll();
                    if(i == 0){
                        System.out.print(curr.data + " ");
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

}

public class BFSOrLevelOrderTraversal {
    public static void main(String[] args) {
        Node root = null;
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
        root.right.right.left = new Node(70);
        TreeLOT.levelOrderTraversal(root);
        System.out.println("------------------------------");
        TreeLOT.levelOrderTraversalApproach1(root);
        System.out.println();
        System.out.println("------------------------------");
        TreeLOT.levelOrderTraversalApproach2(root);
        System.out.println("------------------------------");
        TreeLOT.leftView(root);
        System.out.println("------------------------------");
        TreeLOT.rightView(root);
    }
}
