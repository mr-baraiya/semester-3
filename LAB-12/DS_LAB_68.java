//Write a program to swap two consecutive nodes in the linked list. Don’t change 
//the values of nodes, implement by changing the link of the nodes.

public class DS_LAB_68 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {1,2,3,4,5,6,7,8}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list.swapConsucativeNode();
        list.display();
    }
}
