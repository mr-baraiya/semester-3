/*50. Write a menu driven program to implement following operations on the Queue 
using an Array
 ENQUEUE
 DEQUEUE
 DISPLAY */
import java.util.Scanner;

public class DS_LAB_50 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Queue : ");
        int SIZE = sc.nextInt();
        Queue q = new Queue(SIZE);
        int temp = 0 , n = 0;
        while(temp != -1){
            System.out.println("Enter 0 for DISPLAY , 1 for ENQUEUE , 2 for DEQUEUE , -1 for Terminate the program : ");
            temp = sc.nextInt();
            switch(temp){
                case 0:
                    q.DISPLAY();
                    break;
                case 1:
                    System.out.println("Enter the number for ENQUEUE : ");
                    n = sc.nextInt();
                    q.ENQUEUE(n);
                    break;
                case 2:
                    n = q.DEQUEUE();
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
    }
}
