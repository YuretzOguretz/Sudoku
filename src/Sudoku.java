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
        
        
        HardCodedSudokuLevels CodeofTheLevel = new HardCodedSudokuLevels();  //Initialaze new class
        int [][] CorrectAnswer = CodeofTheLevel.HardCodedSudokuLevels();        //Uses method to get correct grid (1 out of 3 hard coded 2D grids)
        final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);        //Varieble that sets the specific font
        final Font FONT_TITLE = new Font("TW Cen MT Condensed Extra Bold", Font.BOLD, 24);      //Varieble that sets the specific font for the title
        

        
        JTextField[][] TT = new JTextField[9][9];   
        //Create a plane
        Container cp = getContentPane();        
        cp.setLayout(new GridBagLayout());      //Setting layout to grid baglayout
        
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        int x, y;
        //Fills first space
        constraints.gridwidth = 1;          
        addGB(new JLabel(" "), 0, 0);
        //Title creation
        constraints.gridwidth = 7;
        JLabel title = new JLabel("Sudoku Master");
        //Setting the font, color and size of the title
        title.setFont(FONT_TITLE);
        title.setForeground(new Color(255,102,102));
        title.setHorizontalAlignment(JTextField.CENTER);
        addGB(title, 1, 0);             //Uses method to set the position on the grid
        //Fill in the space (right top corner)
        constraints.gridwidth = 1;                  
        addGB(new JLabel(" "), 8, 0);             //Uses method to set the position on the grid
        //MAkes a space between Title and the grid 
        constraints.gridwidth = 9;
        JLabel space1 = new JLabel(" ");
        space1.setFont(FONT_NUMBERS);           //Set size so the space is bigger
        addGB(space1, 0, 1);             //Uses method to set the position on the grid
        
        constraints.gridwidth = 1;      //Set back to normal size and ready for a loop to fill the grid with text areas
        
        
        //Variebles to set the sizes for all boxes
        final int CANVAS_WIDTH  = 75 * 9;
        final int CANVAS_HEIGHT = 75 * 9;
        
        //Initialize new class
        Difficultyselector df = new Difficultyselector();       
        boolean[][] masks = df.Difficultyselector();        //Selects the grid based on difficulty selected 
        
    
        
        //Uses for loop to fill the grid with text areas 
        for (int row = 0; row < 9; row++) {
         for (int col = 0; col < 9; col++) {
             
             TT[row][col] = new JTextField();           //creates new text field to fill the grid 
             addGB(TT[row][col],row,col+3);             //Adds/Displays the text area 
             if (masks[row][col]) {                 //if marks is true this box is for user to guess
               TT[row][col].setText("");     
               TT[row][col].setEditable(true);
               
 
               
            } else {                                //else box has given information
               TT[row][col].setText(CorrectAnswer[row][col] + "");
               TT[row][col].setEditable(false);     //makes it uneditable
         }
            //Making it pretty
            if (row>=0 && row<=2 && col>=0 && col <=2){
                TT[row][col].setBorder(BorderFactory.createLineBorder(Color.black,2));
            }
            if (row>=0 && row<=2 && col>=6 && col <=8){
                TT[row][col].setBorder(BorderFactory.createLineBorder(Color.black,2));
            }
            if (row>=3 && row<=5 && col>=3 && col <=5){
                TT[row][col].setBorder(BorderFactory.createLineBorder(Color.black,2));
            }
            if (row>=6 && row<=8 && col>=0 && col <=2){
                TT[row][col].setBorder(BorderFactory.createLineBorder(Color.black,2));
            }
            if (row>=6 && row<=8 && col>=6 && col <=8){
                TT[row][col].setBorder(BorderFactory.createLineBorder(Color.black,2));
            }
            
            TT[row][col].setHorizontalAlignment(JTextField.CENTER);     //makes the numbers show up in the midle of text box
            TT[row][col].setFont(FONT_NUMBERS);             //sets the font 
         }
    }
        
        //Creates a line (design purpuses)
        constraints.gridwidth = 9;
        addGB(new JLabel(" "), 0, 12);
        
        //Fils first grid space in the line
        constraints.gridwidth = 1;
        addGB(new JLabel(" "), 0, 13);
        
        //Creates a Check button 
        constraints.gridwidth = 2;
        JButton Chek = new JButton("Chek");
        addGB(Chek, 1, 13);
        Chek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int score = 0;
                //Checks all the boxes 
                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                      if (TT[row][col].getText().equals(CorrectAnswer[row][col]+"")){       //if the input is correct set text to green and add score 
                          TT[row][col].setForeground(Color.green);
                          score++;
                          
                      } 
                      else {                                                                //else red
                          TT[row][col].setForeground(Color.red);
                      }
                      
                      
                      
                    }
                 
                }
                
                if (score == 81){                                                           //If all boxes are correct set to winner screen 
                    WinnerScreen s3 = new WinnerScreen();
                    s3.show();
        
        
                    dispose();
                }
                score = 0;                                //reset the score 
                
                
            }
        });
        
        //Space for design purposes 
        constraints.gridwidth = 1;
        addGB(new JLabel(" "), 3, 13);
        
        //Creates a reset button
        JButton restart = new JButton("↺");
        addGB(restart, 4, 13);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {    //resets the game
                
                Sudoku s2 = new Sudoku();
                s2.show();
        
        
                dispose();
            }
        });
        
        //Space for design purposes 
        addGB(new JLabel(" "), 5, 13);
        constraints.gridwidth = 2;
        
        //Creates a quit button
        JButton Quit = new JButton("Quit");
        addGB(Quit, 6, 13);
        Quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        //sets back to main page
                
                MainPageOfSudoku s2 = new MainPageOfSudoku();
                s2.show();
        
        
                dispose();
            }
        });
        
        //space for design purposes
        constraints.gridwidth = 1;
        addGB(new JLabel(" "), 8, 13);
        constraints.gridwidth = 9;
        addGB(new JLabel(" "), 0, 14);
        
        
        //sets all the boxes to same size
        cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        pack();
        cp.setBackground(new Color(153,153,255));
        setTitle("Sudoku");     //Sets window title
    }    
    
    //Method to add components to the plane
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
