//82. Write a program to construct a binary tree from given postorder and preorder
//traversal sequence.
public class DS_LAB_82 {
   public static void main(String [] args){
    int preorder[] = {1,2,3,4,5,6};
    int postorder[] = {3,4,2,6,5,1};
    Tree t = new Tree();
    Node root = t.insert(preorder,postorder);
    t.inOrder(root);
   }
}
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree{
    int i=0,j=0;
    public Node insert (int [] preorder , int [] postorder){
        if(preorder.length==0 || postorder.length==0){
            return null;
        }
        if(preorder.length == i || postorder.length == j){
            return null;
        }
        Node newNode = new Node(preorder[i]);
        i++;
        if(newNode.data != postorder[j]){
            newNode.left = insert(preorder,postorder);
        }
        if(newNode.data != postorder[j]){
            newNode.right = insert(preorder,postorder);
        }
        j++;
        return newNode;
    }
    //inOredr for check tree is corecthg
    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}