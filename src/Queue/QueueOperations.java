package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueOperations {
    
    //ask user to input product info (assigned variables)
    public static Product getProductInfo() {
        System.out.print("Product Code: ");
            int code = UtilityScanner.scanner.nextInt();
            UtilityScanner.scanner.nextLine();
            System.out.print("Product Description: ");
            String description = UtilityScanner.scanner.nextLine();
            System.out.print("Product Quantity: ");
            int quantity = UtilityScanner.scanner.nextInt();
            System.out.print("Product Price: ");
            double price = UtilityScanner.scanner.nextDouble();
            System.out.print("Product Discount: ");
            double discount = UtilityScanner.scanner.nextDouble();

            return new Product(code, description, quantity, price, discount);
    }

    //QUEUE USING ARRAY and its operations
    public static void queueArray() {
        System.out.print("Enter queue capacity: "   );
        int capacity = UtilityScanner.scanner.nextInt();

        QueueArray arrayQueue = new QueueArray(capacity);

        while(true) {
            System.out.print("\nQUEUE USING ARRAY\n"
                    + "[1] - Display Queue\n"
                    + "[2] - Enqueue\n"
                    + "[3] - Dequeue\n"
                    + "[4] - Peek\n"
                    + "[5] - Change Size\n"
                    + "[0] - Back\n"
                    + "-> ");
            int choice = UtilityScanner.scanner.nextInt();

            switch (choice) {
                case 1:
                    arrayQueue.display();
                    break;

                case 2:
                    if (arrayQueue.isFull()) {
                        System.out.println("Queue is FULL, you can't enqueue!");
                        break;
                    }
                    Product newProduct = getProductInfo();
                    arrayQueue.enqueue(newProduct);
                    break;

                case 3:
                    arrayQueue.dequeue();
                    break;

                case 4:
                    arrayQueue.peek();
                    break;

                case 5:
                    System.out.print("Enter new queue capacity: ");
                    int newCapacity = UtilityScanner.scanner.nextInt();
                    arrayQueue.changeCapacity(newCapacity);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid Input, please try again!");
            }
        }
    }

    //Queue USING LINKEDLIST and its operations
    public static void queueLinkedList() {
        QueueLinkedList linkedListQueue = new QueueLinkedList();

        while(true) {
            System.out.print("\nQUEUE USING LINKED LIST\n"
                    + "[1] - Display Queue\n"
                    + "[2] - Enqueue\n"
                    + "[3] - Dequeue\n"
                    + "[4] - Peek\n"
                    + "[5] - Display Size\n"
                    + "[0] - Back\n"
                    + "-> ");
            int choice = UtilityScanner.scanner.nextInt();

            switch (choice) {
                case 1:
                    linkedListQueue.display();
                    break;

                case 2:
                    Product newProduct = getProductInfo();
                    linkedListQueue.enqueue(newProduct);
                    break;

                case 3:
                    linkedListQueue.dequeue();
                    break;

                case 4:
                    linkedListQueue.peek();
                    break;
                    
                case 5:
                    linkedListQueue.displaySize();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid Input, please try again!");
            }
        }
    }
    
    //QUEUE USING CLASS IN JAVA and its operations
    public static void queueJavaClass() {
        Queue<Product> queueClass = new LinkedList<Product>();
        
        while(true) {
            System.out.print("\nQUEUE CLASS IN JAVA\n"
                    + "[1] - Display Queue\n"
                    + "[2] - Enqueue\n"
                    + "[3] - Dequeue\n"
                    + "[4] - Peek\n"
                    + "[5] - Display Size\n"
                    + "[6] - Delete All\n"
                    + "[0] - Back\n"
                    + "-> ");
            int choice = UtilityScanner.scanner.nextInt();
            
            switch(choice) {
                case 1:
                    if(queueClass.isEmpty()) {
                        System.out.println("Queue is EMPTY. Nothing to display.");
                    }
                    System.out.println("PRODUCT QUEUE");
                    for(Product product : queueClass) {
                        System.out.println(product);
                    }
                    break;
                    
                case 2:
                    Product newProduct = getProductInfo();
                    queueClass.offer(newProduct);
                    System.out.println("Product enqueued successfully!");
                    break;
                    
                case 3:
                    Product dequeuedProduct = queueClass.poll();
                    if(dequeuedProduct == null) {
                        System.out.println("Queue is EMPTY. Nothing to dequeue.");
                    }
                    else {
                        System.out.println("Dequeued product: " + dequeuedProduct);   
                    }
                    break;
                    
                case 4:
                    Product peekedProduct = queueClass.peek();
                    if(queueClass == null) {
                        System.out.println("Queue is EMPTY. Nothing to peek.");
                    }
                    else {
                        System.out.println("Peeked: " + peekedProduct);
                    }
                    break;
                    
                case 5:
                    System.out.println("Queue size is " + queueClass.size());
                    break;
                    
                case 6:
                    queueClass.clear();
                    System.out.println("All products on queue DELETED successfully!");
                    break;
                    
                case 0:
                    return;
                    
                default:
                    System.out.println("Invalid Input, please try again.");
            }
        }
    }
}
//operations inside QUEUE DATA STRUCTURES MENU
