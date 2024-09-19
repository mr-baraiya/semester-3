//83. WAP to find the smallest and largest elements in the Binary Search Tree.
public class DS_LAB_83 {
    public static void main(String[] args) {
        Tree t = new Tree();
        int [] arr = {35,39,28,5,11,17,17};
        Node root = t.insertArr(arr);
        t.inOrder(root);
        // System.out.println(tree.findMax(root));
        // System.out.println(tree.findMin(root));
    }
}
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    public Node insertArr(int [] arr){
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
        }
        return root;
    }
    public Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(root.data == data) {
            return root;
        }

        if(data < root.data) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public int findMax(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }

        int left = findMax(root.left);
        int right = findMax(root.right);

        return Math.max(Math.max(left, right), root.data);
    }
    public int findMin(Node root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        
        int left = findMin(root.left);
        int right = findMin(root.right);

        return Math.min(Math.min(left, right), root.data);
    }
} 