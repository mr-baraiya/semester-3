//83. WAP to find the smallest and largest elements in the Binary Search Tree.
public class DS_LAB_83 {
    public static void main(String [] args){
        BST t = new BST();
        int [] arr = {35,32,12,56,78,90,32};
        Node root = t.insertArr(arr);
        int [] ans = t.getInorderArr(root);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println("\nMinimum Elemant : "+ans[0]);
        System.out.println("Maximum Elemant : "+ans[ans.length-1]);
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    public Node insertArr(int [] arr){
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root , arr[i]);
        }
        return root;
    }
    public Node insert(Node root,int data){
        if(root == null){
            return root = new Node(data);
        }
        if(data < root.data){
            root.left = insert(root.left,data);
        }else if(data > root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    public int count(Node root){
        if(root == null){
            return 0;
        }
        int count = 1;
        if(root.left != null){
            count = count + count(root.left);
        }
        if(root.right != null){
            count = count + count(root.right);
        }
        return count;
    }
    public int [] getInorderArr(Node root){
        int [] arr = new int[count(root)];
        inOrder(root,arr);
        return arr;
    }
    int i=0;
    public int [] inOrder(Node root,int [] arr){
        if(root == null){
            return arr;
        }
        arr = inOrder(root.left,arr);
        arr[count(root)] = root.data;
        i++;
        arr = inOrder(root.right,arr);
        return arr;
    }
}