/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yungu3633
 */
public class Difficultyselector {
    private static boolean [][] Difficultyselector = new boolean [9][9];
    private static String Dificulty = "";
    
    
    public boolean [][] Difficultyselector(){
        //Easy grid 
        boolean[][] masks1 ={{true, false, true, true, false, true, true, false, false},
                             {true, false, true, true, true, true, false, false, true},
                             {false, true, true, false, true, true, false, false, false},
                             {true, false, false, true, false, false, true, true, true},
                             {false, false, true, true, true, true, true, false, false},
                             {true, true, true, false, false, false, false, false, false},
                             {false, false, false, true, true, false, true, true, false},
                             {true, false, false, true, true, true, true, false, true},
                             {false, false, true, true, false, true, true, false, true}};
        //Medium grid
        boolean[][] masks2 ={{true, false, true, true, true, true, true, false, true},
                            {false, true, true, true, false, true, true, true, false},
                            {false, true, false, false, true, true, true, true, true},
                            {true, false, false, true, true, true, false, true, true},
                            {true, true, true, true, false, true, true, true, true},
                            {true, false, false, true, true, true, false, true, true},
                            {false, true, false, false, true, true, true, true, true},
                            {false, true, true, true, false, true, true, true, false},
                            {true, false, true, true, true, false, true, false, true}};
        //Hard grid
        boolean[][] masks3 ={{true, true, false, false, true, false, true, true, true},
                            {true, true, false, true, true, true, true, true, false},
                            {false, true, true, true, true, false, true, false, false},
                            {false, true, false, true, false, true, false, true, false},
                            {true, true, true, false, true, true, false, true, true},
                            {false, true, true, true, false, true, true, true, false},
                            {true, false, true, true, true, true, true, true, true},
                            {true, false, true, true, true, true, true, true, true},
                            {true, true, false, false, true, false, true, false, true}};
        
        //Expert grid
        boolean[][] masks4 ={{true, true, false, true, true, true, false, true, false},
                            {true, false, false, false, true, true, true, true, true},
                            {false, true, true, true, true, true, true, true, true},
                            {true, true, true, false, true, true, false, true, false},
                            {true, false, true, true, false, true, true, false, false},
                            {true, true, true, true, true, true, true, true, true},
                            {true, true, true, false, false, true, false, true, true},
                            {true, false, true, true, true, true, true, false, true},
                            {false, true, true, false, false, true, true, true, true}};
        
        /*
        Sets the grid to appropriate grid  
        */
        if ( Dificulty == "Easy"){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks1[i][k];
                }
            }
        }
        else if ( Dificulty == "Medium"){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks2[i][k];
                }
            }    
        }
        else if ( Dificulty == "Hard"){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks3[i][k];
                }
            }    
        }
        else if ( Dificulty == "Expert"){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks4[i][k];
                }
            }    
        }
    return Difficultyselector; //returnd selected grid
    }
    
    
    public void setDifficulty(String x){
        
        Dificulty=x;   //Sets the difficulty level
        
    }
}
