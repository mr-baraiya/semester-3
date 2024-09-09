//77. Write a menu driven program to implement Binary Search Tree (BST) & perform
//following operations
// Insert a node, Delete a node, Search a node

import java.util.*;
import java.io.*;
public class DS_LAB_77 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        while(true){
            System.out.println("0. Display Tree");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Search Node");
            System.out.println("-1. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the value to be inserted: ");
                    int value = sc.nextInt();
                    bst.insert(value);
                break;
                case 2:
                    System.out.print("Enter the value to be deleted: ");
                    int del = sc.nextInt();
                    bst.delete(del);
                    break;
                case 3:
                    System.out.print("Enter the value to be searched: ");
                    int search = sc.nextInt();
                    if(bst.search(search)){
                        System.out.println("Node found");
                    }else{
                        System.out.println("Node not found");
                    }
                    break;
                case 0:
                    System.out.println();
                    bst.displayTree(bst.root);
                    System.out.println();
                    break;
                case -1:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class Node{
    int key;
    Node left, right;
    public Node(int data){
        key = data;
        left = null;
        right = null;
    }
}
class BST{
    Node root;
    public BST(){
        root = null;
    }

    //insert operation 
    public void insert(int data){
        root = insertRecord(root, data);
    }
    public Node insertRecord(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.key){
            root.left = insertRecord(root.left, data);
        }else if(data > root.key){
            root.right = insertRecord(root.right, data);
        }
        return root;
    }

    //Serch Opration
    public boolean search(int key){
        return searchRecord(root, key);
    }
    public boolean searchRecord(Node root,int data){
        if(root == null){
        return false;
        }else if(data == root.key){
            return true;
        }else if(data > root.key){
            return searchRecord(root.right, data);
        }else{
            return searchRecord(root.left, data);
        }
    }

    //delete a node
    public void delete(int data){
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.key == data){
                root = null;
                return;
            }
            else{
                return;
            }
        }
    }
    //inorder traversal for display
    public void displayTree(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(temp.left != null){
            displayTree(temp.left);
        }
        System.out.print(temp.key+" ");
        if(temp.right != null){
            displayTree(temp.right);
        }
    } 
}

//https://www.cs.usfca.edu/~galles/visualization/AVLtree.html