
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtFirst(45);
        list.insertAtFirst(50);
        list.insertAtFirst(55);
        list.insertAtFirst(60);
        System.out.println(list.nextNode(list.FIRST).info); 
    }    
}
