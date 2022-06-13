/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yungu3633
 */
public class HardCodedSudokuLevels {
    private int num;
    private static int [][] correctGrid = new int [9][9];
    
    public int [][]HardCodedSudokuLevels(){
    int GridNum1 [][] = {{5,3,4,6,7,8,9,1,2},
                         {6,7,2,1,9,5,3,4,8},
                         {1,9,8,3,4,2,5,6,7},
                         {8,5,9,7,6,1,4,2,3},
                         {4,2,6,8,5,3,7,9,1},
                         {7,1,3,9,2,4,8,5,6},
                         {9,6,1,5,3,7,2,8,4},
                         {2,8,7,4,1,9,6,3,5},
                         {3,4,5,2,8,6,1,7,9}};
    
    for (int i = 0; i<correctGrid.length; i++){
        for (int k = 0;k<GridNum1.length; i++){
            correctGrid[i][k] = GridNum1[i][k];
        }
    }
    return correctGrid;
    }
    
    public void RandomGrid(int[][] grid){
        int random = (int) Math.random()*1;
        if (random == 0){
            
        }
    }
    
}
