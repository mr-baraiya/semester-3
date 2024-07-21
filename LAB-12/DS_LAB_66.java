//WAP to swap Kth node from beginning with Kth node from end in a singly linked list.
import java.util.Scanner;

public class DS_LAB_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int [] arr = {34,56,78,32,12,2,43,90,54,87,43,78}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        System.out.println("Enter the k th position (12) : ");
        int k = sc.nextInt();
        swapKthNode(list,k);
        list.display();
        sc.close();
    }
    public static void swapKthNode(LinkedList list , int k){
        Node temp = list.FIRST;
        int count = 1;
        while(count<k){
            temp = temp.link;
            count++;
        }
        if(k <= 0 || k > list.length()){
            System.out.println("Invalid k value");
            return;
        }
        count = list.length()-k+1;
        list.deleteAtPosition(k);
        list.insertAtPosition(count,temp.data);
    }
}