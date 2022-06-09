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
    private String num;
    private static String temp1 = "";
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
    
    public String NumberSelector(int rowX, int rowY){
//        num = (int)(Math.random()*8)+0; (Choosing random string)
        boolean found = false;
        if (rowX==1&&rowY==1){
        num = ""+RandomNumber(row1);
        while(found==false){
            if ((row1.contains(num) && box1.contains(num) && line1.contains(num))){
               RemoveNum(row1,num);
               RemoveNum(box1,num);
               RemoveNum(line1,num);
               found = true;
            }
            else{
               num = ""+RandomNumber(row1);
            }
        }
        }
        return num;
    } 
    
    public int RandomNumber(String n){
       int i = (int) (Math.random()*n.length()-1)+0;
       return i;
    }
    
    public void RemoveNum(String box, String num){
        for (int f =0; f<box.length(); f++){
              if (!(box.substring( f, f+1).equals(num))){
                   temp1+=box.substring( f, f+1);
              }
          }
        box=temp1;
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
