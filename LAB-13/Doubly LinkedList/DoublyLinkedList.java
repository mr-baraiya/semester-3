
public class DoublyLinkedList {
    Node FIRST = null;
    Node LAST = null;
    class Node{
        int data;
        Node LPTR;
        Node RPTR;
        public Node(){
            data = 0;
            LPTR = null;
            RPTR = null;
        }
    }
    public void display(){
        System.out.println();
        if(FIRST == null){
            System.out.println("LinkedList is Empty.");
        }else{
            Node temp = FIRST;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.RPTR;
            }
        }
        System.out.println();
    }
    public int getLength (){
        int count = 0;
        Node temp = FIRST;
        while(temp != null){
            count++;
            temp = temp.RPTR;
        }
        return count;
    }
    public void insertAtFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(FIRST == null){
            FIRST = newNode;
            LAST = newNode;
        }
        else{
            newNode.RPTR = FIRST;
            FIRST.LPTR = newNode;
            FIRST = newNode;
        }
    }
    public void insertAtLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(FIRST == null){
            FIRST = newNode;
            LAST = newNode;
        }
        else{
            newNode.LPTR = LAST;
            LAST.RPTR = newNode;
            LAST = newNode;
        }
    }
    public void insertAtPosition(int pos , int data){
        if(pos == 1){
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        Node temp = FIRST;
        for(int i = 1; i < pos-1; i++){
            temp = temp.RPTR;
        }
        newNode.RPTR = temp.RPTR;
        temp.RPTR = newNode;
        newNode.LPTR = temp;
    }
    public void deleteAtFirst(){
        if(FIRST == null){
            System.out.println("List is empty");
        }
        else if(FIRST == LAST){
            FIRST = null;
            LAST = null;
        }
        else{
            FIRST = FIRST.RPTR;
            FIRST.LPTR = null;
        }
    }
    public void deleteAtLast(){
        if(FIRST == null){
            System.out.println("List is empty");
        }
        else if(FIRST == LAST){
            FIRST = null;
            LAST = null;
        }
        else{
            LAST = LAST.LPTR;
            LAST.RPTR = null;
        }
    }
    public void deleteAtPosition(int pos){
        if(pos == 1){
            deleteAtFirst();
            return;
        }
        else if(pos == getLength()){
            deleteAtLast();
            return;
        }
        Node temp = FIRST;
        for(int i = 1; i < pos-1; i++){
            temp = temp.RPTR;
        }
        Node temp2 = temp.RPTR;
        temp.RPTR = temp2.RPTR;
        temp2.LPTR = temp;
    }
}