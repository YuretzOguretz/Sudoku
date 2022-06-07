/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yungu3633
 */
public class NumberSelector {
    private int num;
    private static String temp1 = null;
    private static String row1 = "123456789";
    private static String row2 = "123456789";
    private static String row3 = "123456789";
    private static String row4 = "123456789";
    private static String row5 = "123456789";
    private static String row6 = "123456789";
    private static String row7 = "123456789";
    private static String row8 = "123456789";
    private static String row9 = "123456789";
    private static String box1 = "123456789";
    private static String box2 = "123456789";
    private static String box3 = "123456789";
    private static String box4 = "123456789";
    private static String box5 = "123456789";
    private static String box7 = "123456789";
    private static String box8 = "123456789";
    private static String box9 = "123456789";
    private static String line1 = "123456789";
    private static String line2 = "123456789";
    private static String line3 = "123456789";
    private static String line4 = "123456789";
    private static String line5 = "123456789";
    private static String line6 = "123456789";
    private static String line7 = "123456789";
    private static String line8 = "123456789";
    private static String line9 = "123456789";
    
    public int NumberSelector(int rowX, int rowY){
//        num = (int)(Math.random()*8)+0; (Choosing random string)
        if ((rowX>= 1&&rowX<= 3)&&((rowY>= 1&&rowY<= 3))){
          //Box #1
          int i =(int)(Math.random()*box1.length()-1)+0;
          num = Integer.valueOf(box1.substring( i, i+1));
          for (int f =0; f<box1.length()-1; f++){
              if (!(box1.substring( i, i+1).equals(box1.substring( f, f+1)))){
                  temp1+=box1.substring( f, f+1); 
              }
          }
          box1 = temp1;
          
          if (rowX == 1){
              row1 = temp1;
          }
          else if (rowX == 2){
              row2 = temp1;
          }
          else if (rowX == 3){
              row3 = temp1;
          }
          
          if (rowY == 1){
              line1 = temp1;
          }
          else if (rowY == 2){
              line2 = temp1;
          }
          else if (rowY == 3){
              line3 = temp1;
          }
          temp1=null;
          return num;
        }
        else if ((rowX>= 1&&rowX<= 3)&&((rowY>= 4&&rowY<= 6))){
          //Box #2  
        }
        else if ((rowX>= 1&&rowX<= 3)&&((rowY>= 7&&rowY<= 9))){
          //Box #3  
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 1&&rowY<= 3))){
          //Box #4  
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 4&&rowY<= 6))){
          //Box #5  
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 7&&rowY<= 9))){
          //Box #6  
        }
        else if ((rowY>= 7&&rowY<= 9)&&((rowY>= 1&&rowY<= 3))){
          //Box #7  
        }
        else if ((rowY>= 7&&rowY<= 9)&&((rowY>= 4&&rowY<= 6))){
          //Box #8  
        }
        else if ((rowY>= 7&&rowY<= 9)&&((rowY>= 7&&rowY<= 9))){
          //Box #9  
        }
        else {
            num = 0;
        }
        return num;
    }  
}
