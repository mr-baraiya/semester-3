import java.util.Scanner;

public class DS_LAB_71 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CirculerlyLinkedList list = new CirculerlyLinkedList();
        int temp=0,n=0;
        while (temp != -1) {
            System.out.println("Enter 0:diplay 1:insertAtFirst 2:insertAtLast 3:deleteAtFirst 4:deleteAtLast 5:deleteAtPosition -1:terminate the program.");
            temp = sc.nextInt();
            switch (temp) {
                case 0:
                    list.display();
                    break;
                case 1:
                    System.out.println("Enter the value To be inserted : ");
                    n = sc.nextInt();
                    list.insertAtFirst(n);
                    break;
                case 2:
                    System.out.println("Enter the value To be inserted : ");
                    n = sc.nextInt();
                    list.insertAtLast(n);
                    break;
                case 3:
                    list.deleteAtFirst();
                    list.display();
                    break;
                case 4:
                    list.deleteAtLast();
                    list.display();
                    break;
                case 5:
                    System.out.println("Enter the Position : ");
                    n = sc.nextInt();
                    list.deleteAtPosition(n);
                    list.display();
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        }
        System.out.println("Sucessfully Complated!");
    }    
}
