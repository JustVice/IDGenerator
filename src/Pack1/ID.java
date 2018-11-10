
package Pack1;

import java.io.Serializable;

public class ID implements Serializable{
    
    private static final long serialVersionUID = 7526471155622776147L;
    
    private String IDString;

    public ID(String IDString) {
        this.IDString = IDString;
    }

    public String getIDString() {
        return IDString;
    }

    public void setIDString(String IDString) {
        this.IDString = IDString;
    }

    @Override
    public String toString() {
        return IDString;
    }
    
    
    
}
