package Pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Data {

    public String TruePath = "data.dat";
    public String Folder = "IDGenerator data";
    public LinkedList<ID> list_dir = new LinkedList<ID>();

    /**
     * Fills the list_dir with the current data storaged on hard drive, also the
     * data will be saved and loaded from a folder.
     */
    public void LoadData() {
        System.out.print("Loading data... ");
        File path = new File(Folder);
        path.mkdir();
        path = new File(Folder + "\\" + TruePath);
        if (!path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Folder + "\\" + TruePath));
                writeFile.writeObject(list_dir);
                writeFile.close();
                BuildTxtFile(Folder + "\\Readme", "Do not erase the .dat file. It keeps the history of IDs created and prevents the program to do a repeated ID");
            } catch (IOException e) {
                System.out.println("Error creating data file.");
                e.printStackTrace();
            }
        } else {
            try {
                ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(Folder + "\\" + TruePath));
                list_dir = (LinkedList) getFile.readObject();
                System.out.println("done");
            } catch (IOException localIOException1) {
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading data.");
                e.printStackTrace();
            }
        }
    }

    public void BuildTxtFile(String pathName, String content) {
        File file = new File(pathName + ".txt");
        try {
            String frase = content;
            if (frase.equals("")) {
                frase = "No content.";
            }
            FileWriter escritura = new FileWriter(file.getPath());
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException ex) {
            System.out.println("Error\n" + ex);
        }
    }

    /**
     * Adds a new object in the LinkedList.
     *
     * @param ob
     */
    public void addNew(ID object) {
        this.list_dir.add(object);
    }

    /**
     * Updates the data file with a new password that user provided and stored
     * on the LinkedList.
     */
    public void updateInfo() {
        File path = new File(Folder + "\\" + TruePath);
        if (path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Folder + "\\" + TruePath));
                writeFile.writeObject(list_dir);
                writeFile.close();
            } catch (IOException e) {
                System.out.println("Error loading data002\n\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

}
