import java.util.Scanner;

public class TextUI {
    Scanner scanner;

    public TextUI() {
        scanner = new Scanner(System.in);
    }

    public void printGreeting() {
        System.out.println("Welcome to the traffic management system!");

    }

    public int inputNumRoads() {
        System.out.print("Input the number of roads: ");
        return scanner.nextInt();
    }

    public int inputInterval() {
        System.out.print("Input the interval: ");
        return scanner.nextInt();
    }

    public void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. System");
        System.out.println("0. Quit");
    }

    public int inputSelection() {
        return scanner.nextInt();
    }

    public void processSelection(int selection) {
        switch (selection) {
            case 1:
                System.out.println("Road added");
                break;
            case 2:
                System.out.println("Road deleted");
                break;
            case 3:
                System.out.println("System opened");
                break;
            case 0:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("No option selected");
        }

    }


}
