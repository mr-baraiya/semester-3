import java.util.Scanner;

class LinkedList{
    Node FIRST = null;
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data = data;
        }
    }
    public void display(){
        Node temp = FIRST;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.link = FIRST;
        FIRST = newNode;
    }
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        Node temp = FIRST;
        if(temp == null){
            FIRST = newNode;
            return;
        }
        while(temp.link != null){
            temp = temp.link;
        }
        temp.link = newNode;
        return;
    }

    public int lengthOfLinkedList(){
        if(FIRST == null){
            return 0;
        }
        Node temp = FIRST;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.link;
        }
        return count;
    }

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        Node temp1 = FIRST;
        if(FIRST == null){
            FIRST = newNode;
            return;
        }
        if(position == 1){
            newNode.link = FIRST;
            FIRST = newNode;
            return;
        }
        int count = 0;
        while(temp1 != null){
            count++;
            temp1 = temp1.link;
        }
        if(position > count){
            System.out.println("Position is greater than the length of the linked list");
            return;
        }
        Node temp2 = FIRST;
        for(int i=1 ,i<position,i++){
            temp2 = temp2.link;
        }
        temp2.link
    }
}
public class DS_LAB_57{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}