package Threads;

public class MessagePopUp extends javax.swing.JFrame implements Runnable {

    public MessagePopUp(String message) {
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);

        initComponents();
        this.jLabel_message.setText(message);
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {

            this.setVisible(true);
            Thread.sleep(720);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_message.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_message.setText("Copied to clipboard!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_message)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_message)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_message;
    // End of variables declaration//GEN-END:variables
}
