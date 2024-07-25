/*52. Write a menu driven program to implement following operations on the
Doubled Ended Queue using an Array
 Insert at front end, Insert at rear end
 Delete from front end, Delete from rear end
 Display all elements of the queue
 */
import java.util.Scanner;
public class DS_LAB_52{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Queue : ");
        int SIZE = sc.nextInt();
        DoubleEndedQueue q = new DoubleEndedQueue(SIZE);
        int temp = 0 , n = 0;
        while(temp != -1){
            System.out.println("Enter 0 for DISPLAY , 1 for ENQUEUE_FRONT , 2 for ENQUEUE_REAR , 3 for DEQUEUE_FRONT , 4 for DEQUEUE_REAR , -1 for Terminate the program : ");
            temp = sc.nextInt();
            switch(temp){
                case 0:
                    q.display();
                    break;
                case 1:
                    System.out.println("Enter the number for ENQUEUE_FRONT : ");
                    n = sc.nextInt();
                    q.enqueue_front(n);
                    break;
                case 2:
                    System.out.println("Enter the number for ENQUEUE_REAR : ");
                    n = sc.nextInt();
                    q.enqueue_rear(n);
                    break;
                case 3:
                    n = q.dequeue_front();
                    System.out.println("DEQUEUE_FRONT Value : "+n);
                    break;
                case 4:
                    n = q.dequeue_rear();
                    System.out.println("DEQUEUE_REAR Value : "+n);
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
        }
        System.out.println("Program Succesfully Complated.");
        sc.close();
    }
}