package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Data {

    private UserData userData = new UserData();

    public void dataManage() {
        createDataFolderIfItDoesntExist(Memory.dataFolderPath);
        File dataFilePath = new File(Memory.dataFilePath);
        if (!dataFilePath.exists()) {
            writeData();
        } else {
            loadData();
        }
    }

    private void loadData() {
        try {
            System.out.print("loading data... ");
            ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(Memory.dataFilePath));
            userData = (UserData) getFile.readObject();
            System.out.println("success");
        } catch (IOException localIOException1) {
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading data.");
            e.printStackTrace();
        }
    }

    private void writeData() {
        try {
            System.out.print("Creating data file... ");
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Memory.dataFilePath));
            writeFile.writeObject(userData);
            writeFile.close();
            System.out.println("success");
        } catch (IOException e) {
            System.out.println("Error creating data file.");
            e.printStackTrace();
        }
    }

    public void updateInfo() {
        File dataFilePath = new File(Memory.dataFilePath);
        if (dataFilePath.exists()) {
            try {
                System.out.print("saving data... ");
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(dataFilePath));
                writeFile.writeObject(userData);
                writeFile.close();
                System.out.println("success");
            } catch (IOException e) {
                System.out.println("Error updating data");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

    private void createDataFolderIfItDoesntExist(String folderName) {
        String path = folderName;
        File dataFolderPath = new File(path);
        if (!dataFolderPath.exists()) {
            boolean created = dataFolderPath.mkdir();
            if (created) {
                System.out.println("Data folder created");
            }
        } else {
            System.out.println("Data folder found");
        }
    }

    public UserData getUserData() {
        return userData;
    }

    public void DeleteData() {
        userData = new UserData();
        updateInfo();
    }

    public int getUserDataIdsSize() {
        return this.userData.getID_list().size();
    }

    public int getUserDataPrefixesSize() {
        return this.userData.getPrefix_list().size();
    }

    public void saveIdIntoUserData(String idGenerated) {
        this.userData.getID_list().add(new Objects.ID(idGenerated));
    }

    public boolean isThereAtLeastOnePrefixSaved() {
        if (this.userData.getPrefix_list().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
