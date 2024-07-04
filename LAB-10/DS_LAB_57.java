/*Write a menu driven program to implement following operations on the singly 
linked list. 
 Insert a node at the front of the linked list.
 Display all nodes.
 Delete a first node of the linked list.
 Insert a node at the end of the linked list.
 Delete a last node of the linked list.
 Delete a node from specified position */
/*Write a program to implement a node structure for singly linked list. Read the 
data in a node, print the node */
import java.util.Scanner;

public class DS_LAB_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insertAtFirst(50);
        list.insertAtFirst(40);
        list.insertAtFirst(30);
        list.insertAtFirst(20);
        list.insertAtFirst(10);
        list.display();
        list.insertInOrder(15);
        list.display();
    }
}