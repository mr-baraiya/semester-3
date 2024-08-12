class Node {
    int data;
    Node LPTR;
    Node RPTR;
}

/**
 * InnerTreeDemo
 */
class Tree {
    Node rootNode = null;

    public void rPreorderTraversal(Node t) {
        if (t == null) {
            System.out.print("Tree is Empty.");
            return;
        } else {
            System.out.print(t.data + " ");
        }
        if (t.LPTR != null) {
            rPreorderTraversal(t.LPTR);
        }
        if (t.RPTR != null) {
            rPreorderTraversal(t.RPTR);
        }
    }

    public void rInorderTraversal(Node t) {
        if (t == null) {
            System.out.print("Tree is Empty.");
            return;
        }
        if (t.LPTR != null) {
            rInorderTraversal(t.LPTR);
        }
        System.out.print(t.data + " ");
        if (t.RPTR != null) {
            rInorderTraversal(t.RPTR);
        }
    }

    public void rPostorderTraversal(Node t) {
        if (t == null) {
            System.out.print("Tree is Empty.");
            return;
        }
        if (t.LPTR != null) {
            rPostorderTraversal(t.LPTR);
        }
        if (t.RPTR != null) {
            rPostorderTraversal(t.RPTR);
        }
        System.out.print(t.data + " ");
    }
}

public class TreeDemo {
    public static void main(String[] args) {
        Tree t = new Tree();

        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        Node node3 = new Node();
        node3.data = 3;

        node1.LPTR = node2;
        node1.RPTR = node3;

        Node node4 = new Node();
        node4.data = 4;
        Node node5 = new Node();
        node5.data = 5;

        node2.LPTR = node4;
        node2.RPTR = node5;

        Node node6 = new Node();
        node6.data = 6;
        Node node7 = new Node();
        node7.data = 7;

        node5.LPTR = node6;
        node3.RPTR = node7;
        System.out.println("\n rPreorderTraversal");
        t.rPreorderTraversal(node1);
        System.out.println("\n rInorderTraversal");
        t.rInorderTraversal(node1);
        System.out.println("\n rPostorderTraversal");
        t.rPostorderTraversal(node1);
    }
}