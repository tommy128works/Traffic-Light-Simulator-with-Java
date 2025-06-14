import java.io.IOException;
import java.util.Scanner;

public class TextUI {
    Scanner scanner;

    public TextUI() {
        scanner = new Scanner(System.in);
    }

    public void printGreeting() {
        System.out.println("Welcome to the traffic management system!");

    }

    private int isInteger(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int inputNumRoads() {
        System.out.print("Input the number of roads: ");
        String input = scanner.nextLine();

        while (isInteger(input) <= 0) {
            System.out.print("Error! Incorrect Input. Try again: ");
            input = scanner.nextLine();
        }

        return Integer.parseInt(input);
    }

    public int inputInterval() {
        System.out.print("Input the interval: ");
        String input = scanner.nextLine();

        while (isInteger(input) <= 0) {
            System.out.print("Error! Incorrect Input. Try again: ");
            input = scanner.nextLine();
        }

        return Integer.parseInt(input);
    }

    public void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add road");
        System.out.println("2. Delete road");
        System.out.println("3. Open system");
        System.out.println("0. Quit");
    }

    public int inputSelection() {
        return scanner.nextInt();
    }

    // better naming is output textUI for selection
    // the process service would be part of the logic controller
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
                System.out.println("Incorrect option");
        }
    }

    public void clearOutput() {
        scanner.nextLine();

        // Doesn't work in IntelliJ IDEA
//        try {
//            var clearCommand = System.getProperty("os.name").contains("Windows")
//                    ? new ProcessBuilder("cmd", "/c", "cls")
//                    : new ProcessBuilder("clear");
//            clearCommand.inheritIO().start().waitFor();
//        }
//        catch (IOException | InterruptedException e) {}
    }

    public void printSystemState(int countSeconds, int numRoads, int interval) {
        System.out.println("! " + countSeconds + "s. have passed since system startup !");
        System.out.println("! Number of roads: " + numRoads + " !");
        System.out.println("! Interval: " + interval + " !");
    }


}
