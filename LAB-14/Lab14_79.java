public class Lab14_79 {
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

        Node root2 = null;

        root2 = tree.insert(root2, 35);
        root2 = tree.insert(root2, 39);
        root2 = tree.insert(root2, 28);
        root2 = tree.insert(root2, 5);
        root2 = tree.insert(root2, 11);
        root2 = tree.insert(root2, 17);
        root2 = tree.insert(root2, 17);

        System.out.println(tree.compare(root, root2));
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

    public boolean compare(Node root, Node root2) {
        if(root == null && root2 == null) {
            return true;
        }

        if(root == null || root2 == null) {
            return false;
        }

        boolean flag = compare(root.left, root2.left);
        boolean flag2 = compare(root.right, root2.right);

        if(flag && flag2) {
            if(root.data == root2.data) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
