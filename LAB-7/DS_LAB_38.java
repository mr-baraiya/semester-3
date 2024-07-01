/*38. Write a menu driven program to implement following operations on the Stack 
using an Array
 PUSH, POP, DISPLAY
 PEEP, CHANGE */

import java.util.Scanner;

public class DS_LAB_38 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        int temp=0,n=0,i=0;
        do{
            System.out.println("Enter 1 = PUSH , 2 = POP , 3 = PEEP , 4 = CHANGE , 5 = DISPLAY , -1 = terminate the Program.");
            temp = sc.nextInt();
            switch(temp){
                case 1:
                    System.out.println("Enter the element to be pushed :");
                    n = sc.nextInt();
                    stack.PUSH(n); 
                    stack.DISPLAY();
                    break;
                case 2:
                    n = stack.POP();
                    System.out.println("POP : "+n);
                    stack.DISPLAY();
                    break;
                case 3:
                    System.out.println("Enter the Index of the elemant : ");
                    i = sc.nextInt();
                    n = stack.PEEP(i);
                    System.out.println("PEEP : "+n);
                    stack.DISPLAY();
                    break;
                case 4:
                    System.out.println("Enter the Index of the elemant : ");
                    i = sc.nextInt();
                    System.out.println("Enter the element to be changed :");
                    n = sc.nextInt();
                    stack.CHANGE(n,i);
                    stack.DISPLAY();
                    break;
                case 5:
                    stack.DISPLAY();
                    break;
                case -1:
                    break;    
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }while(temp != -1);
        System.out.println("Sucessfully Completed!");
    }
}
