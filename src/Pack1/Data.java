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

    public String OldDataContainerPath = "data.dat";
    public String DataContainerPath = "datav2.dat";
    public String DataFolder = "IDGenerator data";
    public LinkedList<ID> list_dir = new LinkedList<ID>();
    private UserData userData = new UserData();

    public void LoadData() {
        System.out.print("Loading data... ");
        File path = new File(DataFolder);
        path.mkdir();
        path = new File(DataFolder + "\\" + DataContainerPath);
        if (!path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(DataFolder + "\\" + DataContainerPath));
                writeFile.writeObject(userData);
                writeFile.close();
//                BuildTxtFile(Folder + "\\Readme", "Do not erase the .dat file. It keeps the history of IDs created and prevents the program to do a repeated ID");
                System.out.println("Folder of data created. V2");
            } catch (IOException e) {
                System.out.println("Error creating data file.");
                e.printStackTrace();
            }
        } else {
            try {
                ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(DataFolder + "\\" + DataContainerPath));
                userData = (UserData) getFile.readObject();
                System.out.println("done");
            } catch (IOException localIOException1) {
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading data.");
                e.printStackTrace();
            }
        }
    }

    /**
     * There were changes made in order to make the code with the posibility of
     * more easier developement. For old data, this method will be called to
     * update the data.dat file to datav2.dat
     */
    public void LoadOldData() {
//        System.out.print("Loading data... ");
        File path = new File(DataFolder);
        path.mkdir();
        path = new File(DataFolder + "\\" + OldDataContainerPath);
        if (path.exists()) {
            try {
                ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(DataFolder + "\\" + OldDataContainerPath));
                list_dir = (LinkedList) getFile.readObject();
                System.out.print("rewriting old data files...");
                for (ID item : this.list_dir) {
                    this.userData.getID_list().add(item);
                }
                getFile.close();
                path.delete();
                System.out.println("Done");
            } catch (IOException localIOException1) {
                System.out.println("Error loading data.");
                localIOException1.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading data.");
                e.printStackTrace();
            }
        } else {
//            try {
////                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(DataFolder + "\\" + OldDataContainerPath));
////                writeFile.writeObject(list_dir);
////                writeFile.close();
////                BuildTxtFile(Folder + "\\Readme", "Do not erase the .dat file. It keeps the history of IDs created and prevents the program to do a repeated ID");
//            } catch (IOException e) {
//                System.out.println("Error creating data file.");
//                e.printStackTrace();
//            }
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
        File path = new File(DataFolder + "\\" + DataContainerPath);
        if (path.exists()) {
            try {
                System.out.print("saving data...");
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(DataFolder + "\\" + DataContainerPath));
                writeFile.writeObject(this.userData);
                writeFile.close();
                System.out.println("success");
            } catch (IOException e) {
                System.out.println("Error loading data002\n\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

    public String getOldDataContainerPath() {
        return OldDataContainerPath;
    }

    public void setOldDataContainerPath(String OldDataContainerPath) {
        this.OldDataContainerPath = OldDataContainerPath;
    }

    public String getDataContainerPath() {
        return DataContainerPath;
    }

    public void setDataContainerPath(String DataContainerPath) {
        this.DataContainerPath = DataContainerPath;
    }

    public String getDataFolder() {
        return DataFolder;
    }

    public void setDataFolder(String DataFolder) {
        this.DataFolder = DataFolder;
    }

    public LinkedList<ID> getList_dir() {
        return list_dir;
    }

    public void setList_dir(LinkedList<ID> list_dir) {
        this.list_dir = list_dir;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

}
