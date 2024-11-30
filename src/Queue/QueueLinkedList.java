package Queue;

public class QueueLinkedList {
    private Node front, rear;
    private int size;

    //constructor
    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    //check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    //insert Product on queue
    public void enqueue(Product Product) {
        Node newNode = new Node(Product);

        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Product enqueued successfully!");
    }

    //remove first Product on queue (FIFO)
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is EMPTY. Nothing to dequeue.");
        }
        Product dequeuedItem = front.data;
        front = front.next;
        size--;

        System.out.println("Dequeued: " + dequeuedItem);
    }

    //display front Product on queue (FIFO)
    public void peek() {
        if(isEmpty()) {
            System.out.println("Queue is EMPTY. Nothing to peek.");
        }
        else {
            System.out.println("Peeked: " + front.data);
        }
    }

    //display all Product on queue
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is EMPTY. Nothing to display");
        }
        else {
            System.out.println("PRODUCT QUEUE");
            
            Node temp = front;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        System.out.println();
    }

    //display total Product on queue
    public void displaySize() {
        System.out.println("Total queue size is " + size);
    }
}