public class Lab14_80 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(3);

        tree.preorder(root);
        System.out.println();
        System.out.println(tree.isSymmetric(root));
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
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data == data) {
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public boolean isSymmetric(Node root) {
        if(root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node t1, Node t2) {
        if(t1 == null && t2 == null) {
            return true;
        }

        if(t1 == null || t2 == null) {
            return false;
        }

        return (t1.data == t2.data) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
