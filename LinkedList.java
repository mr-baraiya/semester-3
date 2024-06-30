public class LinkedList{
    
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }

    public Node FIRST = null; 

    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        if(FIRST == null){
            FIRST = newNode;
            return;
        }
        Node temp = FIRST;
        FIRST = newNode;
        FIRST.link = temp;
    }

    public Node nextNode(Node temp){
        return temp.link;
    }
}