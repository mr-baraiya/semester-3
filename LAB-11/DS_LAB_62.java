// WAP to remove duplicate elements from a singly linked list
class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
        this.link = null;
    }
}
class LinkedList{
    Node FIRST = null;
    public void display(){
        System.out.println();
        if(FIRST == null){
            System.out.println("LinkedList is Empty.");
            return;
        }
        Node temp = FIRST;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.println();
    }
    
    public void insertAtFirst (int data){
        Node newNode = new Node(data);
        if(FIRST == null){
            FIRST = newNode;
            return;
        }
        newNode.link = FIRST;
        FIRST = newNode;
    }
    public void insertAtLast (int data){
        Node newNode = new Node(data);
        if(FIRST == null){
            FIRST = newNode;
            return;
        }
        Node temp = FIRST;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
        return;
    }
    
    public void deleteAtFirst(){
        if(FIRST == null){
            return;
        }
        FIRST = FIRST.link;
    }
    public void deleteAtLast(){
        if(FIRST == null){
            return;
        }
        Node temp = FIRST;
        while (temp.link.link != null) {
            temp = temp.link;
        }
        temp.link = null;
    }
    public int length (){
        Node temp = FIRST;
        int count = 0;
        while (temp != null) {
            temp = temp.link;
            count++;
        }
        return count;
    }
    public void removeDuplicate (){
        if(FIRST == null){
            return;
        }
        Node temp = FIRST;
        int count = 0;
        while (temp != null) {
            temp = temp.link;
            count++;
        }
        for(int i=1 ; i<=count ;i++){
            temp = FIRST;
            while (temp != null) {
                int data = temp.data;
                Node temp2 = temp.link;
                Node previus = temp;
                while(temp2 != null){
                    if(temp2.data == data){
                        previus.link = temp2.link;
                    }
                    previus = temp2;    
                    temp2 = temp2.link;
                }
                temp = temp.link;
            }
        }
    }
}
public class DS_LAB_62 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {1,1,2,3,4,5,6,3,4,2,6};
        for(int i=0 ; i<arr.length ;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list.removeDuplicate();
        list.display();
    }
    
}
