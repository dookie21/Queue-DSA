package Queue;

public class QueueArray {

    private Product[] queue;
    private int front, rear, size, capacity;

    // constructor
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.queue = new Product[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    //check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    //check queue is full
    public boolean isFull() {
        return size == capacity;
    }

    //insert Product on queue after entering Product details
    public void enqueue(Product Product) {
        rear = (rear + 1) % capacity;
        queue[rear] = Product;
        size++;
        System.out.println("Product enqueued successfully!");
    }

    //remove Product on queue (FIFO)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY. Nothing to dequeue.");
            return;
        }
        Product dequeuedItem = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + dequeuedItem);
    }

    //display front Product on queue (FIFO)
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY. Nothing to peek.");
            return;
        }
        System.out.println("Peeked Product: " + queue[front]);
    }

    // display all Product on queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY. Nothing to display.");
            return;
        }
        System.out.println("PRODUCT QUEUE");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % capacity]);
        }
        System.out.println();
    }

    //change the capacity/size of the queue array
    public void changeCapacity(int newCapacity) {
        if (newCapacity < size) {
            System.out.println("New capacity cannot be smaller than the current queue size. Current size = " + capacity + "\nPlease try again!");
            return;
        }
        Product[] newQueue = new Product[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % capacity];
        }
        queue = newQueue;
        capacity = newCapacity;
        front = 0;
        rear = size - 1;
        System.out.println("Queue capacity change to: " + newCapacity);

    }
}
