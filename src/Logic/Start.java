package Logic;

import Objects.Prefix;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    private final DefaultListModel<Prefix> prefixes_model = new DefaultListModel<>();

    public Start() {
        initComponents();
        settings();
    }

    //Settings loaded when this frame is called.
    private void settings() {
        panelExistingIdsAndPrefixesSettings();
        loadPrefixesFromUserDataAndSetIntoJListAndComboBox();
        userInterfaceButtonsLabelsAndRadioButtonsSettings();
        frameSettingsAndDisplay();
    }

    private void panelExistingIdsAndPrefixesSettings() {
        jTextArea_existingIdsAndPrefixes.setEditable(false);
        jTextArea_existingIdsAndPrefixes.setLineWrap(true);
        jTextArea_existingIdsAndPrefixes.setWrapStyleWord(true);
        jTextArea_existingIdsAndPrefixes.setCaretPosition(0);
    }

    private void loadPrefixesFromUserDataAndSetIntoJListAndComboBox() {
        this.prefixes_model.clear();
        this.jComboBox1_prefixes.removeAllItems();
        if (!Memory.data.getUserData().getPrefix_list().isEmpty()) {
            jList1_prefixes.setEnabled(true);
            for (Prefix item : Memory.data.getUserData().getPrefix_list()) {
                this.prefixes_model.add(0, item);
                this.jComboBox1_prefixes.addItem(item.toString());
            }
            jList1_prefixes.setModel(prefixes_model);
        } else {
            jList1_prefixes.setEnabled(false);
        }
    }

    private void userInterfaceButtonsLabelsAndRadioButtonsSettings() {
        jRadioButton1_add_prefix.setSelected(false);
        jComboBox1_prefixes.setVisible(false);
        jButton1_delete_prefix.setEnabled(false);
        jtextField_newId.setEditable(false);
        jButton_copyCreatedIdIntoClipboard.setEnabled(false);
        jButton_copyManualIdIntoClipBoard.setEnabled(false);
        labelStatus("", "black");
        jLabel_versionLabel.setText(Memory.version);
        setTitle(Memory.title);
        setIconImage(Memory.getIconImage());
    }

    private void frameSettingsAndDisplay() {
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jtextField_newId = new javax.swing.JTextField();
        jButton_generateNewID = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_versionLabel = new javax.swing.JLabel();
        jButton_copyCreatedIdIntoClipboard = new javax.swing.JButton();
        jRadioButton_generateIdWithOnlyNumbers = new javax.swing.JRadioButton();
        jLabel6_status_main = new javax.swing.JLabel();
        jRadioButton1_add_prefix = new javax.swing.JRadioButton();
        jComboBox1_prefixes = new javax.swing.JComboBox<>();
        jComboBox1_idLenght = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_new_prefix = new javax.swing.JTextField();
        jButton1_add_new_prefix = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1_prefixes = new javax.swing.JList<>();
        jButton1_delete_prefix = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_existingIdsAndPrefixes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtextField_manualId = new javax.swing.JTextField();
        jButton_saveManualId = new javax.swing.JButton();
        jButton_copyManualIdIntoClipBoard = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        twitterLabel = new javax.swing.JLabel();
        githubLabel = new javax.swing.JLabel();
        AllLinksLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jtextField_newId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton_generateNewID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_generateNewID.setText("Generate new and copy to clipboard");
        jButton_generateNewID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generateNewIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("IDGenerator");

        jLabel_versionLabel.setText("version");
        jLabel_versionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_versionLabelMouseClicked(evt);
            }
        });

        jButton_copyCreatedIdIntoClipboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_copyCreatedIdIntoClipboard.setText("Copy to clipboard");
        jButton_copyCreatedIdIntoClipboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_copyCreatedIdIntoClipboardActionPerformed(evt);
            }
        });

        jRadioButton_generateIdWithOnlyNumbers.setText("Generate only numeric IDs");

        jLabel6_status_main.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_status_main.setText("STATUS");

        jRadioButton1_add_prefix.setText("Add prefix");
        jRadioButton1_add_prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_add_prefixActionPerformed(evt);
            }
        });

        jComboBox1_idLenght.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 block", "2 blocks", "3 blocks", "4 blocks" }));

        jLabel6.setText("ID size:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_generateNewID, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_copyCreatedIdIntoClipboard, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton_generateIdWithOnlyNumbers))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox1_idLenght, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1_add_prefix)
                        .addGap(19, 19, 19)
                        .addComponent(jComboBox1_prefixes, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtextField_newId, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6_status_main)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_versionLabel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_versionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_generateNewID)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_copyCreatedIdIntoClipboard)
                    .addComponent(jRadioButton_generateIdWithOnlyNumbers))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jComboBox1_idLenght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1_add_prefix)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox1_prefixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jtextField_newId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6_status_main)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main menu", jPanel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Prefixes");

        jLabel5.setText("New prefix");

        jTextField1_new_prefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_new_prefixKeyTyped(evt);
            }
        });

        jButton1_add_new_prefix.setText("Add prefix to list");
        jButton1_add_new_prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_add_new_prefixActionPerformed(evt);
            }
        });

        jList1_prefixes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jList1_prefixesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jList1_prefixes);

        jButton1_delete_prefix.setText("Delete selected prefix");
        jButton1_delete_prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_delete_prefixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1_new_prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_add_new_prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_delete_prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(jTextField1_new_prefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton1_add_new_prefix)
                .addGap(11, 11, 11)
                .addComponent(jButton1_delete_prefix))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Prefixes", jPanel5);

        jTextArea_existingIdsAndPrefixes.setColumns(20);
        jTextArea_existingIdsAndPrefixes.setRows(5);
        jScrollPane1.setViewportView(jTextArea_existingIdsAndPrefixes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DataStored", jPanel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Create manual ID");

        jtextField_manualId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtextField_manualId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextField_manualIdKeyTyped(evt);
            }
        });

        jButton_saveManualId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_saveManualId.setText("Save manual ID and copy to clipboard");
        jButton_saveManualId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveManualIdActionPerformed(evt);
            }
        });

        jButton_copyManualIdIntoClipBoard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_copyManualIdIntoClipBoard.setText("Copy to clipboard");
        jButton_copyManualIdIntoClipBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_copyManualIdIntoClipBoardActionPerformed(evt);
            }
        });

        jLabel8.setText("Write text inside the text field and save it as an ID.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextField_manualId)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton_saveManualId)
                            .addComponent(jButton_copyManualIdIntoClipBoard)
                            .addComponent(jLabel8))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addComponent(jtextField_manualId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_saveManualId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_copyManualIdIntoClipBoard)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create manual", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

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

        jLabel9.setText("VICE's links");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(twitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(githubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(AllLinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(githubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllLinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveManualIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveManualIdActionPerformed
        if (idNotRepeatedInsideDataFile(this.jtextField_manualId.getText())
                && isThereAnIdTypedAtManualIdJtextField()) {
            saveManualIdInsideDataFile();
        }
    }//GEN-LAST:event_jButton_saveManualIdActionPerformed

    private boolean idNotRepeatedInsideDataFile(String idToManage) {
        for (int i = 0; i < Memory.data.getUserDataIdsSize(); i++) {
            if (idToManage.equals(Memory.data.getUserData().getID_list().get(i).getIDString())) {
                Run.message("ID " + idToManage + " already exists.", "ID repeated", 0);
                return false;
            }
        }
        return true;
    }

    private boolean isThereAnIdTypedAtManualIdJtextField() {
        if (!this.jtextField_manualId.getText().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    private void saveManualIdInsideDataFile() {
        Memory.data.saveIdIntoUserData(this.jtextField_manualId.getText());
        Memory.data.updateInfo();
        Run.copyToClipBoard(this.jtextField_manualId.getText());
        jButton_copyManualIdIntoClipBoard.setEnabled(true);
        Run.runDoneMessage("Done!");
    }

    private void jButton_generateNewIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generateNewIDActionPerformed
        String idGenerated = "";
        idGenerated = giveIdToTheIdGenerated();
        idGenerated = setPrefixIfEnabled(idGenerated);
        if (idNotRepeatedInsideDataFile(idGenerated)) {
            saveIdGeneratedIntoDataFile(idGenerated);
            userInterfaceChangesWhenNewIdGeneratedAndCopyToClipBoard(idGenerated);
        }
    }//GEN-LAST:event_jButton_generateNewIDActionPerformed

    private String setPrefixIfEnabled(String idGenerated) {
        if (this.jRadioButton1_add_prefix.isSelected()) {
            if (Memory.data.isThereAtLeastOnePrefixSaved()) {
                StringBuilder stringBuilderToAddThePrefix = new StringBuilder(idGenerated);
                stringBuilderToAddThePrefix.insert(0, this.jComboBox1_prefixes.getSelectedItem().toString());
                return stringBuilderToAddThePrefix.toString();
            } else {
                return idGenerated;
            }
        } else {
            return idGenerated;
        }
    }

    private String giveIdToTheIdGenerated() {
        String temporalId = "";
        switch (this.jComboBox1_idLenght.getSelectedItem().toString()) {
            case "1 block":
                temporalId = Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                return temporalId;
            case "2 blocks":
                temporalId = Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                temporalId += "-" + Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                return temporalId;
            case "3 blocks":
                temporalId = Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                temporalId += "-" + Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                temporalId += "-" + Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                return temporalId;
            case "4 blocks":
                temporalId = Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                temporalId += "-" + Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                temporalId += "-" + Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                temporalId += "-" + Memory.run.generateID(jRadioButton_generateIdWithOnlyNumbers.isSelected());
                return temporalId;
            default:
                throw new AssertionError();
        }
    }

    private void userInterfaceChangesWhenNewIdGeneratedAndCopyToClipBoard(String idGenerated) {
        this.jtextField_newId.setText(idGenerated);
        this.jButton_copyCreatedIdIntoClipboard.setEnabled(true);
        Run.copyToClipBoard(idGenerated);
        labelStatus("ID saved and copied to clipboard", "green");
    }

    private void saveIdGeneratedIntoDataFile(String idGenerated) {
        Memory.data.saveIdIntoUserData(idGenerated);
        Memory.data.updateInfo();
    }

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String idsStored = loadIdsToShowOnStoredIdsPanel();
        String prefixesStored = loadPrefixesToShowOnStoredIdsPanel();
        //Refactor variables with organized info
        idsStored = organizeIdsStoredInfoForjTextPanel(idsStored);
        prefixesStored = organizePrefixesStoredInfoForjTextPanel(prefixesStored);
        setTextInsideJTextPanelToShowStoredIdsAndPrefixes(idsStored, prefixesStored);
        //Put the scroll at the top of the textArea panel.
        jTextArea_existingIdsAndPrefixes.setCaretPosition(0);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private String loadIdsToShowOnStoredIdsPanel() {
        String idsStored = "";
        if (Memory.data.getUserDataIdsSize() > 0) {
            for (int i = 0; i < Memory.data.getUserDataIdsSize(); i++) {
                idsStored += Memory.data.getUserData().getID_list().get(i).toString() + " , ";
            }
            return idsStored;
        } else {
            return "No IDs stored.";
        }
    }

    private String loadPrefixesToShowOnStoredIdsPanel() {
        String prefixesStored = "";
        if (Memory.data.getUserDataPrefixesSize() > 0) {
            for (int i = 0; i < Memory.data.getUserDataPrefixesSize(); i++) {
                prefixesStored += Memory.data.getUserData().getPrefix_list().get(i).toString() + " , ";
            }
            return prefixesStored;
        } else {
            return "No prefixes stored.";
        }
    }

    private String organizeIdsStoredInfoForjTextPanel(String idsStored) {
        String idsStoredText = "";
        if (!idsStored.equals("No IDs stored.")) {
            idsStoredText += "Number of IDs created: " + Memory.data.getUserDataIdsSize();
            idsStoredText += "\n";
            idsStoredText += "IDs created:\n\n " + idsStored;
            idsStoredText += "\n\n";
            return idsStoredText;
        } else {
            return idsStored + "\n\n";
        }
    }

    private String organizePrefixesStoredInfoForjTextPanel(String prefixesStored) {
        String prefixesStoredText = "";
        if (!prefixesStored.equals("No prefixes stored.")) {
            prefixesStoredText += "Number of Prefixes created: " + Memory.data.getUserDataPrefixesSize();
            prefixesStoredText += "\n";
            prefixesStoredText += "Prexises created:\n\n " + prefixesStored;
            return prefixesStoredText;
        } else {
            return prefixesStored + "\n\n";
        }
    }

    private void setTextInsideJTextPanelToShowStoredIdsAndPrefixes(String idsStored, String prefixesStored) {
        String textToSetInsidejTextPanelToShowStoredIdsAndPrefixes = "";
        textToSetInsidejTextPanelToShowStoredIdsAndPrefixes += idsStored;
        textToSetInsidejTextPanelToShowStoredIdsAndPrefixes += prefixesStored;
        this.jTextArea_existingIdsAndPrefixes.setText(textToSetInsidejTextPanelToShowStoredIdsAndPrefixes);
    }

    private void jButton_copyCreatedIdIntoClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_copyCreatedIdIntoClipboardActionPerformed
        if (jButton_copyCreatedIdIntoClipboard.isEnabled()) {
            Run.copyToClipBoard(this.jtextField_newId.getText());
            Run.runDoneMessage("Copied to clipboard!");
            labelStatus("", "green");
        }
    }//GEN-LAST:event_jButton_copyCreatedIdIntoClipboardActionPerformed

    private void jButton_copyManualIdIntoClipBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_copyManualIdIntoClipBoardActionPerformed
        if (jButton_copyManualIdIntoClipBoard.isEnabled()) {
            Run.copyToClipBoard(this.jtextField_manualId.getText());
            Run.runDoneMessage("Copied to clipboard!");
            labelStatus("", "green");
        }
    }//GEN-LAST:event_jButton_copyManualIdIntoClipBoardActionPerformed

    private void jtextField_manualIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextField_manualIdKeyTyped
        jButton_copyManualIdIntoClipBoard.setEnabled(false);
    }//GEN-LAST:event_jtextField_manualIdKeyTyped

    private void twitterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterLabelMouseClicked
        openLink("http://split-vice.com/s/twitter");
    }//GEN-LAST:event_twitterLabelMouseClicked

    private void githubLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubLabelMouseClicked
        openLink("http://split-vice.com/s/github-repos");
    }//GEN-LAST:event_githubLabelMouseClicked

    private void AllLinksLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllLinksLabelMouseClicked
        openLink("http://split-vice.com/links");
    }//GEN-LAST:event_AllLinksLabelMouseClicked

    private void jButton1_add_new_prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_add_new_prefixActionPerformed
        addPrefixActionPerformed();
    }//GEN-LAST:event_jButton1_add_new_prefixActionPerformed

    private void addPrefixActionPerformed() {
        String newPrefix = this.jTextField1_new_prefix.getText();
        if (isPrefixNotRepeatedInsideDataFile(newPrefix)) {
            savePrefixIntoDataFile(newPrefix);
            uiChangesWhenANewPrefixIsSaved();
        }
    }

    private boolean isPrefixNotRepeatedInsideDataFile(String newPrefix) {
        for (int i = 0; i < Memory.data.getUserDataPrefixesSize(); i++) {
            if (newPrefix.equals(Memory.data.getUserData().getPrefix_list().get(i).getPrefix())) {
                Run.message("Prefix " + newPrefix + " already exists.", "ID repeated", 0);
                return false;
            }
        }
        return true;
    }

    private void savePrefixIntoDataFile(String newPrefix) {
        Memory.data.getUserData().getPrefix_list().add(new Prefix(newPrefix));
        Memory.data.updateInfo();
    }

    private void uiChangesWhenANewPrefixIsSaved() {
        jTextField1_new_prefix.setText("");
        loadPrefixesFromUserDataAndSetIntoJListAndComboBox();
    }

    private void jList1_prefixesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1_prefixesMouseReleased
        if (jList1_prefixes.isEnabled()) {
            jButton1_delete_prefix.setEnabled(true);
        } else {
            jButton1_delete_prefix.setEnabled(false);
        }
    }//GEN-LAST:event_jList1_prefixesMouseReleased

    private void jButton1_delete_prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_delete_prefixActionPerformed
        try {
            int prefixSelectedItemIndex = jList1_prefixes.getSelectedIndex();
            Prefix prefixToDelete = prefixes_model.get(prefixSelectedItemIndex);
            deletePrefixFromDataFileAndSaveInfo(prefixToDelete);
            loadPrefixesFromUserDataAndSetIntoJListAndComboBox();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1_delete_prefixActionPerformed

    private void deletePrefixFromDataFileAndSaveInfo(Prefix item) {
        for (int i = 0; i < Memory.data.getUserData().getPrefix_list().size(); i++) {
            if (Memory.data.getUserData().getPrefix_list().get(i).getID() == item.getID()) {
                Memory.data.getUserData().getPrefix_list().remove(i);
                System.out.println("Prefix " + item.getPrefix() + " deleted.");
                break;
            }
        }
        Memory.data.updateInfo();
    }

    private void jRadioButton1_add_prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_add_prefixActionPerformed
        showPrefixesComboBoxToSelectAPrefixToTheID();
    }//GEN-LAST:event_jRadioButton1_add_prefixActionPerformed

    private void showPrefixesComboBoxToSelectAPrefixToTheID() {
        boolean isRadioButtonSelected = jRadioButton1_add_prefix.isSelected();
        if (isRadioButtonSelected) {
            jComboBox1_prefixes.setVisible(true);
        } else {
            jComboBox1_prefixes.setVisible(false);
        }
    }

    private void jTextField1_new_prefixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_new_prefixKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            addPrefixActionPerformed();
        }
    }//GEN-LAST:event_jTextField1_new_prefixKeyTyped

    private void jLabel_versionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_versionLabelMouseClicked
        if (Memory.inkiEasterEgg == 2) {
            JOptionPane.showMessageDialog(jTextArea_existingIdsAndPrefixes, "Inki wasn't here.", Memory.title, 3);
        } else {
            Memory.inkiEasterEgg++;
        }
    }//GEN-LAST:event_jLabel_versionLabelMouseClicked

    private void labelStatus(String text, String color) {
        switch (color) {
            case "red":
                jLabel6_status_main.setForeground(Color.red);
                break;
            case "green":
                jLabel6_status_main.setForeground(Color.green);
                break;
            case "black":
                jLabel6_status_main.setForeground(Color.black);
                break;
            default:
                jLabel6_status_main.setText(text);
                jLabel6_status_main.setForeground(Color.red);
                throw new AssertionError();
        }
        jLabel6_status_main.setText(text);
    }

    private void openLink(String link) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllLinksLabel;
    private javax.swing.JLabel githubLabel;
    private javax.swing.JButton jButton1_add_new_prefix;
    private javax.swing.JButton jButton1_delete_prefix;
    private javax.swing.JButton jButton_copyCreatedIdIntoClipboard;
    private javax.swing.JButton jButton_copyManualIdIntoClipBoard;
    private javax.swing.JButton jButton_generateNewID;
    private javax.swing.JButton jButton_saveManualId;
    private javax.swing.JComboBox<String> jComboBox1_idLenght;
    private javax.swing.JComboBox<String> jComboBox1_prefixes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6_status_main;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_versionLabel;
    private javax.swing.JList<Prefix> jList1_prefixes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1_add_prefix;
    private javax.swing.JRadioButton jRadioButton_generateIdWithOnlyNumbers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea_existingIdsAndPrefixes;
    private javax.swing.JTextField jTextField1_new_prefix;
    private javax.swing.JTextField jtextField_manualId;
    private javax.swing.JTextField jtextField_newId;
    private javax.swing.JLabel twitterLabel;
    // End of variables declaration//GEN-END:variables
}
