//WAP to split a circular linked list into two halves.

public class DS_LAB_74 {
    public static void main(String[] args){
        CirculerlyLinkedList list = new CirculerlyLinkedList();
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        CirculerlyLinkedList list_first = new CirculerlyLinkedList();
        CirculerlyLinkedList list_sacond = new CirculerlyLinkedList();
        Node temp = list.FIRST;
        for(int i=0;i<(list.length()/2)-1;i++){
            temp = temp.link;
        }
        list_first.FIRST = list.FIRST;
        list_first.LAST = temp;
        list_sacond.FIRST = temp.link;
        list_sacond.LAST = list.LAST;
        list.LAST.link = list_sacond.FIRST;
        temp.link = list.FIRST;
        list.LAST = temp;
        list_first.display();
        list_sacond.display();
        list.display();//list = first_list; 
    }
}
 