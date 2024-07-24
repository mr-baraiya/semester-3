//WAP to delete alternate nodes of a doubly linked list.

public class DS_LAB_73 {
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        } 
        list.display();
        list = removceAlternateNode(list);
        list.display();
    }
    public static DoublyLinkedList removceAlternateNode(DoublyLinkedList list){
        if(list.FIRST == null || list.FIRST.RPTR == null){
            return list;
        }
        Node temp = list.FIRST;
        Node next = null;
        while(temp.RPTR != null){
            next = temp.RPTR;
            if(next.RPTR == null){
                temp.RPTR = null;
                break;
            }else{
                temp.RPTR = next.RPTR;
                (next.RPTR).LPTR = temp;
                temp = next;
            }
        }       
        return list;
    }
}
