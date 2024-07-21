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
/* public void addGCD(){
        if(FIRST == null){
            System.out.println("List is Empty.");
            return;
        }
        Node next = FIRST.link;
        Node prev = FIRST;
        while(next != null){
            int min = Math.min(next.data, prev.data);
            int gcd = 1;
            for(int i=min;i>0;i--){
                if(next.data % i == 0 && prev.data % i == 0){
                    gcd = i;
                    break;
                }
            }
            Node newNode = new Node(gcd);
            prev.link = newNode;
            newNode.link = next;
            prev = next;
            next = next.link;
        }

    } */
