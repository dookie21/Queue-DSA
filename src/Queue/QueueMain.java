package Queue;

public class QueueMain {

    public static void queueMenu() {
            
        while(true) {
            System.out.print("\nQUEUE DATA STRUCTURE\n"
                    + "[1] Queue using Array\n"
                    + "[2] Queue using Linked List\n"
                    + "[3] Queue using Class in Java\n"
                    + "[0] Back to Main Menu\n"
                    + "-> ");
            int queueChoice = UtilityScanner.scanner.nextInt();

            switch (queueChoice) {
                case 1:
                    QueueOperations.queueArray();
                    break;

                case 2:
                    QueueOperations.queueLinkedList();
                    break;

                case 3:
                    QueueOperations.queueJavaClass();
                    break;

                case 0:
                    return;

                default:
                    break;
            }
        }
    }
}