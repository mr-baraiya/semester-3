//Find the middle elamant of the linkedList in One loop
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
    public Node middleNodeOfLinkedList(){
        if(FIRST == null){
            System.out.println("LinkedList is Empty.");
            return null;
        }
        Node fast = FIRST;
        Node slow = FIRST;
        while(fast != null && fast.link != null){
            slow = slow.link;
            fast = fast.link.link;
        }
        return slow;
    }
}
public class MiddleElemantOfLinkedList{
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        int [] arr = {1,2,3,4,5,6,7,8,9}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        Node temp = list.middleNodeOfLinkedList();
        System.out.println(temp.data);
    }
}