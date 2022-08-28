package stk_unpacker;

// Libraries
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class ui_unpacker extends javax.swing.JFrame {
    // Global vars
    static String var_input_path = ".";
    static String var_output_path = ".";
    static String var_game = "-xdb";
    static String var_bin_arc = "bin\\xrUnpacker32.exe";
    
    public ui_unpacker() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdn_group = new javax.swing.ButtonGroup();
        rdn_bin_arc = new javax.swing.ButtonGroup();
        ui_about = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        pnl_paths = new javax.swing.JPanel();
        str_db_input_path = new javax.swing.JLabel();
        path_db_input = new javax.swing.JTextField();
        btn_select_input_path = new javax.swing.JButton();
        str_db_output_path = new javax.swing.JLabel();
        path_db_output = new javax.swing.JTextField();
        btn_select_output_path = new javax.swing.JButton();
        pnl_parameters = new javax.swing.JPanel();
        str_game = new javax.swing.JLabel();
        rdn_game_socww = new javax.swing.JRadioButton();
        rdn_game_socru = new javax.swing.JRadioButton();
        rdn_game_cscop = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        rdn_bin_x86 = new javax.swing.JRadioButton();
        rdn_bin_x64 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_unpack = new javax.swing.JButton();
        menu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_about = new javax.swing.JMenuItem();

        ui_about.setTitle("About");
        ui_about.setLocationByPlatform(true);
        ui_about.setResizable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("S.T.A.L.K.E.R. Database Unpacker");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Developed by Rammaken");

        jLabel7.setText("App version: v1.2");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/author_portrait.jpg"))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("https://github.com/Rammaken");
        jTextField1.setAutoscrolls(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This program is a free and portable game files unpacker for S.T.A.L.K.E.R. series totally meant for modding or learning porpuses.\nAll assets provided by this program are property of GSC Game World.\n\nAll credits for the converter binaries goes to their respective authors (I don't know who are them so...)\n\nThis app was developed with Java using Netbeans IDE.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/author_flag.png"))); // NOI18N
        jLabel10.setToolTipText("Maracaibo, Zulia, Venezuela");

        javax.swing.GroupLayout ui_aboutLayout = new javax.swing.GroupLayout(ui_about.getContentPane());
        ui_about.getContentPane().setLayout(ui_aboutLayout);
        ui_aboutLayout.setHorizontalGroup(
            ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ui_aboutLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(ui_aboutLayout.createSequentialGroup()
                        .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ui_aboutLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        ui_aboutLayout.setVerticalGroup(
            ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ui_aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ui_aboutLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ui_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S.T.A.L.K.E.R. Database Unpacker");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("ui_unpacker"); // NOI18N
        setResizable(false);

        pnl_paths.setBorder(javax.swing.BorderFactory.createTitledBorder("Paths"));

        str_db_input_path.setText("Database file path:");

        btn_select_input_path.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_folder_path.png"))); // NOI18N
        btn_select_input_path.setToolTipText("Select path...");
        btn_select_input_path.setBorder(null);
        btn_select_input_path.setBorderPainted(false);
        btn_select_input_path.setContentAreaFilled(false);
        btn_select_input_path.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select_input_path.setFocusPainted(false);
        btn_select_input_path.setRolloverEnabled(false);
        btn_select_input_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_input_path(evt);
            }
        });

        str_db_output_path.setText("Unpacked files output path:");

        btn_select_output_path.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_folder_path.png"))); // NOI18N
        btn_select_output_path.setToolTipText("Select path...");
        btn_select_output_path.setBorder(null);
        btn_select_output_path.setBorderPainted(false);
        btn_select_output_path.setContentAreaFilled(false);
        btn_select_output_path.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select_output_path.setFocusPainted(false);
        btn_select_output_path.setRolloverEnabled(false);
        btn_select_output_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_output_path(evt);
            }
        });

        javax.swing.GroupLayout pnl_pathsLayout = new javax.swing.GroupLayout(pnl_paths);
        pnl_paths.setLayout(pnl_pathsLayout);
        pnl_pathsLayout.setHorizontalGroup(
            pnl_pathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pathsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(str_db_output_path)
                    .addComponent(str_db_input_path)
                    .addComponent(path_db_input, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(path_db_output))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_pathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_select_input_path, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_select_output_path, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_pathsLayout.setVerticalGroup(
            pnl_pathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pathsLayout.createSequentialGroup()
                .addGroup(pnl_pathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_select_input_path, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_pathsLayout.createSequentialGroup()
                        .addComponent(str_db_input_path)
                        .addGap(4, 4, 4)
                        .addComponent(path_db_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_pathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_pathsLayout.createSequentialGroup()
                        .addComponent(str_db_output_path)
                        .addGap(4, 4, 4)
                        .addComponent(path_db_output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_select_output_path, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnl_parameters.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters"));

        str_game.setText("Game:");

        rdn_group.add(rdn_game_socww);
        rdn_game_socww.setText("SoC (WW)");
        rdn_game_socww.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rdn_group.add(rdn_game_socru);
        rdn_game_socru.setText("SoC (RU)");
        rdn_game_socru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rdn_group.add(rdn_game_cscop);
        rdn_game_cscop.setSelected(true);
        rdn_game_cscop.setText("CS/CoP");
        rdn_game_cscop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText("Binarie architecture:");

        rdn_bin_arc.add(rdn_bin_x86);
        rdn_bin_x86.setSelected(true);
        rdn_bin_x86.setText("x86 / 32 Bits");
        rdn_bin_x86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rdn_bin_arc.add(rdn_bin_x64);
        rdn_bin_x64.setText("x64 / 64 Bits");
        rdn_bin_x64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_stalker_cs_cop.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_stalker_soc.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stk_unpacker/icon_stalker_soc.png"))); // NOI18N

        javax.swing.GroupLayout pnl_parametersLayout = new javax.swing.GroupLayout(pnl_parameters);
        pnl_parameters.setLayout(pnl_parametersLayout);
        pnl_parametersLayout.setHorizontalGroup(
            pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_parametersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_parametersLayout.createSequentialGroup()
                        .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdn_game_socww)
                            .addComponent(rdn_game_socru)
                            .addComponent(rdn_game_cscop)))
                    .addComponent(str_game))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(rdn_bin_x64)
                    .addComponent(rdn_bin_x86))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnl_parametersLayout.setVerticalGroup(
            pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_parametersLayout.createSequentialGroup()
                .addComponent(str_game)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_parametersLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_parametersLayout.createSequentialGroup()
                        .addComponent(rdn_game_cscop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_game_socww, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_game_socru)))
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(pnl_parametersLayout.createSequentialGroup()
                .addGroup(pnl_parametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(pnl_parametersLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_bin_x86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdn_bin_x64)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btn_reset.setForeground(new java.awt.Color(204, 0, 0));
        btn_reset.setText("Reset");
        btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset(evt);
            }
        });

        btn_unpack.setForeground(new java.awt.Color(0, 204, 51));
        btn_unpack.setText("Unpack");
        btn_unpack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_unpack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpack(evt);
            }
        });

        jMenu1.setText("Menu");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menu_about.setText("About");
        menu_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_about(evt);
            }
        });
        jMenu1.add(menu_about);

        menu_bar.add(jMenu1);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_paths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_parameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_unpack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnl_paths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnl_parameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_unpack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );

        getAccessibleContext().setAccessibleName("Unpacker");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void select_output_path(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_output_path
        // Selects gamedata input folder:
        JFileChooser db_output_choose = new JFileChooser();
        db_output_choose.setCurrentDirectory(new java.io.File("."));
        db_output_choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        db_output_choose.showOpenDialog(null);
        File file_db_output_path = db_output_choose.getSelectedFile();

        path_db_output.setText(file_db_output_path.getAbsolutePath());
    }//GEN-LAST:event_select_output_path

    private void select_input_path(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_input_path
        // Selects Database file path
        JFileChooser db_input_choose = new JFileChooser();
        db_input_choose.setCurrentDirectory(new java.io.File("."));
        db_input_choose.showOpenDialog(null);
        File file_db_input_path = db_input_choose.getSelectedFile();

        path_db_input.setText(file_db_input_path.getAbsolutePath());
    }//GEN-LAST:event_select_input_path

    private void unpack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpack
        // Declares new values for paths
        var_input_path = path_db_input.getText();
        var_output_path = path_db_output.getText();
        
        // Checks which format was selected
        if(rdn_game_cscop.isSelected()) {
            var_game = "-xdb";     // Clear Sky and Call of Pripyat
        }
        if(rdn_game_socww.isSelected()) {
            var_game = "-2947ww";  // Shadow of Chernobyl Worldwide version
        }
        if(rdn_game_socru.isSelected()) {
            var_game = "-2947ru";  // Shadow of Chernobyl Russian version
        }
        
        // Checks which binaries are selected
        if(rdn_bin_x86.isSelected()) {
            var_bin_arc = "bin\\xrUnpacker32.exe";    // 32 Bits
        }
        if(rdn_bin_x64.isSelected()) {
            var_bin_arc = "bin\\xrUnpacker64.exe";    // 64 Bits
        }
        
        // Generates the command line for the xrUnpacker binarie
        String var_unpacker_data = "-unpack " + var_game + " \"" + var_input_path + "\"" + " -dir " + "\"" + var_output_path + "\"";

        // Executes xrUnpacker binarie with the data to unpack the files
        try {
            Runtime.getRuntime().exec(var_bin_arc + " " + var_unpacker_data);
            JOptionPane.showMessageDialog(this, "Unpacking\n Check folder: " + var_output_path, "Warning", 1);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong... Please, check your settings and try again");
        }
    }//GEN-LAST:event_unpack

    private void reset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset
        // Sets all the fields to default values
        path_db_input.setText("");
        path_db_output.setText("");
        rdn_game_cscop.setSelected(true);
        rdn_bin_x86.setSelected(true);
    }//GEN-LAST:event_reset

    private void show_about(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_about
        ui_about.show();
        ui_about.setSize(491, 385);
    }//GEN-LAST:event_show_about

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
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_select_input_path;
    private javax.swing.JButton btn_select_output_path;
    private javax.swing.JButton btn_unpack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem menu_about;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JTextField path_db_input;
    private javax.swing.JTextField path_db_output;
    private javax.swing.JPanel pnl_parameters;
    private javax.swing.JPanel pnl_paths;
    private javax.swing.ButtonGroup rdn_bin_arc;
    private javax.swing.JRadioButton rdn_bin_x64;
    private javax.swing.JRadioButton rdn_bin_x86;
    private javax.swing.JRadioButton rdn_game_cscop;
    private javax.swing.JRadioButton rdn_game_socru;
    private javax.swing.JRadioButton rdn_game_socww;
    private javax.swing.ButtonGroup rdn_group;
    private javax.swing.JLabel str_db_input_path;
    private javax.swing.JLabel str_db_output_path;
    private javax.swing.JLabel str_game;
    private javax.swing.JFrame ui_about;
    // End of variables declaration//GEN-END:variables
}
