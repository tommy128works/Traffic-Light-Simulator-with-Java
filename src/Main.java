public class Main {
    public static void main(String[] args) {
        TextUI textUI = new TextUI();
        textUI.printGreeting();
        int numRoads = textUI.inputNumRoads();
        int interval = textUI.inputInterval();

        while (true) {
            textUI.printMenu();
            int selection = textUI.inputSelection();
            textUI.processSelection(selection);
            if (selection == 0) {
                break;
            }
        }

    }
}
