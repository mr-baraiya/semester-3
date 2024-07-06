//Write a program to implement stack using singly linked list.
import java.util.Scanner;
class Stack{
    LinkedList stack = new LinkedList();

    public void PUSH(int x){
        stack.insertAtFirst(x);
    }
    public void POP(){
        stack.deleteAtFirst();
    }
    public void display(){
        stack.display();
    }
}
public class DS_LAB_60 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    Stack stack = new Stack();
    int temp=0,n=0;
    while(temp != -1){
        System.out.println("Enter 1 = PUSH , 2 = POP , 0 = DISPLAY , -1 = terminate the Program.");
        temp = sc.nextInt();
        switch(temp){
            case 1:
                System.out.println("Enter the element to be pushed :");
                n = sc.nextInt();
                stack.PUSH(n); 
                break;
            case 2:
                n = stack.POP();
                System.out.println("POP : "+n);
                break;
            case 5:
                stack.display();
                break;
            case -1:
                break;    
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
    }
}
