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
    GridBagConstraints constraints = new GridBagConstraints();
    /**
     * Creates new form Sudoku
     */
    public Sudoku() {
        initComponents();
        
        
        HardCodedSudokuLevels CodeofTheLevel = new HardCodedSudokuLevels();
        int [][] CorrectAnswer = CodeofTheLevel.HardCodedSudokuLevels();
        final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);
        final Font FONT_TITLE = new Font("TW Cen MT Condensed Extra Bold", Font.BOLD, 24);
        
        JTextField[][] TT = new JTextField[9][9];
        Container cp = getContentPane();
        cp.setLayout(new GridBagLayout());
        
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        int x, y;
        constraints.gridwidth = 2;
        addGB(new JLabel(" "), 0, 0);
        constraints.gridwidth = 5;
        JLabel title = new JLabel("Sudoku Master");
        title.setFont(FONT_TITLE);
        title.setForeground(new Color(255,102,102));
        title.setHorizontalAlignment(JTextField.CENTER);
        addGB(title, 2, 0);
        constraints.gridwidth = 2;
        addGB(new JLabel(" "), 7, 0);
        constraints.gridwidth = 9;
        JLabel space1 = new JLabel(" ");
        space1.setFont(FONT_NUMBERS);
        addGB(space1, 0, 1);
        constraints.gridwidth = 1;
        
        final int CANVAS_WIDTH  = 90 * 9;
        final int CANVAS_HEIGHT = 90 * 9;
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
             constraints.gridwidth = 1;
             TT[row][col] = new JTextField();
             addGB(TT[row][col],row,col+3);
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
        constraints.gridwidth = 9;
        addGB(new JLabel(" "), 0, 12);
        constraints.gridwidth = 1;
        addGB(new JLabel(" "), 0, 13);
        constraints.gridwidth = 2;
        JButton Chek = new JButton("Chek");
        addGB(Chek, 1, 13);
        Chek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It works!");
            }
        });
        constraints.gridwidth = 1;
        addGB(new JLabel(" "), 3, 13);
        JButton restart = new JButton("↺");
        addGB(restart, 4, 13);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It works!");
            }
        });
        addGB(new JLabel(" "), 5, 13);
        constraints.gridwidth = 2;
        JButton Quit = new JButton("Quit");
        addGB(Quit, 6, 13);
        Quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It works!");
            }
        });
        constraints.gridwidth = 1;
        addGB(new JLabel(" "), 8, 13);
        constraints.gridwidth = 9;
        addGB(new JLabel(" "), 0, 14);
        
        cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        pack();
        cp.setBackground(new Color(153,153,255));
        setTitle("Sudoku");
    }    
    
    void addGB(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        add(component, constraints);
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
