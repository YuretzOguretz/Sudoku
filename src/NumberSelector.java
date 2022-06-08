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
    private static String box6 = "123456789";
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
        int i;
        if ((rowX>= 1&&rowX<= 3)&&((rowY>= 1&&rowY<= 3))){
          //Box #1
          
          i=(int)(Math.random()*(box1.length()-1))+0;
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
          i=(int)(Math.random()*(box2.length()-1))+0;
          num = Integer.valueOf(box2.substring( i, i+1));
          for (int f =0; f<box2.length()-1; f++){
              if (!(box2.substring( i, i+1).equals(box2.substring( f, f+1)))){
                  temp1+=box2.substring( f, f+1); 
              }
          }
          box2 = temp1;
          
          if (rowX == 1){
              row1 = temp1;
          }
          else if (rowX == 2){
              row2 = temp1;
          }
          else if (rowX == 3){
              row3 = temp1;
          }
          
          if (rowY == 4){
              line4 = temp1;
          }
          else if (rowY == 5){
              line5 = temp1;
          }
          else if (rowY == 6){
              line6 = temp1;
          }
          temp1=null;
          return num;
        }
        else if ((rowX>= 1&&rowX<= 3)&&((rowY>= 7&&rowY<= 9))){
          //Box #3
          i=(int)(Math.random()*(box3.length()-1))+0;
          num = Integer.valueOf(box3.substring( i, i+1));
          for (int f =0; f<box3.length()-1; f++){
              if (!(box3.substring( i, i+1).equals(box3.substring( f, f+1)))){
                  temp1+=box3.substring( f, f+1); 
              }
          }
          box3 = temp1;
          
          if (rowX == 1){
              row1 = temp1;
          }
          else if (rowX == 2){
              row2 = temp1;
          }
          else if (rowX == 3){
              row3 = temp1;
          }
          
          if (rowY == 7){
              line7 = temp1;
          }
          else if (rowY == 8){
              line8 = temp1;
          }
          else if (rowY == 9){
              line9 = temp1;
          }
          temp1=null;
          return num;
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 1&&rowY<= 3))){
          //Box #4
          i=(int)(Math.random()*(box4.length()-1))+0;
          num = Integer.valueOf(box4.substring( i, i+1));
          for (int f =0; f<box4.length()-1; f++){
              if (!(box4.substring( i, i+1).equals(box4.substring( f, f+1)))){
                  temp1+=box4.substring( f, f+1); 
              }
          }
          box4 = temp1;
          
          if (rowX == 4){
              row4 = temp1;
          }
          else if (rowX == 5){
              row5 = temp1;
          }
          else if (rowX == 6){
              row6 = temp1;
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
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 4&&rowY<= 6))){
          //Box #5
          i=(int)(Math.random()*(box5.length()-1))+0;
          num = Integer.valueOf(box5.substring( i, i+1));
          for (int f =0; f<box5.length()-1; f++){
              if (!(box5.substring( i, i+1).equals(box5.substring( f, f+1)))){
                  temp1+=box5.substring( f, f+1); 
              }
          }
          box5 = temp1;
          
          if (rowX == 4){
              row4 = temp1;
          }
          else if (rowX == 5){
              row5 = temp1;
          }
          else if (rowX == 6){
              row6 = temp1;
          }
          
          if (rowY == 4){
              line4 = temp1;
          }
          else if (rowY == 5){
              line5 = temp1;
          }
          else if (rowY == 6){
              line6 = temp1;
          }
          temp1=null;
          return num;
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 7&&rowY<= 9))){
          //Box #6 
          i=(int)(Math.random()*(box6.length()-1))+0;
          num = Integer.valueOf(box6.substring( i, i+1));
          for (int f =0; f<box6.length()-1; f++){
              if (!(box6.substring( i, i+1).equals(box6.substring( f, f+1)))){
                  temp1+=box6.substring( f, f+1); 
              }
          }
          box6 = temp1;
          
          if (rowX == 4){
              row4 = temp1;
          }
          else if (rowX == 5){
              row5 = temp1;
          }
          else if (rowX == 6){
              row6 = temp1;
          }
          
          if (rowY == 7){
              line7 = temp1;
          }
          else if (rowY == 8){
              line8 = temp1;
          }
          else if (rowY == 9){
              line9 = temp1;
          }
          temp1=null;
          return num;
        }
        else if ((rowX>= 7&&rowX<= 9)&&((rowY>= 1&&rowY<= 3))){
          //Box #7 
          i=(int)(Math.random()*(box7.length()-1))+0;
          num = Integer.valueOf(box7.substring( i, i+1));
          for (int f =0; f<box7.length()-1; f++){
              if (!(box7.substring( i, i+1).equals(box7.substring( f, f+1)))){
                  temp1+=box7.substring( f, f+1); 
              }
          }
          box7 = temp1;
          
          if (rowX == 7){
              row7 = temp1;
          }
          else if (rowX == 8){
              row8 = temp1;
          }
          else if (rowX == 9){
              row9 = temp1;
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
        else if ((rowX>= 7&&rowX<= 9)&&((rowY>= 4&&rowY<= 6))){
          //Box #8 
          i=(int)(Math.random()*(box8.length()-1))+0;
          num = Integer.valueOf(box8.substring( i, i+1));
          for (int f =0; f<box8.length()-1; f++){
              if (!(box8.substring( i, i+1).equals(box8.substring( f, f+1)))){
                  temp1+=box8.substring( f, f+1); 
              }
          }
          box8 = temp1;
          
          if (rowX == 7){
              row7 = temp1;
          }
          else if (rowX == 8){
              row8 = temp1;
          }
          else if (rowX == 9){
              row9 = temp1;
          }
          
          if (rowY == 4){
              line4 = temp1;
          }
          else if (rowY == 5){
              line5 = temp1;
          }
          else if (rowY == 6){
              line6 = temp1;
          }
          temp1=null;
          return num;
        }
        else if ((rowX>= 7&&rowX<= 9)&&((rowY>= 7&&rowY<= 9))){
          //Box #9 
          i=(int)(Math.random()*(box9.length()-1))+0;
          num = Integer.valueOf(box9.substring( i, i+1));
          for (int f =0; f<box9.length()-1; f++){
              if (!(box9.substring( i, i+1).equals(box9.substring( f, f+1)))){
                  temp1+=box9.substring( f, f+1); 
              }
          }
          box9 = temp1;
          
          if (rowX == 7){
              row7 = temp1;
          }
          else if (rowX == 8){
              row8 = temp1;
          }
          else if (rowX == 9){
              row9 = temp1;
          }
          
          if (rowY == 7){
              line7 = temp1;
          }
          else if (rowY == 8){
              line8 = temp1;
          }
          else if (rowY == 9){
              line9 = temp1;
          }
          temp1=null;
          return num;
        }
        else {
            num = 0;
        }
        return num;
    } 
    
    public static void Reset(){
    row1 = "123456789";
    row2 = "123456789";
    row3 = "123456789";
    row4 = "123456789";
    row5 = "123456789";
    row6 = "123456789";
    row7 = "123456789";
    row8 = "123456789";
    row9 = "123456789";
    box1 = "123456789";
    box2 = "123456789";
    box3 = "123456789";
    box4 = "123456789";
    box5 = "123456789";
    box6 = "123456789";
    box7 = "123456789";
    box8 = "123456789";
    box9 = "123456789";
    line1 = "123456789";
    line2 = "123456789";
    line3 = "123456789";
    line4 = "123456789";
    line5 = "123456789";
    line6 = "123456789";
    line7 = "123456789";
    line8 = "123456789";
    line9 = "123456789";
    }
}
