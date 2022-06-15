/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yungu3633
 */
import java.awt.*;        // Uses AWT's Layout Managers
import java.awt.event.*;  // Uses AWT's Event Handlers
import javax.swing.*;     // Uses Swing's Container/Components

public class Sudoku extends javax.swing.JFrame {

    /**
     * Creates new form Sudoku
     */
    public Sudoku() {
        initComponents();
        
        
        HardCodedSudokuLevels CodeofTheLevel = new HardCodedSudokuLevels();
        int [][] CorrectAnswer = CodeofTheLevel.HardCodedSudokuLevels();
        final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);
        
        JTextField[][] TT = new JTextField[9][9];
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(11, 9));
        
        
        
        final int CANVAS_WIDTH  = 50 * 9;
        final int CANVAS_HEIGHT = 50 * 9;
        boolean[][] masks ={{false, false, false, false, false, true, false, false, false},
                            {false, false, false, false, false, false, false, false, true},
                            {false, false, false, false, false, false, false, false, false},
                            {false, false, false, false, false, false, false, false, false},
                            {false, false, false, false, false, false, false, false, false},
                            {false, false, false, false, false, false, false, false, false},
                            {false, false, false, false, false, false, false, false, false},
                            {false, false, false, false, false, false, false, false, false},
                            {false, false, false, false, false, false, false, false, false}};
        
    
        
        
        for (int row = 0; row < 9; row++) {
         for (int col = 0; col < 9; col++) {
             TT[row][col] = new JTextField();
             cp.add(TT[row][col]);
             if (masks[row][col]) {
               TT[row][col].setText("");     
               TT[row][col].setEditable(true);
               
 
               
            } else {
               TT[row][col].setText(CorrectAnswer[row][col] + "");
         }
             
            TT[row][col].setHorizontalAlignment(JTextField.CENTER);
            TT[row][col].setFont(FONT_NUMBERS);
         }
    }
        
        cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        pack();
        for (int u = 0 ; u<9 ;u++){
            JLabel n = new JLabel("");
            cp.add(n);
        }
        JButton b = new JButton("Check");
        b.setSize(500,500);
        b.setLocation(100, 150);
        cp.add(b);
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
