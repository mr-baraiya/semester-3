import java.util.Scanner;

public class DS_LAB_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Queue : ");
        int n = sc.nextInt();
        PriorityQueue queue = new PriorityQueue(n);
        int temp = 0;
        do {
            System.out.println("1 for insert,\n2 for delete,\n0 for display queue,\n-1 for terminate the program.");
            temp = sc.nextInt();
            
            switch(temp){
                case 1:
                    System.out.println("Enter element to insert : ");
                    n = sc.nextInt();
                    queue.insert(n);
                    break;

                case 2:
                    System.out.println("Enter element to delete : ");
                    n = sc.nextInt();
                    queue.delete(n);
                    break;

                case 0:
                    queue.display();
                    break;

                default:
                    if(temp != -1) System.out.println("Invalid Input.");
            }
        } while(temp != -1);
        sc.close();
    }
}