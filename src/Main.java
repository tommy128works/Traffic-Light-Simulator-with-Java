public class Main {
    public static void main(String[] args) throws InterruptedException {
        TextUI textUI = new TextUI();
        textUI.printGreeting();
        int numRoads = textUI.inputNumRoads();
        int interval = textUI.inputInterval();
        QueueThread queueThread = new QueueThread();
        queueThread.setName("QueueThread");
        queueThread.start();
        while (true) {
            textUI.printMenu();
            int selection = textUI.inputSelection();
            textUI.processSelection(selection);
            if (selection == 0) {
                break;
            } else if (selection == 3) {
                while (true) {
                    int countSeconds = queueThread.getCountSeconds();
                    textUI.printSystemState(countSeconds, numRoads, interval);
                    Thread.sleep(1000);
                }
                // print screen
                // wait 1 sec
                // while loop with
            }

//            textUI.clearOutput();
        }
        queueThread.stopRunning();
    }
}
