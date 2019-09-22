package Objects;

import java.io.Serializable;

public class Prefix implements Serializable {

    private static final long serialVersionUID = 7293482399892873498L;

    private String prefix;
    private int ID;
    private String description;

    public Prefix() {
        this.ID = ((int) (Math.random() * 100000));
    }

    public Prefix(String prefix_name) {
        this.ID = ((int) (Math.random() * 100000));
        this.prefix = prefix_name;
    }

    public Prefix(String prefix, int ID, String description) {
        this.prefix = prefix;
        this.ID = ID;
        this.description = description;
    }

    @Override
    public String toString() {
        return prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
