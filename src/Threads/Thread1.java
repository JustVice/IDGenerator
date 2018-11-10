package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread {

    private int time = 720;

    /*Default = 702*/

    @Override
    public void run() {
        FrameTh f = new FrameTh();
        f.setVisible(true);
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.dispose();
    }

    public void setTime(int time) {
        this.time = time;
    }

}
