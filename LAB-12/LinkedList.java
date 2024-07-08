class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
        this.link = null;
    }
}

public class LinkedList{
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
    public void insertInOrder(int data){
        Node newNode = new Node(data);
        if(FIRST == null){
            FIRST = newNode;
            return;
        }
        if(newNode.data<(FIRST.link).data){
            newNode.link = FIRST;
            FIRST = newNode;
            return;
        }
        Node temp = FIRST;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        if(newNode.data > temp.data){
            temp.link = newNode;
            return;
        }
        temp = FIRST;
        while(temp.link.data < newNode.data){
            temp = temp.link;
        }
        Node temp2 = temp.link;
        temp.link = newNode;
        newNode.link = temp2;
        return;
    }
    public void insertAtPosition(int pos,int data){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.link = FIRST;
            FIRST = newNode;
            return;
        }
        Node temp = FIRST;
        int count = 0;
        while (temp != null) {
            temp = temp.link;
            count++;
        }
        if(pos <= 0 || pos > count){
            System.out.println("The Given Position is out of LinkedList range.");
            return;
        }
        temp = FIRST;
        while (temp.link != null) {
            temp = temp.link;
        }
        if(pos == count){
            temp.link = newNode;
            return;
        }
        temp = FIRST;
        for(int i=1 ; i<pos-1 ;i++){
            temp = temp.link;
        }
        Node temp2 = temp.link;
        temp.link = newNode;
        newNode.link = temp2;
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
    public void deleteAtPosition(int pos){
        if(FIRST == null){
            return;
        }
        Node temp = FIRST;
        int count = 0;
        while (temp != null) {
            temp = temp.link;
            count++;
        }
        if(pos <= 0 || pos > count){
            System.out.println("The Given Position is out of LinkedList range.");
            return;
        }
        if(pos == 1){
            FIRST = FIRST.link;
            return;
        }
        if(pos == 2){
            FIRST.link = FIRST.link.link;
            return;
        }
        if(pos == count){
            temp = FIRST;
            while (temp.link.link != null) {
                temp = temp.link;
            }
            temp.link = null;
            return;
        }
        temp = FIRST;
        for(int i=1 ; i<pos-1 ;i++){
            temp = temp.link;
        }
        temp.link = temp.link.link;
        return; 
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
    
    public boolean isSame (Node temp , int pos){
        if(pos == 1){
            if(FIRST.data == temp.data){
                return true;
            }
        }
        Node SAVE = FIRST;
        for(int i=1 ; i<pos-1;i++){
            SAVE = SAVE.link;
        }
        if(SAVE.data == temp.data){
            return true;
        }
        return false;
    }

    public void reverseList(){
        if(FIRST == null){
            return;
        }
        Node temp = FIRST;
        Node prev = null;
        Node next = null;
        while(temp != null){
            next = temp.link;
            temp.link = prev;
            prev = temp;
            temp = next;
        }
        FIRST = prev;
    }

    public void sortList(){
        if(FIRST == null){
            return;
        }
        Node temp = FIRST;
        Node next = null;
        while(temp != null){
            next = temp.link;
            while(next != null && next.data < temp.data){
                temp.link = next.link;
                next.link = temp;
                temp = next;
            }
            next = temp.link;
        }
    }
}