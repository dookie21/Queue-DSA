import Queue.*;

public class Main {
    public static void main(String[] args) {
        int mainMenuChoice;
        
        do {
            System.out.print("MAIN MENU\n"
                    + "[4] - Queue Data Structure\n"
                    + "[0] - Exit\n"
                    + "-> ");
            mainMenuChoice = UtilityScanner.scanner.nextInt();
            
            switch(mainMenuChoice) {
                case 4:
                    QueueMain.queueMenu();
                    break;
                    
                case 0:
                    System.out.println("Process Ended. Thank You!");
                    break;
                    
                default:
                    System.out.println("Invalid input, please try again!");
            }
        } while(mainMenuChoice != 0);
    }
}
//this is the sample global main method