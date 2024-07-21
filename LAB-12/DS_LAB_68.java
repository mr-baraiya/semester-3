//Write a program to swap two consecutive nodes in the linked list. Don’t change 
//the values of nodes, implement by changing the link of the nodes.

public class DS_LAB_68 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {1,2,3,4,5,6,7,8,9,10}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list.swapConsucativeNode();
        list.display();
    }
}

/* public void swapConsucativeNode(){
    if(FIRST == null || FIRST.link == null){
        return;
    }
    Node temp = FIRST;
    Node next = FIRST.link;
    Node prev = null;
    while(next != null){
        temp.link = next.link;
        next.link = temp;
        if(temp == FIRST){
            FIRST = next;
        }else{
            prev.link = next;
        }
        prev = temp;
        temp = temp.link;
        if(temp == null){
            return;
        }
        next = temp.link;
    }
}   */
