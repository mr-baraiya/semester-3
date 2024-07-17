//Write a program to reverse a linked list
import java.util.Scanner;
public class DS_LAB_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int [] arr = {1,2,3,4,5,6,7,8,9}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list.reverseList();
        list.display();
        LinkedList newList = new LinkedList();
        newList = reverseLinkedList(list);
        newList.display();
    }

    public static LinkedList reverseLinkedList(LinkedList list){
        if(list.FIRST == null){
            return null;
        }
        LinkedList newList = new LinkedList();
        Node temp = list.FIRST;
        while(temp != null){
            newList.insertAtFirst(temp.data);
            temp = temp.link;
        }
        return newList;
    }
}
