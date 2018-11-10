package Pack1;

import Threads.Thread1;

public class Static {

    public static String version = "v1.3", title = "ID generator by Just Vice.", changeLog = "1.3 = You'll see a message when copying to clipboard an ID. Current ID's\npanel enhanced.\n1.2 = \"Copy to clipboard\" button without make another new ID or doing \nCTRL + C added. Bug fixed.\n1.1 = Improvements on syntax and overall user interface. \"Current\" tab added.";
    public static Start start = new Start();
    public static Run run = new Run();
    public static Data data = new Data();
    public static byte n = 0;

    public static void runDoneMessage() {
        Thread1 thread = new Thread1();
        thread.start();
    }
}
