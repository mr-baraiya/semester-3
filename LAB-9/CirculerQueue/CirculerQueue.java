public class CirculerQueue {
    int[] queue;
    int FRONT, REAR, n;
    public CirculerQueue(int n) {
        this.n = n;
        queue = new int[this.n];
        FRONT = -1;
        REAR = -1;
    }
    public void display(){
        if(FRONT == -1 || REAR == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println();
        int i=FRONT;
        while(i != REAR){
            System.out.print(queue[i]+" ");
            i = (i+1)%n;
        }
        System.out.print(queue[i]+" ");
        System.out.println();
    }
    public void enqueue (int data){
        if((REAR+1)%n == FRONT){
            System.out.println("Queue Overflow!");
            return;
        }
        REAR = (REAR+1)% n;
        if(FRONT == -1){
            FRONT = 0;
        }
        queue[REAR] = data;   
    }
    public int dequeue (){
        if(FRONT == -1){
            System.out.println("Queue Underflow!");
            return -1;
        }
        int temp = queue[FRONT];
        FRONT = (FRONT+1)% n;
        if(FRONT == REAR){
            FRONT = -1;
            REAR = -1;
        }
        return temp;
    } 
} 