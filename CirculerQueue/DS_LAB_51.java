/*51. Write a menu driven program to implement following operations on a circular
queue using an Array
 Insert
 Delete
 Display all elements of the queue
 */
import java.util.Scanner;

public class DS_LAB_51 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Queue : ");
        int SIZE = sc.nextInt();
        CirculerQueue q = new CirculerQueue(SIZE);
        int temp = 0 , n = 0;
        while(temp != -1){
            System.out.println("Enter 0 for DISPLAY , 1 for ENQUEUE , 2 for DEQUEUE , -1 for Terminate the program : ");
            temp = sc.nextInt();
            switch(temp){
                case 0:
                    q.display();
                    break;
                case 1:
                    System.out.println("Enter the number for ENQUEUE : ");
                    n = sc.nextInt();
                    q.enqueue(n);
                    break;
                case 2:
                    n = q.dequeue();
                    System.out.println("DEQUEUE Value : "+n);
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