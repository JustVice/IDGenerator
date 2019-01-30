package Pack1;

import java.awt.Desktop;
import java.awt.Frame;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
                setIconImage(Static.getIconImage());
        setLocationRelativeTo(null);
        this.setResizable(false);
        versionLaber.setText(Static.version);
        setTitle(Static.title);
        newId.setEditable(false);
        PanelCurrentSet();
        CopyButtons();
        this.setVisible(true);
    }

    private void CopyButtons() {
        CopyCPUID.setEnabled(false);
        CopyManualID.setEnabled(false);
    }

    private void PanelCurrentSet() {
        panelCurrent.setEditable(false);
        panelCurrent.setCaretPosition(0);
        panelCurrent.setLineWrap(true);
        panelCurrent.setWrapStyleWord(true);
    }

    Clipboard clip = getToolkit().getSystemClipboard();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        newId = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        versionLaber = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CopyCPUID = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manualId = new javax.swing.JTextField();
        saveUnique = new javax.swing.JButton();
        CopyManualID = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelCurrent = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        twitterLabel = new javax.swing.JLabel();
        githubLabel = new javax.swing.JLabel();
        AllLinksLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        newId.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        generate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generate.setText("Generate new and copy to clipboard");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Random ID");

        versionLaber.setText("version");
        versionLaber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                versionLaberMouseClicked(evt);
            }
        });

        jButton1.setText("Change log");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CopyCPUID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CopyCPUID.setText("Copy to clipboard");
        CopyCPUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyCPUIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(versionLaber)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(newId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CopyCPUID)
                                    .addComponent(generate))
                                .addGap(0, 29, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(versionLaber))
                .addGap(18, 18, 18)
                .addComponent(generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CopyCPUID)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CPU", jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Manual ID");

        manualId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manualId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                manualIdKeyTyped(evt);
            }
        });

        saveUnique.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveUnique.setText("Save unique ID and copy to clipboard");
        saveUnique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUniqueActionPerformed(evt);
            }
        });

        CopyManualID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CopyManualID.setText("Copy to clipboard");
        CopyManualID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyManualIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(saveUnique)
                    .addComponent(manualId, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(CopyManualID)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(manualId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveUnique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CopyManualID)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manual", jPanel2);

        panelCurrent.setColumns(20);
        panelCurrent.setRows(5);
        jScrollPane1.setViewportView(panelCurrent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stored", jPanel3);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/title.png"))); // NOI18N

        twitterLabel.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        twitterLabel.setText("<html><a href=\"twitter.com/JustVice1\">TWITTER</a><html>");
        twitterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterLabelMouseClicked(evt);
            }
        });

        githubLabel.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        githubLabel.setText("<html><a href=\"https://github.com/JustVice?tab=repositories\">GITHUB</a><html>");
        githubLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                githubLabelMouseClicked(evt);
            }
        });

        AllLinksLabel.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        AllLinksLabel.setText("<html><a href=\"justvice.wixsite.com/info\">ALL LINKS</a><html>");
        AllLinksLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllLinksLabelMouseClicked(evt);
            }
        });

        jLabel4.setText("Made by Just Vice");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(twitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(githubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(AllLinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(githubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllLinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("About", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveUniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUniqueActionPerformed
        if (!manualId.getText().equals("")) {
            System.out.println("entro");
            boolean repeat = false;
            for (int i = 0; i < Static.data.list_dir.size(); i++) {
                if (Static.data.list_dir.get(i).toString().equals(manualId.getText())) {
                    System.out.println("Elemento repetido.");
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                Static.data.list_dir.add(new ID(manualId.getText()));
                System.out.println("List size: " + Static.data.list_dir.size());
                Static.data.updateInfo();
                clipboardManual();
                Static.runDoneMessage();
                CopyManualID.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "ID " + manualId.getText() + " already exists.", Static.title, 0);
                manualId.setText("");
            }
        } else {
            System.out.println("empty");
        }
    }//GEN-LAST:event_saveUniqueActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        String str = Static.run.generateID();
        boolean repeat = false;
        for (int i = 0; i < Static.data.list_dir.size(); i++) {
            if (Static.data.list_dir.get(i).toString().equals(str)) {
                System.out.println("Elemento repetido.");
                repeat = true;
                break;
            }
        }
        if (!repeat) {
            Static.data.list_dir.add(new ID(str));
            System.out.println("List size: " + Static.data.list_dir.size());
            newId.setText(str);
            Static.data.updateInfo();
            clipboardCPU();
            CopyCPUID.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "WHAT!? The ID that the system has generated already exists! That's incredible... please, try again.", Static.title, 0);
            newId.setText("");
        }
    }//GEN-LAST:event_generateActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String str = "";
        for (int i = 0; i < Static.data.list_dir.size(); i++) {
            str += Static.data.list_dir.get(i).toString() + " , ";
        }
        if (str.equals("")) {
            panelCurrent.setText("No IDs stored");
        } else {
            panelCurrent.setText("Number of ID's created: " + Static.data.list_dir.size() + "\n" + "ID's created (separated by commas):\n\n" + str);
            panelCurrent.setCaretPosition(0);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, Static.changeLog, Static.title, 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void versionLaberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_versionLaberMouseClicked
        if (Static.n == 2) {
            JOptionPane.showMessageDialog(panelCurrent, "Inki wasn't here.", Static.title, 3);
        } else {
            Static.n++;
        }
    }//GEN-LAST:event_versionLaberMouseClicked

    private void CopyCPUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyCPUIDActionPerformed
        if (CopyCPUID.isEnabled()) {
            clipboardCPU();
            Static.runDoneMessage();
        }
    }//GEN-LAST:event_CopyCPUIDActionPerformed

    private void CopyManualIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyManualIDActionPerformed
        if (CopyManualID.isEnabled()) {
            clipboardManual();
            Static.runDoneMessage();
        }
    }//GEN-LAST:event_CopyManualIDActionPerformed

    private void manualIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manualIdKeyTyped
        CopyManualID.setEnabled(false);
    }//GEN-LAST:event_manualIdKeyTyped

    private void twitterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterLabelMouseClicked
        openLink("https://twitter.com/JustVice1");
    }//GEN-LAST:event_twitterLabelMouseClicked

    private void githubLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubLabelMouseClicked
        openLink("https://github.com/JustVice?tab=repositories");
    }//GEN-LAST:event_githubLabelMouseClicked

    private void AllLinksLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllLinksLabelMouseClicked
        openLink("https://justvice.wixsite.com/info");
    }//GEN-LAST:event_AllLinksLabelMouseClicked

    private void openLink(String link){
    if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void clipboardCPU() {
        String toClipBoardText = newId.getText();
        StringSelection stringClip = new StringSelection(toClipBoardText);
        clip.setContents(stringClip, stringClip);
    }

    private void clipboardManual() {
        String toClipBoardText = manualId.getText();
        StringSelection stringClip = new StringSelection(toClipBoardText);
        clip.setContents(stringClip, stringClip);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllLinksLabel;
    private javax.swing.JButton CopyCPUID;
    private javax.swing.JButton CopyManualID;
    private javax.swing.JButton generate;
    private javax.swing.JLabel githubLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField manualId;
    private javax.swing.JTextField newId;
    private javax.swing.JTextArea panelCurrent;
    private javax.swing.JButton saveUnique;
    private javax.swing.JLabel twitterLabel;
    private javax.swing.JLabel versionLaber;
    // End of variables declaration//GEN-END:variables
}
