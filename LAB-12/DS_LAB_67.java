/*WAP to perform given operation in the linked list. There exist a Linked List. Add a node 
that contains the GCD of that two nodes between every pair adjacent node of Linked 
List. */

public class DS_LAB_67 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {18,6,10,3}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list.addGCD();
        list.display();
    }
}
