/*Write a program to implement a node structure for singly linked list. Read the 
data in a node, print the node */
import java.util.Scanner;

public class DS_LAB_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        System.out.println("Enter the Length of List : ");
        int length = sc.nextInt();
        for(int i = 1;i <= length;i++){
            System.out.println("Enter the value of Node : ");
            int n = sc.nextInt();
            list1.insertAtFirst(n);
            list2.insertAtLast(n);
        }
        
        list1.display();
        list2.display();
    }
}