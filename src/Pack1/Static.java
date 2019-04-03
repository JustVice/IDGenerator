package Pack1;

import Threads.Thread1;
import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    public static String version = "v1.7", title = "ID Generator";
    public static Run run = new Run();
    public static Data data = new Data();
    public static byte n = 0;

    public static void runDoneMessage() {
        Thread1 thread = new Thread1();
        thread.start();
    }
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
    
}
