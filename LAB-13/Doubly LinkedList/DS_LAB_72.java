/*72. Write a menu driven program to implement following operations on the doubly
linked list.
 Insert a node at the front of the linked list.
 Delete a node from specified position.
 Insert a node at the end of the linked list. (Home Work)
 Display all nodes. (Home Work) */
import java.util.Scanner;

public class DS_LAB_72 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int temp,n;
        do{
            System.out.println("0. Display all nodes.\n1. InsertAtFirst.\n2. DeleteAtposition.\n3. InsertAtLast.\n-1. Exit");
            System.out.println("Enter your choice: ");
            temp = sc.nextInt();
            switch(temp){
                case 0:
                list.display();
                break;
                case 1:
                System.out.println("Enter the data to be inserted : ");
                n = sc.nextInt();
                list.insertAtFirst(n);
                break;
                case 2:
                System.out.println("Enter the position to be deleted : ");
                n = sc.nextInt();
                list.deleteAtPosition(n);
                break;
                case 3:
                System.out.println("Enter the data to be inserted : ");
                n =  sc.nextInt();
                list.insertAtLast(n);
                break;
                case -1:
                break;
                default:
                System.out.println("Invalid Choice");
                break;
            }
        }while(temp!=-1);
        System.out.println("Succesfully Complated!");
    }
}
