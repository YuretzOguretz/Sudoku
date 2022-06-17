/* Yura Nguyen
 * June 2nd, 2022
 * Sudoku game
 */

/**
 *
 * @author yungu3633
 */
public class MainPageOfSudoku extends javax.swing.JFrame {

    /**
     * Creates new form MainPageOfSudoku
     */
    public MainPageOfSudoku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMS = new javax.swing.JPanel();
        MainLable = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        NoteLable = new javax.swing.JLabel();
        DifficultyDropBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMS.setBackground(new java.awt.Color(153, 153, 255));

        MainLable.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        MainLable.setForeground(new java.awt.Color(255, 102, 102));
        MainLable.setText("Sudoku Master");

        StartButton.setBackground(new java.awt.Color(255, 51, 51));
        StartButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        StartButton.setText("Start");
        StartButton.setActionCommand("");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        NoteLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NoteLable.setText("                                      Click start to begin ");

        DifficultyDropBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DifficultyDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard", "Expert" }));
        DifficultyDropBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DifficultyDropBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMSLayout = new javax.swing.GroupLayout(PanelMS);
        PanelMS.setLayout(PanelMSLayout);
        PanelMSLayout.setHorizontalGroup(
            PanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMSLayout.createSequentialGroup()
                .addGroup(PanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMSLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(MainLable))
                    .addGroup(PanelMSLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelMSLayout.createSequentialGroup()
                .addGroup(PanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMSLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(NoteLable, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMSLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(DifficultyDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        PanelMSLayout.setVerticalGroup(
            PanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMSLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(MainLable, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DifficultyDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(NoteLable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        Difficultyselector df = new Difficultyselector(); //Uses the class to setr dificulty apropriatly
        df.setDifficulty((DifficultyDropBox.getSelectedItem().toString())); //Gets the Difficulty as a string to choose the grid patern
        Sudoku s2 = new Sudoku(); //Creates the second screen
        s2.show();         //Shows the second screen
        
        
        dispose();         //Disposes of the main page
        
        
        
    }//GEN-LAST:event_StartButtonActionPerformed

    private void DifficultyDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DifficultyDropBoxActionPerformed
        
    }//GEN-LAST:event_DifficultyDropBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPageOfSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageOfSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageOfSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageOfSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageOfSudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DifficultyDropBox;
    private javax.swing.JLabel MainLable;
    private javax.swing.JLabel NoteLable;
    private javax.swing.JPanel PanelMS;
    private javax.swing.JButton StartButton;
    // End of variables declaration//GEN-END:variables
}
