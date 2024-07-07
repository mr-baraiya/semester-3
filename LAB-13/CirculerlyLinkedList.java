
class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
        this.link = null;
    }
}
public class CirculerlyLinkedList{
    
    Node FIRST = null;
    Node LAST = null;

    public void display(){
        System.out.println();
        if(FIRST == null){
            System.out.println("LinkedList is Empty.");
            return;
        }
        Node temp = FIRST;
        do{
            System.out.print(temp.data+" ");
            temp = temp.link;
            
        }while(temp != FIRST);
        System.out.println();
    }
    
    public void insertAtFirst (int data){
        Node newNode = new Node(data);
        if(FIRST == null){
            FIRST = newNode;
            LAST = newNode;
            LAST.link = FIRST;
            return;
        }
        newNode.link = FIRST;
        FIRST = newNode;
        LAST.link = FIRST;
    }
    public void insertAtLast (int data){
        Node newNode = new Node(data);
        if(FIRST == null){
            FIRST = newNode;
            LAST = newNode;
            LAST.link = FIRST;
            return;
        }
        LAST.link = newNode;
        LAST = newNode;
        LAST.link = FIRST;
        return;
    }
    public void deleteAtFirst(){
        if(FIRST == null){
            return;
        }
        else if(FIRST != LAST){
            FIRST = FIRST.link;
            LAST.link = FIRST;
            return;
        }
        else if (FIRST == LAST){
            FIRST = null;
            LAST = null;
        }
    }

    public void deleteAtLast(){
        if(FIRST == null){
            return;
        }
        else if(FIRST != LAST){
            Node temp = FIRST;
            while (temp.link != LAST) {
                temp = temp.link;
            }
            LAST = temp;
            LAST.link = FIRST;
        }
        else if (FIRST == LAST){
            FIRST = null;
            LAST = null;
        }
    }

    public void deleteAtPosition(int pos){
        if(FIRST == null){
            return;
        }
        int count = 0;
        Node temp = LAST;
        do{
            temp = temp.link;
            count++;
        }while(temp != LAST);
        if(pos<= 0 && pos > count){
            System.out.println("Invaid Position");
            return;
        }
        else if(FIRST != LAST){
            temp = FIRST;
            Node previus = LAST;
            if(pos == 1){
                FIRST = FIRST.link;
                LAST.link = FIRST;
                return;
            }
            if(pos == count){
                while (temp.link != LAST) {
                    temp = temp.link;
                }
                LAST = temp;
                LAST.link = FIRST;
                return;
            }
            for(int i=1;i<pos;i++){
                previus = temp;
                temp = temp.link;
            }
            previus.link = temp.link;
            return;
        }
        else if (FIRST == LAST){
            FIRST = null;
            LAST = null;
        }
    }
    public int length (){
        if(FIRST == null){
            return 0;
        }
        int count = 0;
        Node temp = LAST;
        do{
            temp = temp.link;
            count++;
        }while(temp != LAST);
        return count;
    }
}