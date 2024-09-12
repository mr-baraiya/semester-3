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
                    bst.delete(bst.root , del);
                    break;
                case 3:
                    System.out.print("Enter the value to be searched: ");
                    int search = sc.nextInt();
                    if(bst.search(search)){
                        System.out.println("found Succesfully!");
                    }else{
                        System.out.println("Node not found");
                    }
                    break;
                case 0:
                    System.out.println();
                    bst.inTraverse(bst.root);
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
    public Node delete(Node root , int data) {
        if(root == null) {
            return root;
        }
        if(data < root.key) {
            root.left = delete(root.left, data);
        }
        else if(data == root.key) {
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
    //inorder traversal for display
    public void inTraverse(Node root){
        if(root == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(root.left != null){
            inTraverse(root.left);
        }
        System.out.print(root.key+" ");
        if(root.right != null){
            inTraverse(root.right);
        }
    } 

    //Preorder traversal for display
    public void preTraverse(Node root){
        if(root == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        System.out.print(root.key+" ");
        if(root.left != null){
            inTraverse(root.left);
        }
        if(root.right != null){
            inTraverse(root.right);
        }
    } 

    //Postorder traversal for display
    public void postTraverse(Node root){
        if(root == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(root.left != null){
            inTraverse(root.left);
        }
        if(root.right != null){
            inTraverse(root.right);
        }
        System.out.print(root.key+" ");
    } 
}

//https://www.cs.usfca.edu/~galles/visualization/AVLtree.html