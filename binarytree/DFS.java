package binarytree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right =null;
    }
}

class Tree{
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

   static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    static int height(Node root){
        if(root == null){
            return 0;
        }else{
            int l = height(root.left);
            int r = height(root.right);
            return Math.max(l,r) +  1;
        }
    }

    static int size(Node root){
        if(root == null){
            return 0;
        }else{
            int l = size(root.left);
            int r = size(root.right);
            return l + r + 1;
        }
    }

    static void printKDist(Node root, int k){
        if(root != null){
            if(k == 0){
                System.out.print(root.data + " ");
            }else{
                printKDist(root.left, k - 1);
                printKDist(root.right, k - 1);
            }
        }
    }

    static int maximum(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }else{
            int l = maximum(root.left);
            int r = maximum(root.right);
            return Math.max(Math.max(l,r), root.data);
        }
    }
}
public class DFS {
    public static void main(String[] args) {
        Node root = null;
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
        root.right.right.left = new Node(70);
        Tree.inorder(root);
        System.out.println();
        Tree.preorder(root);
        System.out.println();
        Tree.postorder(root);
        System.out.println();
        System.out.println(Tree.height(root));
        Tree.printKDist(root,2);
        System.out.println();
        System.out.println(Tree.size(root));
        System.out.println(Tree.maximum(root));
    }
}
