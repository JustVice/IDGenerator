package Logic;

import Objects.Prefix;
import Objects.ID;
import java.io.Serializable;
import java.util.LinkedList;

public class UserData implements Serializable {

    private static final long serialVersionUID = 1904894385983490894L;
    private LinkedList<ID> ID_list = new LinkedList<ID>();
    private LinkedList<Prefix> Prefix_list = new LinkedList<Prefix>();

    public LinkedList<ID> getID_list() {
        return ID_list;
    }

    public void setID_list(LinkedList<ID> ID_list) {
        this.ID_list = ID_list;
    }

    public LinkedList<Prefix> getPrefix_list() {
        return Prefix_list;
    }

    public void setPrefix_list(LinkedList<Prefix> Prefix_list) {
        this.Prefix_list = Prefix_list;
    }

}
