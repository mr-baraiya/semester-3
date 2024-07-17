//Write a program to sort elements of a linked list.
import java.util.Scanner;

public class DS_LAB_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int [] arr = {34,56,78,32,12,2,43,90,54,87,43,78}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list.sortList();
        list.display();
    }
}