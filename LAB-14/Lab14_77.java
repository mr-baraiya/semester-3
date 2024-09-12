import java.util.Scanner;

public class Lab14_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tree tree = new Tree();
        Node root = null;

        // root = tree.insertUsingRecursion(root, 10);
        // root = tree.insertUsingRecursion(root, 1);
        // root = tree.insertUsingRecursion(root, 2);
        // root = tree.insertUsingRecursion(root, 3);
        // root = tree.insertUsingRecursion(root, 4);
        // root = tree.insertUsingRecursion(root, 5);
        // root = tree.insertUsingRecursion(root, 6);
        // root = tree.insertUsingRecursion(root, 7);
        // root = tree.insertUsingRecursion(root, 7);

        // root = tree.insertUsingIteration(root, 35);
        // root = tree.insertUsingIteration(root, 39);
        // root = tree.insertUsingIteration(root, 28);
        // root = tree.insertUsingIteration(root, 5);
        // root = tree.insertUsingIteration(root, 11);
        // root = tree.insertUsingIteration(root, 17);
        // root = tree.insertUsingIteration(root, 17);

        // tree.inorder(root);

        int num = 0, temp = 0;
        do {
            System.out.println("1. Insert, 2. Delete, 3. Search, -1. exit");
            num = sc.nextInt();
            
            switch (num) {
                case 1:
                    System.out.println("Enter data to insert");
                    temp = sc.nextInt();
                    root = tree.insertUsingRecursion(root, temp);
                    System.out.println("Element inserted successfully");
                    break;

                case 2:
                    System.out.println("Enter data to delete");
                    temp = sc.nextInt();
                    root = tree.delete(root, temp);
                    System.out.println("Element deleted");
                    break;

                case 3:
                    System.out.println("Enter data to search");
                    temp = sc.nextInt();
                    boolean isPresent = tree.search(root, temp);
                    if(isPresent) {
                        System.out.println("data is present");
                    }
                    else {
                        System.out.println("data is not present");
                    }
                    break;
            
                default:
                    if(num != -1) {
                        System.out.println("Enter valid value");
                    }
                    break;
            }
        } while(num != -1);
        tree.inorder(root);

        sc.close();
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

    public Node insertUsingRecursion(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(root.data == data) {
            return root;
        }

        if(data < root.data) {
            root.left = insertUsingRecursion(root.left, data);
        }
        else {
            root.right = insertUsingRecursion(root.right, data);
        }

        return root;
    }

    public Node insertUsingIteration(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(root.data == data) {
            return root;
        }

        Node temp = root;
        Node prev = null;

        while(temp != null) {
            if(temp.data == data) {
                return root;
            }
            
            if(data < temp.data) {
                prev = temp;
                temp = temp.left;
            }
            else {
                prev = temp;
                temp = temp.right;
            }
        }

        temp = new Node(data);
        if(temp.data < prev.data) {
            prev.left = temp;
        }
        else {
            prev.right = temp;
        }

        return root;
    }

    public Node delete(Node root, int data) {
        if(root == null) {
            return root;
        }

        if(data < root.data) {
            root.left = delete(root.left, data);
        }
        else if(data == root.data) {
            if(root.left == null && root.right == null) {
                return null;
            }
            else if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            else {
                Node temp = root.right;

                while(temp.left != null) {
                    temp = temp.left;
                }

                temp.left = root.left;
                return root.right;
            }
        }
        else {
            root.right = delete(root.right, data);
        }

        return root;
    }

    public boolean search(Node root, int data) {
        if(root == null) {
            return false;
        }

        if(data < root.data) {
            return search(root.left, data);
        }
        else if(data == root.data) {
            return true;
        }
        else {
            return search(root.right, data);
        }
    }

    public void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
