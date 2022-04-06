//1
import java.util.Scanner;
//the node class
class Node{
    Node left, right;
    int data;
    //the tree is initially empty
    public Node(int n){
    left = null;
    right = null;
    data = n;
    }   
}
//binary tree class
public class BinaryTree{
    private Node root;

    public BinaryTree(){
    root = null;//create an empty tree
    }
    //inserts nodes onto the tree starting with the root node
    public void insert(int data){
        root = insert(root, data);
    }
    private Node insert(Node node, int data){
        //if it empty just insert
        if (node == null)
            node = new Node(data);
        //if the new node is less than the parent node insert on the left else insert on the right
        else{
            if (data <= node.data)
            node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
            }
        return node;
    }
    
    public void preorder(){
        preorderNext(root);
    }
    //this method prints the root, then the left and lastly the right child
    private void preorderNext(Node x){
        if (x != null){
            System.out.print(x.data +" ");
            preorderNext(x.left);   
            preorderNext(x.right);
        }
    }
    public void postorder(){
        postorderNext(root);
    }
    //this method prints the left child, then the right child and lastly the root
    private void postorderNext(Node x){
        if (x != null){
            postorderNext(x.left);   
            postorderNext(x.right);
            System.out.print(x.data +" ");
        }
    }
    public void inorder(){
        inorderNext(root);
    }
    //print the left child, root and lastly the right child
    private void inorderNext(Node x){
        if (x != null){
            inorderNext(x.left);
            System.out.print(x.data +" ");
            inorderNext(x.right);
        }
    }

    public static void main(String[] args){ 
        //this scanner reads inputs from the user  
        Scanner scan = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        System.out.println("Linked List Binary Search Tree\n");
        char ch;
        do{
            System.out.println("Enter integer an integer");
            bt.insert( scan.nextInt() );  //inserts node to the tree and perform the preorder, postorder and inorder on them and print out hte results
            System.out.print("\nPreorder : ");
            bt.preorder();
            System.out.print("\nPostorder : ");
            bt.postorder();
            System.out.print("\nInorder : ");
            bt.inorder();
            System.out.println("\nDo you want to insert another integer? Y or N?) \n");
            ch = scan.next().charAt(0);
        } 
        while (ch == 'Y'|| ch == 'y');
        scan.close();
    }
}

//And the worst-case running time complexity will be O(n), that is when we have to traverse all th nodes in the tree