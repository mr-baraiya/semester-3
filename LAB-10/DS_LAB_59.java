//WAP to check whether 2 singly linked lists are same or not.

import java.util.Scanner;
public class DS_LAB_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,6};
        for(int i=0 ;i<arr1.length ;i++){
            list1.insertAtFirst(arr1[i]);
            list2.insertAtFirst(arr2[i]);

        }
        list1.display();
        list2.display();
        if(compareList(list1, list2)){
            System.out.println("Both List are Same.");
        }else{
            System.out.println("Both List are Not Same.");
        }
    }

    public static boolean compareList(LinkedList list1,LinkedList list2){
        Node temp1 = list1.FIRST;
        Node temp2 = list2.FIRST;
        
        while (temp1 != null && temp2 != null) {
            if(temp1.data != temp2.data){
                return false;
            }
            temp1 = temp1.link;
            temp2 = temp2.link;
        }

        return temp1 == null && temp2 == null;
    }
}