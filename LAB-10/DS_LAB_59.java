import java.util.Scanner;
public class DS_LAB_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,6};
        for(int i=0 ;i<arr1.length ;i++){
            list1.insertAtFirst(arr1[i]);
            list2.insertAtFirst(arr1[i]);

        }
        list1.display();
        list2.display();

        boolean flag = false;
        if(list1.length() != list2.length()){
            flag = false;
        }else{
            for(int i=1 ; i <= list1.length() ;i++){
                list1.iisSame(list2., i)
            }
        }
        if(flag){
            System.out.println("List Are Same.");
        }else{
            System.out.println("List Are Not Same.");
        }
        

    }
}