package stk_unpacker;

// Librarys

import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class ui_unpacker extends javax.swing.JFrame {

    static String unpacked_path = ".";
    static String db_path = ".";
    static String app_version = "1.0";
    public ui_unpacker() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        bg_toolbar = new javax.swing.JPanel();
        btn_clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_about1 = new javax.swing.JButton();
        txt_db_path = new javax.swing.JTextField();
        lbl_db_path = new javax.swing.JLabel();
        spt_db_path = new javax.swing.JSeparator();
        lbl_unpacked_path = new javax.swing.JLabel();
        txt_unpacked_path = new javax.swing.JTextField();
        spt_unpacked_path = new javax.swing.JSeparator();
        btn_select_path1 = new javax.swing.JButton();
        btn_select_path2 = new javax.swing.JButton();
        bg_unpack = new javax.swing.JPanel();
        btn_unpack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S.T.A.L.K.E.R. Database Unpacker");
        setBackground(new java.awt.Color(29, 29, 29));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("ui_unpacker"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(29, 29, 29));

        bg_toolbar.setBackground(new java.awt.Color(17, 17, 17));

        btn_clear.setBackground(new java.awt.Color(242, 166, 50));
        btn_clear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.setBorderPainted(false);
        btn_clear.setContentAreaFilled(false);
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.setDefaultCapable(false);
        btn_clear.setFocusPainted(false);
        btn_clear.setFocusable(false);
        btn_clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clear.setRolloverEnabled(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/stalker_icon.png"))); // NOI18N
        jLabel1.setText("CS/CoP Unpacker");

        btn_about1.setBackground(new java.awt.Color(242, 166, 50));
        btn_about1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_about1.setForeground(new java.awt.Color(255, 255, 255));
        btn_about1.setText("About");
        btn_about1.setBorder(null);
        btn_about1.setBorderPainted(false);
        btn_about1.setContentAreaFilled(false);
        btn_about1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_about1.setDefaultCapable(false);
        btn_about1.setFocusPainted(false);
        btn_about1.setFocusable(false);
        btn_about1.setRolloverEnabled(false);
        btn_about1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_info(evt);
            }
        });

        javax.swing.GroupLayout bg_toolbarLayout = new javax.swing.GroupLayout(bg_toolbar);
        bg_toolbar.setLayout(bg_toolbarLayout);
        bg_toolbarLayout.setHorizontalGroup(
            bg_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_about1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        bg_toolbarLayout.setVerticalGroup(
            bg_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_about1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt_db_path.setBackground(new java.awt.Color(29, 29, 29));
        txt_db_path.setForeground(new java.awt.Color(255, 255, 255));
        txt_db_path.setBorder(null);

        lbl_db_path.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_db_path.setForeground(new java.awt.Color(255, 255, 255));
        lbl_db_path.setText("Database path (Input):");

        lbl_unpacked_path.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_unpacked_path.setForeground(new java.awt.Color(255, 255, 255));
        lbl_unpacked_path.setText("Unpacked files path (Output):");

        txt_unpacked_path.setBackground(new java.awt.Color(29, 29, 29));
        txt_unpacked_path.setForeground(new java.awt.Color(255, 255, 255));
        txt_unpacked_path.setBorder(null);

        btn_select_path1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_folder_path.png"))); // NOI18N
        btn_select_path1.setToolTipText("Select path...");
        btn_select_path1.setBorder(null);
        btn_select_path1.setBorderPainted(false);
        btn_select_path1.setContentAreaFilled(false);
        btn_select_path1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select_path1.setFocusPainted(false);
        btn_select_path1.setRolloverEnabled(false);
        btn_select_path1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_db_path(evt);
            }
        });

        btn_select_path2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_folder_path.png"))); // NOI18N
        btn_select_path2.setToolTipText("Select path...");
        btn_select_path2.setBorder(null);
        btn_select_path2.setBorderPainted(false);
        btn_select_path2.setContentAreaFilled(false);
        btn_select_path2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select_path2.setFocusPainted(false);
        btn_select_path2.setRolloverEnabled(false);
        btn_select_path2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_unpacked_path(evt);
            }
        });

        bg_unpack.setBackground(new java.awt.Color(116, 184, 0));

        btn_unpack.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_unpack.setForeground(new java.awt.Color(255, 255, 255));
        btn_unpack.setText("Unpack");
        btn_unpack.setBorder(null);
        btn_unpack.setBorderPainted(false);
        btn_unpack.setContentAreaFilled(false);
        btn_unpack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_unpack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_unpacking(evt);
            }
        });

        javax.swing.GroupLayout bg_unpackLayout = new javax.swing.GroupLayout(bg_unpack);
        bg_unpack.setLayout(bg_unpackLayout);
        bg_unpackLayout.setHorizontalGroup(
            bg_unpackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_unpack, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        bg_unpackLayout.setVerticalGroup(
            bg_unpackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_unpackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_unpack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_unpacked_path, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addComponent(lbl_db_path)
                                    .addGap(180, 180, 180))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_unpacked_path)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spt_db_path, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_db_path, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))))
                            .addComponent(spt_unpacked_path))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_select_path2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_select_path1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(bg_unpack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(bg_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_db_path)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(txt_db_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spt_db_path, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_select_path1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_unpacked_path)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_unpacked_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spt_unpacked_path, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_select_path2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(bg_unpack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        getAccessibleContext().setAccessibleName("Unpacker");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_unpacking(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_unpacking
        // Generates the unpacker run file
        String unpacker_data = "converter.exe -unpack -xdb " + "\"" + db_path + "\"" + " -dir " + "\"" + unpacked_path + "\"";

        try {
            Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \" start " + unpacker_data);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong... Please, try again");
        }
    }//GEN-LAST:event_start_unpacking

    private void select_unpacked_path(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_unpacked_path
        // Selects unpacked outpot folder:
        JFileChooser unpacked_choose = new JFileChooser();
        unpacked_choose.setCurrentDirectory(new java.io.File("."));
        unpacked_choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        unpacked_choose.showOpenDialog(null);
        File file_unpacked_path = unpacked_choose.getSelectedFile();

        unpacked_path = file_unpacked_path.getAbsolutePath();
        txt_unpacked_path.setText(unpacked_path);
    }//GEN-LAST:event_select_unpacked_path

    private void select_db_path(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_db_path
        // Selects Database file path
        JFileChooser db_choose = new JFileChooser();
        db_choose.setCurrentDirectory(new java.io.File("."));
        db_choose.showOpenDialog(null);
        File file_db_path = db_choose.getSelectedFile();

        db_path = file_db_path.getAbsolutePath();

        txt_db_path.setText(db_path);
    }//GEN-LAST:event_select_db_path

    private void show_info(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_info
        JOptionPane.showMessageDialog(this, "Author: Rammaken \nVersion: " + app_version + "\nDeveloped with Java using Netbeans IDE");
    }//GEN-LAST:event_show_info

    private void clear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear
        // Clears path inputs
        txt_db_path.setText("");
        txt_unpacked_path.setText("");
        getToolkit().beep();
    }//GEN-LAST:event_clear

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui_unpacker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui_unpacker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui_unpacker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui_unpacker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui_unpacker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bg_toolbar;
    private javax.swing.JPanel bg_unpack;
    private javax.swing.JButton btn_about1;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_select_path1;
    private javax.swing.JButton btn_select_path2;
    private javax.swing.JButton btn_unpack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_db_path;
    private javax.swing.JLabel lbl_unpacked_path;
    private javax.swing.JSeparator spt_db_path;
    private javax.swing.JSeparator spt_unpacked_path;
    private javax.swing.JTextField txt_db_path;
    private javax.swing.JTextField txt_unpacked_path;
    // End of variables declaration//GEN-END:variables
}
