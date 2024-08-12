/*78. Write a menu driven program to implement Binary Search Tree (BST) & perform
following operations
 Preorder Traversal, Postorder Traversal, Inorder Traversal
 */
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
class BinaryTree{
    Node rootNode = null;
    public void rPreOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        System.out.print(temp.data+" ");
        if(temp.left != null){
            rPreOrder(temp.left);
        }
        if(temp.right != null){
            rPreOrder(temp.right);
        }
    } 
    public void rInOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(temp.left != null){
            rInOrder(temp.left);
        }
        System.out.print(temp.data+" ");
        if(temp.right != null){
            rInOrder(temp.right);
        }
    } 
    public void rPostOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(temp.left != null){
            rPostOrder(temp.left);
        }
        if(temp.right != null){
            rPostOrder(temp.right);
        }
        System.out.print(temp.data+" ");
    } 
    public Node insert(int[] arr,int index){
        if(index >= arr.length){
            return null;
        }
        Node newNode = new Node(arr[index]);
        if(rootNode == null)
        rootNode = newNode;
        newNode.left = insert(arr,index*2 + 1);
        newNode.right = insert(arr,index*2 + 2);
        return newNode;
    }
}
public class DS_LAB_78 {
    public static void main(String [] args){
        BinaryTree bt = new BinaryTree();
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        Node rootNode = bt.insert(arr,0);
        //here rootNode == bt.rootNode
        System.out.println("\n Pre Order Traversal : ");
        bt.rPreOrder(rootNode);
        System.out.println("\n In Order Traversal : ");
        bt.rInOrder(rootNode);
        System.out.println("\n Post Order Traversal : ");
        bt.rPostOrder(rootNode);
    }
}