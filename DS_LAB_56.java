/* Write a program to implement a node structure for singly linked list. Read the
data in a node, print the node. */
import java.util.Scanner;

class LinkedList{
    Node FIRST = null;
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data = data;
        }
    }
    public void display(){
        Node temp = FIRST;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.link = FIRST;
        FIRST = newNode;
    }
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        Node temp = FIRST;
        if(temp == null){
            FIRST = newNode;
            return;
        }
        while(temp.link != null){
            temp = temp.link;
        }
        temp.link = newNode;
        return;
    }
}
public class DS_LAB_56 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); 
        LinkedList list = new LinkedList();
        System.out.println("Enter the data At FIRST Node : ");
        int n = sc.nextInt();
        list.insertAtFirst(n);
        System.out.println("Enter the data At LAST Node : ");
        n = sc.nextInt();
        list.insertAtLast(n);
        list.display();
    }
}