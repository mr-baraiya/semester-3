/*Write a program to remove the duplicates nodes from given sorted Linked List.
 Input: 1 → 1 → 6 → 13 → 13 → 13 → 27 → 27
 Output: 1 → 6 → 13 → 27
*/
public class DS_LAB_69 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {1,1,6,13,13,13,27,27}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        list = removeDuplicates(list);
        list.display();
    }
    public static LinkedList removeDuplicates(LinkedList list){
        Node temp = list.FIRST;
        Node prev = null;
        if(temp == null || temp.link == null){
            //linkedList have empty or one node
            return list;
        }
        while(temp != null){
            prev = temp;
            temp = temp.link;
            while(temp != null && prev.data == temp.data){
                prev.link = temp.link;
                temp = temp.link;
            }
        }
        return list;
    }
}
