package Logic;

import java.awt.Image;
import java.awt.Toolkit;

public class Memory {

    public static String version = "v2.0", title = "ID Generator. " + version;
    public static Run run = new Run();
    public static Data data = new Data();
    public static byte inkiEasterEgg = 0;
    public static String dataFolderPath = System.getProperty("user.dir") + "\\IDGenerator data";
    public static String dataFilePath = dataFolderPath+"\\datav3.txt";

    
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
    
}
