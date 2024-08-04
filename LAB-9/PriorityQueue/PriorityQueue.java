public class PriorityQueue {
    int[] queue;
    int front, rear, size;

    public PriorityQueue(int size) {
        this.size = size;
        queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue_rear(int x) {
        if((rear+1)%size == front) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear+1)%size;
        queue[rear] = x;
        if(front == -1) front = 0;
        System.out.println("Element inserted successfully");
    }

    public void enqueue_front(int x) {
        if(front == 0) {
            if(rear == size-1) {
                System.out.println("Queue Overflow");
                return;
            }
            front = size - 1;
            queue[front] = x;
            System.out.println("Element inserted successfully");
        }
        else {
            if((front-1) == rear) {
                System.out.println("Queue Overflow");
                return;
            }
            front--;
            queue[front] = x;
            System.out.println("Element inserted successfully");
        }
        
    }

    public int dequeue_front() {
        if(front < 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = queue[front];
        if(front == rear) front = rear = -1;
        else front = (front+1)%size;
        return x;
    }

    public int dequeue_rear() {
        if(rear == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = queue[rear];
        if(front == rear) front = rear = -1;
        else {
            if(rear == 0) rear = size - 1;
            else rear--;
        }
        return x;
    }

    public void display() {
        if(front < 0) {
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        while(i != rear) {
            System.out.print(queue[i] + " ");
            i = (i+1) % size;
        }
        System.out.print(queue[i]);
        System.out.println();
    }

    public void insert(int x) {
        if(front == -1) {
            rear++;
            front++;
            queue[rear] = x;
            System.out.println("Element inserted successfully");
            return;
        }
        if(x < queue[front]) {
            enqueue_front(x);
        }
        else if(x >= queue[rear]) {
            enqueue_rear(x);
        }
        else {
            if((rear+1)%size == front) {
                System.out.println("Queue Overflow");
                return;
            }
            int i=(front+1)%size;
            while(x > queue[i]) {
                i=(i+1)%size;
            }   
            queue[(rear+1)%size] = queue[rear];
            rear = (rear+1)%size;
            int j;
            if(rear == 0) {
                j = size - 1;
            }
            else {
                j = rear - 1;
            }
            while(j != i) {
                if(j==0) {
                    queue[j] = queue[size - 1];
                    j = size - 1;
                }
                else {
                    queue[j] = queue[j-1];
                    j = j - 1;
                }
            }
            queue[j] = x;
            System.out.println("Element inserted successfully");
        }
    }

    public void delete(int x) {
        if(front == -1) {
            System.out.println("Queue Underflow");
            return;
        }
        if(x > queue[rear]) {
            System.out.println("Element doesn't exist");
            return;
        }
        if(x == queue[front]) {
            dequeue_front();
            System.out.println("Element deleted successfully");
        }
        else if(x == queue[rear]) {
            dequeue_rear();
            System.out.println("Element deleted successfully");
        }
        else {
            int i = (front+1)%size;
            while(x != queue[i]) {
                i = (i+1)%size;
            }
            int j = i;
            while(j != rear) {
                queue[j] = queue[(j+1)%size];
                j = (j+1)%size;
            }
            if(rear == 0) rear = size - 1;
            else rear = rear - 1;
            System.out.println("Element deleted successfully");
        }
    }
}
