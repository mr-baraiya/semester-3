import java.util.Scanner;
public class DS_LAB_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int temp = 0;
        while(true){
            System.out.println("Enetr the Number in  (-1 for Terminate) LinkedList:");
            temp = sc.nextInt();
            if(temp == -1){
                break;
            }
            list.insertAtFirst(temp);
        }
        list.display();
        System.out.println("Total Node In LinkedList : "+list.length());
    }
}
