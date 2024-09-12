public class Lab14_78 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = null;
        
        root = tree.insert(root, 35);
        root = tree.insert(root, 39);
        root = tree.insert(root, 28);
        root = tree.insert(root, 5);
        root = tree.insert(root, 11);
        root = tree.insert(root, 17);
        root = tree.insert(root, 17);

        //root
        System.out.println("root = " + root.data);

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

    public void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if(root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
