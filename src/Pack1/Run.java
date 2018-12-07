package Pack1;

public class Run {

    public void RUN() {
        Static.data.LoadData();
//        currentIDs();
        Static.start.setVisible(true);
    }

    /**
     * Shows in console the all the IDs created so far.
     */
    private void currentIDs() {
        String str = "";
        for (int i = 0; i < Static.data.list_dir.size(); i++) {
            str += Static.data.list_dir.get(i).toString() + "\n";
        }
        if (str.equals("")) {
            System.out.println("No IDs stored");
        } else {
            System.out.println("Current: \n" + str + "Number of ID's stored: " + Static.data.list_dir.size());
        }
    }

    /**
     * Generates a new random ID of 8 characters long gathering numbers and one
     * letter.
     *
     * @return
     */
    public String generateID() {
        String str = "";
        int n = 0;
        int random = 0;
        String chars[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        random = (int) (Math.random() * 10000);
        n = (int) (Math.random() * 10);
        str = "" + random + chars[n] + (int) (Math.random() * 1000);
        System.out.println("Random generated: " + str);
        return str;
    }
}
