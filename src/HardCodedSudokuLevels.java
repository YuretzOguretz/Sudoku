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
    
    int GridNum2 [][] = {{4,3,5,2,6,9,7,8,1},
                         {6,8,2,5,7,1,4,9,3},
                         {1,9,7,8,3,4,5,6,2},
                         {8,2,6,1,9,5,3,4,7},
                         {3,7,4,6,8,2,9,1,5},
                         {9,5,1,7,4,3,6,2,8},
                         {5,1,9,3,2,6,8,7,4},
                         {2,4,8,9,5,7,1,3,6},
                         {7,6,3,4,1,8,2,5,9}};
    
    int GridNum3 [][] = {{7,3,5,6,1,4,8,9,2},
                         {8,4,2,9,7,3,5,6,1},
                         {9,6,1,2,8,5,3,7,4},
                         {2,8,6,3,4,9,1,5,7},
                         {4,1,3,8,5,7,9,2,6},
                         {5,7,9,1,2,6,4,3,8},
                         {1,5,7,4,9,2,6,8,3},
                         {6,9,4,7,3,8,2,1,5},
                         {3,2,8,5,6,1,7,4,9}};
    
    int random = RandomGrid();
    
    if (random ==1){
        Reselection(GridNum1);
    }
    else if(random == 2) {
        Reselection(GridNum2);
    }
    else if(random == 3) {
        Reselection(GridNum3);
    }
    
    return correctGrid;
    }
    
    public int RandomGrid(){
        int random = (int) Math.random()*3+1;
        return random;
    }
    
    public void Reselection(int [][] gridselected){
    for (int i = 0; i<correctGrid.length; i++){
        for (int k = 0;k<gridselected.length; i++){
            correctGrid[i][k] = gridselected[i][k];
        }
    }
}
}
