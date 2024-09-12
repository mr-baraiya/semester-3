//79. Write a program to check whether the given two trees are same or not.
public class DS_LAB_79 {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        Node root = null;
        t1.insert(23);
        t1.insert(45);
        t1.insert(56);
        t1.insert(76);
        t1.insert(43);
        t1.insert(56);
        //preorder
        tree.preorder(root);
        System.out.println();

        //inorder
        tree.inorder(root);
        System.out.println();

        //postorder
        tree.postorder(root);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    public Node (int x){
        this.data = x;
        this.left = null;
        this.right = null;
    }
}
class BST{
    Node root = null;

    public void insert(int data){
        root = insertRecord(root, data);
    }
    public Node insertRecord(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.key){
            root.left = insertRecord(root.left, data);
        }else if(data > root.key){
            root.right = insertRecord(root.right, data);
        }
        return root;
    }
    public void preOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        System.out.print(temp.data+" ");
        if(temp.left != null){
            preOrder(temp.left);
        }
        if(temp.right != null){
            preOrder(temp.right);
        }
    } 
    public void inOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(temp.left != null){
            inOrder(temp.left);
        }
        System.out.print(temp.data+" ");
        if(temp.right != null){
            inOrder(temp.right);
        }
    } 
    public void postOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(temp.left != null){
            postOrder(temp.left);
        }
        if(temp.right != null){
            postOrder(temp.right);
        }
        System.out.print(temp.data+" ");
    } 
}