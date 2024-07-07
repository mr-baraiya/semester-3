// Write a program to implement queue using singly linked list.
import java.util.Scanner;

class Queue{
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }
    Node FRONT,REAR;
    public Queue(){
        this.FRONT = null;
        this.REAR = null;
    }
    public void PUSH(int data){
        Node newNode = new Node(data);
        if(REAR == null){
            FRONT = newNode;
            REAR = newNode;
        }
        REAR.link = newNode;
        REAR = newNode;
    }
    public int POP(){
        if(FRONT == null){
            return -1;
        }
        Node temp = FRONT;
        FRONT = FRONT.link;
        if(FRONT == null){
            REAR = null;
        }
        return temp.data;
    }
    public void display(){
        System.out.println();
        if(FRONT == null){
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = FRONT;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.println();
    }
}
public class DS_LAB_61 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Queue queue = new Queue();
        int temp=0,n=0;
        while(temp != -1){
            System.out.println("Enter 1 = PUSH , 2 = POP , 0 = DISPLAY , -1 = terminate the Program.");
            temp = sc.nextInt();
            switch(temp){
                case 1:
                    System.out.println("Enter the element to be pushed :");
                    n = sc.nextInt();
                    queue.PUSH(n); 
                    break;
                case 2:
                    n = queue.POP();
                    System.out.println("POP : "+n);
                    break;
                case 0:
                    queue.display();
                    break;
                case -1:
                    break;    
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
        System.out.println("Sucessfully complated!");
    }
}
