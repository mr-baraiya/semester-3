public class Queue {
    int [] queue;
    int FRONT,REAR,SIZE;
    public Queue(int SIZE){
        this.SIZE = SIZE;
        queue = new int[this.SIZE];
        FRONT = -1;
        REAR = -1;
    }
    public void DISPLAY(){
        System.out.println();
        if(REAR < 0){
            System.out.println("Queue is Empty.");
            return;
        }
        for(int i = FRONT; i <= REAR ; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public void ENQUEUE(int n){
        if(REAR >= SIZE-1){
            System.out.println("Queue Overflow!");
            return;
        }
        REAR++;
        if(REAR == 1){
            FRONT++;
        }
        queue[REAR] = n;
    }
    public int DEQUEUE(){
        if(FRONT < 0){
            System.out.println("Queue Underflow!");
            return 0;
        }
        int data = queue[FRONT];
        if(FRONT == REAR){
            FRONT = -1;
            REAR = -1;
        }else{
            FRONT++;
        }
        return data;
    }
}