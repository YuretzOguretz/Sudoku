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
    
    
    public boolean [][] Difficultyselector(String m){
        
        boolean[][] masks1 ={{true, false, true, true, false, true, true, false, false},
                             {true, false, true, true, true, true, false, false, true},
                             {false, true, true, false, true, true, false, false, false},
                             {true, false, false, true, false, false, true, true, true},
                             {false, false, true, true, true, true, true, false, false},
                             {true, true, true, false, false, false, false, false, false},
                             {false, false, false, true, true, false, true, true, false},
                             {true, false, false, true, true, true, true, false, true},
                             {false, false, true, true, false, true, true, false, true}};
        
        boolean[][] masks2 ={{true, false, true, true, true, true, true, false, true},
                            {false, true, true, true, false, true, true, true, false},
                            {false, true, false, false, true, true, true, true, true},
                            {true, false, false, true, true, true, false, true, true},
                            {true, true, true, true, false, true, true, true, true},
                            {true, false, false, true, true, true, false, true, true},
                            {false, true, false, false, true, true, true, true, true},
                            {false, true, true, true, false, true, true, true, false},
                            {true, false, true, true, true, false, true, false, true}};
    
        boolean[][] masks3 ={{true, true, false, false, true, false, true, true, true},
                            {true, true, false, true, true, true, true, true, false},
                            {false, true, true, true, true, false, true, false, false},
                            {false, true, false, true, false, true, false, true, false},
                            {true, true, true, false, true, true, false, true, true},
                            {false, true, true, true, false, true, true, true, false},
                            {true, false, true, true, true, true, true, true, true},
                            {true, false, true, true, true, true, true, true, true},
                            {true, true, false, false, true, false, true, false, true}};
        
        
        boolean[][] masks4 ={{true, true, false, true, true, true, false, true, false},
                            {true, false, false, false, true, true, true, true, true},
                            {false, true, true, true, true, true, true, true, true},
                            {true, true, true, false, true, true, false, true, false},
                            {true, false, true, true, false, true, true, false, false},
                            {true, true, true, true, true, true, true, true, true},
                            {true, true, true, false, false, true, false, true, true},
                            {true, false, true, true, true, true, true, false, true},
                            {false, true, true, false, false, true, true, true, true}};
        
        
        if ( m == Dificulty){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks1[i][k];
                }
            }
        }
        else if (m == Dificulty){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks2[i][k];
                }
            }    
        }
        else if (m == Dificulty){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks3[i][k];
                }
            }    
        }
        else if (m == Dificulty){
        for (int i = 0; i< 9; i++){
            for (int k = 0;k< 9; k++){
            Difficultyselector[i][k] = masks4[i][k];
                }
            }    
        }
    return Difficultyselector;
    }
    
    public String getDifficulty(){
       return Dificulty;
    }
    public void setDifficulty(String x){
        
        Dificulty=x;
        
    }
}
