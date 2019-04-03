package Pack1;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame {

    private DefaultListModel<Prefix> prefix_model = new DefaultListModel<>();
    private Clipboard clip = getToolkit().getSystemClipboard();

    public Start() {
        initComponents();
        setIconImage(Static.getIconImage());
        settings();
    }

    private void settings() {
        setLocationRelativeTo(null);
        this.setResizable(false);
        versionLaber.setText(Static.version);
        setTitle(Static.title);
        newId.setEditable(false);
        PanelCurrentSet();
        CopyButtons();
        this.setVisible(true);
        jButton1_delete_prefix.setEnabled(false);
        set_prefixes_from_user_data();
        label_status_main_text("", "black");
        jRadioButton1_add_prefix.setSelected(false);
        jComboBox1_prefixes.setVisible(false);
        versionLaber.setVisible(false);
        jRadioButton1_dash.setSelected(true);
    }

    private void save_new_prefix_on_userData(Prefix new_item) {
        Static.data.getUserData().getPrefix_list().add(new_item);
        Static.data.updateInfo();
    }

    private void delete_prefix_from_user_data(Prefix item) {
        for (int i = 0; i < Static.data.getUserData().getPrefix_list().size(); i++) {
            if (Static.data.getUserData().getPrefix_list().get(i).getID() == item.getID()) {
                Static.data.getUserData().getPrefix_list().remove(i);
            }
        }
        Static.data.updateInfo();
    }

    private void set_prefixes_from_user_data() {
        if (!Static.data.getUserData().getPrefix_list().isEmpty()) {
            for (Prefix item : Static.data.getUserData().getPrefix_list()) {
                this.prefix_model.add(0, item);
            }
            jList1_prefixes.setModel(prefix_model);
        } else {
            jList1_prefixes.setEnabled(false);
        }
    }

    private void enable_disable_jlist() {
        if (!prefix_model.isEmpty()) {
            jList1_prefixes.setEnabled(true);
        } else {
            jList1_prefixes.setEnabled(false);
            jButton1_delete_prefix.setEnabled(false);
        }
    }

    private void set_model_to_jlist() {
        jList1_prefixes.setModel(prefix_model);
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

    private void label_status_main_text(String text, String color) {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        newId = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        versionLaber = new javax.swing.JLabel();
        CopyCPUID = new javax.swing.JButton();
        onlyNumericID = new javax.swing.JRadioButton();
        jLabel6_status_main = new javax.swing.JLabel();
        jRadioButton1_add_prefix = new javax.swing.JRadioButton();
        jComboBox1_prefixes = new javax.swing.JComboBox<>();
        jComboBox1_id_lenght = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1_dash = new javax.swing.JRadioButton();
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
        panelCurrent = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manualId = new javax.swing.JTextField();
        saveUnique = new javax.swing.JButton();
        CopyManualID = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        twitterLabel = new javax.swing.JLabel();
        githubLabel = new javax.swing.JLabel();
        AllLinksLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        newId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        generate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generate.setText("Generate new and copy to clipboard");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("IDGenerator");

        versionLaber.setText("version");
        versionLaber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                versionLaberMouseClicked(evt);
            }
        });

        CopyCPUID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CopyCPUID.setText("Copy to clipboard");
        CopyCPUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyCPUIDActionPerformed(evt);
            }
        });

        onlyNumericID.setText("Generate only numeric IDs");

        jLabel6_status_main.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_status_main.setText("STATUS");

        jRadioButton1_add_prefix.setText("Add prefix");
        jRadioButton1_add_prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_add_prefixActionPerformed(evt);
            }
        });

        jComboBox1_id_lenght.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 block", "2 blocks", "3 blocks" }));

        jLabel6.setText("ID size:");

        jRadioButton1_dash.setText("Dash between blocks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel6_status_main)
                .addGap(196, 196, 196)
                .addComponent(versionLaber))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CopyCPUID, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(onlyNumericID))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(jComboBox1_id_lenght, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jRadioButton1_dash))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButton1_add_prefix)
                .addGap(19, 19, 19)
                .addComponent(jComboBox1_prefixes, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(newId, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6_status_main))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(versionLaber)))
                .addGap(18, 18, 18)
                .addComponent(generate)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CopyCPUID)
                    .addComponent(onlyNumericID))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox1_id_lenght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton1_dash))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1_add_prefix)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox1_prefixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(newId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

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

        panelCurrent.setColumns(20);
        panelCurrent.setRows(5);
        jScrollPane1.setViewportView(panelCurrent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stored", jPanel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Manual ID");

        manualId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manualId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                manualIdKeyTyped(evt);
            }
        });

        saveUnique.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveUnique.setText("Save manual ID and copy to clipboard");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manualId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(saveUnique)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(CopyManualID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(manualId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveUnique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CopyManualID)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Manual", jPanel2);

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

        jLabel7.setText("Creator links:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(twitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(githubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AllLinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(githubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllLinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("About", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, Short.MAX_VALUE)
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
            for (int i = 0; i < Static.data.getUserData().getID_list().size(); i++) {
                if (Static.data.getUserData().getID_list().get(i).toString().equals(manualId.getText())) {
                    System.out.println("Elemento repetido.");
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                Static.data.getUserData().getID_list().add(new ID(manualId.getText()));
                System.out.println("List size: " + Static.data.getUserData().getID_list().size());
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
        generate_new_id_new_code();
    }//GEN-LAST:event_generateActionPerformed

    private void generate_new_id_new_code() {
        String new_id = "";
        if (jRadioButton1_add_prefix.isSelected()) {
            new_id += control_try_catch_give_prefix();
        }
        new_id += Static.run.generateID(onlyNumericID.isSelected());
        String combo_box_option = jComboBox1_id_lenght.getSelectedItem().toString();
        //System.out.println(combo_box_option);
        switch (combo_box_option) {
            case "1 block":
                break;
            case "2 blocks":
                new_id += add_dash_to_blocks() + Static.run.generateID(onlyNumericID.isSelected());
                break;
            case "3 blocks":
                new_id += add_dash_to_blocks() + Static.run.generateID(onlyNumericID.isSelected());
                new_id += add_dash_to_blocks() + Static.run.generateID(onlyNumericID.isSelected());
                break;
            default:
                throw new AssertionError();
        }
        if (!is_the_id_repeated(new_id)) {
            Static.data.getUserData().getID_list().add(new ID(new_id));
            System.out.println("List size: " + Static.data.getUserData().getID_list().size());
            newId.setText(new_id);
            Static.data.updateInfo();
            clipboardCPU();
            CopyCPUID.setEnabled(true);
            label_status_main_text("ID saved and copied to clipboard", "green");
        } else {
            Static.run.message("The ID generated is repeated!!! That's incredible! ... *cough*.. please try again.", "REPEATED ID!!!", 1);
        }
    }

    private String control_try_catch_give_prefix() {
        try {
            return jComboBox1_prefixes.getSelectedItem().toString();
        } catch (Exception e) {
            return "";
        }
    }

    private String add_dash_to_blocks() {
        if (jRadioButton1_dash.isSelected()) {
            return "-";
        } else {
            return "";
        }
    }

    private boolean is_the_id_repeated(String new_id) {
        for (ID item : Static.data.getUserData().getID_list()) {
            if (item.toString().equals(new_id)) {
                return true;
            }
        }
        return false;
    }

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String ids = "";
        for (int i = 0; i < Static.data.getUserData().getID_list().size(); i++) {
            ids += Static.data.getUserData().getID_list().get(i).toString() + " , ";
        }
        String prefixes = "";
        for (int i = 0; i < Static.data.getUserData().getPrefix_list().size(); i++) {
            prefixes += Static.data.getUserData().getPrefix_list().get(i).toString() + " , ";
        }
        if (ids.equals("")) {
            panelCurrent.setText("No IDs stored");
        } else {
            panelCurrent.setText("Number of ID's created: " + Static.data.getUserData().getID_list().size() + "\n" + "ID's created (separated by commas):\n\n" + ids);
            panelCurrent.setCaretPosition(0);
        }
        if (prefixes.equals("")) {
            panelCurrent.append("\n\nNo prefixes stored");
        } else {
            panelCurrent.append("\n\nPrefixes stored: " + Static.data.getUserData().getPrefix_list().size() + "\n" + "Prefixes stored (separated by commas):\n\n" + prefixes);
        }
        label_status_main_text("", "red");
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void CopyCPUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyCPUIDActionPerformed
        if (CopyCPUID.isEnabled()) {
            clipboardCPU();
            Static.runDoneMessage();
            label_status_main_text("", "black");
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

    private void jButton1_add_new_prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_add_new_prefixActionPerformed
        create_new_prefix();
    }//GEN-LAST:event_jButton1_add_new_prefixActionPerformed
    private void create_new_prefix() {
        if (no_existent_prefix(jTextField1_new_prefix.getText())) {
            if (!jTextField1_new_prefix.getText().equals("")) {
                Prefix temp_prefix = new Prefix(jTextField1_new_prefix.getText());
                prefix_model.add(0, temp_prefix);
                jTextField1_new_prefix.setText("");
                set_model_to_jlist();
                enable_disable_jlist();
                save_new_prefix_on_userData(temp_prefix);
            } else {
                System.out.println("Empty name");
            }
        } else {
            Static.run.message("Prefix " + jTextField1_new_prefix.getText() + " already exists.", "Exitent prefix", 1);
        }
    }

    private boolean no_existent_prefix(String item_name) {
        for (Prefix temp_prefix : Static.data.getUserData().getPrefix_list()) {
            if (temp_prefix.getPrefix().equals(item_name)) {
                return false;
            }
        }
        return true;
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
            int SelectedIndex = jList1_prefixes.getSelectedIndex();
            Prefix temp_prefix = prefix_model.get(SelectedIndex);
            prefix_model.removeElementAt(SelectedIndex);
            jTextField1_new_prefix.setText("");
            enable_disable_jlist();
            jButton1_delete_prefix.setEnabled(false);
            delete_prefix_from_user_data(temp_prefix);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1_delete_prefixActionPerformed

    private void jRadioButton1_add_prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_add_prefixActionPerformed
        if (jRadioButton1_add_prefix.isSelected()) {
            jComboBox1_prefixes.setVisible(true);
            for (Prefix item : Static.data.getUserData().getPrefix_list()) {
                jComboBox1_prefixes.addItem(item.getPrefix());
            }
        } else {
            jComboBox1_prefixes.removeAllItems();
            jComboBox1_prefixes.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1_add_prefixActionPerformed

    private void jTextField1_new_prefixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_new_prefixKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            create_new_prefix();
        }
    }//GEN-LAST:event_jTextField1_new_prefixKeyTyped

    private void versionLaberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_versionLaberMouseClicked
        if (Static.n == 2) {
            JOptionPane.showMessageDialog(panelCurrent, "Inki wasn't here.", Static.title, 3);
        } else {
            Static.n++;
        }
    }//GEN-LAST:event_versionLaberMouseClicked

    private void openLink(String link) {
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
    private javax.swing.JButton jButton1_add_new_prefix;
    private javax.swing.JButton jButton1_delete_prefix;
    private javax.swing.JComboBox<String> jComboBox1_id_lenght;
    private javax.swing.JComboBox<String> jComboBox1_prefixes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6_status_main;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<Prefix> jList1_prefixes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1_add_prefix;
    private javax.swing.JRadioButton jRadioButton1_dash;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1_new_prefix;
    private javax.swing.JTextField manualId;
    private javax.swing.JTextField newId;
    private javax.swing.JRadioButton onlyNumericID;
    private javax.swing.JTextArea panelCurrent;
    private javax.swing.JButton saveUnique;
    private javax.swing.JLabel twitterLabel;
    private javax.swing.JLabel versionLaber;
    // End of variables declaration//GEN-END:variables
}
