public class DoubleEndedQueue {
    int [] queue;
    int front, rear, size;
    public DoubleEndedQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    public void display(){
        System.out.println();
        if(front == -1 || rear == -1){
            System.out.println("Queue is empty");
        }
        for(int i = front; i<= rear ; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public void enqueue_rear(int data){
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = rear + 1;
        queue[rear] = data;
    }
    public int dequeue_front(){
        if (front == -1) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int data = queue[front];
        if(front == rear) {
            front = -1;
            rear = -1;
        }else{
            front = front + 1;
        }
    }
    public void enqueue_front(int data){
        if (front == 0) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        }else{
            front = front - 1;
        }
        queue[front] = data;
    }
    public int dequeue_rear(){
        if (rear == -1) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int data = queue[rear];
        rear = rear - 1;
        if (rear == -1) {
            front = -1;
        }
        return data;
    }
}