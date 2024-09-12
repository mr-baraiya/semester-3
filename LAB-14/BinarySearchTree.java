public class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        tree.root = tree.insert(arr, 0);
        tree.pre_traverse(tree.root);
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

class BinaryTree {
    Node root = null;

    public Node insert(int[] arr, int index) {
        if (index >= arr.length) return null;

        Node newNode = new Node(arr[index]);
        newNode.left = insert(arr, index * 2 + 1);
        newNode.right = insert(arr, index * 2 + 2);

        return newNode;
    }
    
    public void pre_traverse(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        pre_traverse(root.left);
        pre_traverse(root.right);
    }

    public void in_traverse(Node root) {
        if (root == null) return;

        in_traverse(root.left);
        System.out.print(root.data + " ");
        in_traverse(root.right);
    }

    public void post_traverse(Node root) {
        if (root == null) return;

        post_traverse(root.left);
        post_traverse(root.right);
        System.out.print(root.data + " ");
    }
}
