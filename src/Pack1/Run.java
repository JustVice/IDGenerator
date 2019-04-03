package Pack1;

import javax.swing.JOptionPane;

public class Run {

    public void RUN() {
        Static.data.LoadOldData();
        Static.data.LoadData();
//        currentIDs();
        Start start = new Start();
    }

    /**
     * Shows in console the all the IDs created so far.
     */
    private void currentIDs() {
        String str = "";
        for (int i = 0; i < Static.data.getUserData().getID_list().size(); i++) {
            str += Static.data.getUserData().getID_list().get(i).toString() + "\n";
        }
        if (str.equals("")) {
            System.out.println("No IDs stored");
        } else {
            System.out.println("Current: \n" + str + "Number of ID's stored: " + Static.data.getUserData().getID_list().size());
        }
    }

    /**
     * Generates a new random ID of 8 characters long gathering numbers and one
     * letter.
     *
     * @return
     */
    public String generateID(boolean onlyNumbersID) {
        String str = "";
        if (!onlyNumbersID) {
            str = "" + ((int)(Math.random() * 10000)) + randomLetter() + (int) (Math.random() * 1000);
        } else {
            str = "" + ((int)(Math.random() * 10000)) + ((int) (Math.random() * 10000));
        }
//        System.out.println("Random generated: " + str);
        return str;
    }

    private String randomLetter() {
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "O", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Z", "X", "Y"};
        String result = "";
        int randomLetterIndex = 0;
        while (true) {
            randomLetterIndex = ((int) (Math.random() * 100));
            if (randomLetterIndex <= 25) {
                break;
            }
        }
        result = alfabeto[randomLetterIndex];
        return result;
    }
    
    /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title
     */
    public void message(String message, String title, int type) {
        switch (type) {
            case 0:/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case 1:/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case 2:/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case 3:/*What*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

}
