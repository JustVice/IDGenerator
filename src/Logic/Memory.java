package Logic;

import Threads.Thread1;
import java.awt.Image;
import java.awt.Toolkit;

public class Memory {

    public static String version = "v2.0", title = "ID Generator. " + version;
    public static Run run = new Run();
    public static Data data = new Data();
    public static byte inkiEasterEgg = 0;
    public static String dataFolderPath = "\\IDGenerator data";
    public static String dataFilePath = dataFolderPath+"\\datav3.dat";

    public static void runDoneMessage() {
        Thread1 thread = new Thread1();
        thread.start();
    }
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
    
}
