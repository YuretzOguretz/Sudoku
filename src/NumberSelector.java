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
    private static String row [] = new String[9];
    private static String box [] = new String[9];
    private static String line [] = new String[9];
    
    public NumberSelector(){
        for (int index = 0; index < 9; index++) {
            row[index] = "123456789";
            box[index] = "123456789";
            line[index] = "123456789";
            
        }
    }
    
    public String NumberSelector(int rowX, int rowY){
        
        

        if ((rowX>= 1&&rowX<= 3)&&((rowY>= 1&&rowY<= 3))){
          //Box #1
          int section = 0;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 1&&rowX<= 3)&&((rowY>= 4&&rowY<= 6))){
          //Box #2  
          int section = 1;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 1&&rowX<= 3)&&((rowY>= 7&&rowY<= 9))){
          //Box #3 
          int section = 2;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 1&&rowY<= 3))){
          //Box #4  
          int section = 3;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 4&&rowY<= 6))){
          //Box #5
          int section = 4;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 4&&rowX<= 6)&&((rowY>= 7&&rowY<= 9))){
          //Box #6  
          int section = 5;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 7&&rowX<= 9)&&((rowY>= 1&&rowY<= 3))){
          //Box #7 
          int section = 6;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 7&&rowX<= 9)&&((rowY>= 4&&rowY<= 6))){
          //Box #8 
          int section = 7;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else if ((rowX>= 7&&rowX<= 9)&&((rowY>= 7&&rowY<= 9))){
          //Box #9  
          int section = 8;
          num = UsebleRandomnum( rowX-1 ,  rowY-1 ,  section);
        }
        else {
            num = "k";
        }

        return num;
    } 
    
    public String UsebleRandomnum(int a, int b, int c){
        boolean found = false;
        int substring = RandomNumber(row[a]);
        num = row[a].substring(substring,substring+1);
        while(found==false){
            if (row[a].indexOf(num)==-1 || box[c].indexOf(num)==-1 || line[b].indexOf(num)==-1){
               substring = RandomNumber(row[a]);
               num = row[a].substring(substring,substring+1);
            }
            else {
               RemoveNumFromRow(row[a],num ,a);
               RemoveNumFromBox(box[c],num,c);
               RemoveNumFromLine(line[b],num, b);
               found = true;
          
            }
        }
        found = false;
        return num;
        
    }
    
    public int RandomNumber(String n){
       int i = (int) (Math.random()*n.length()-1)+0;
       return i;
    }
    
    public void RemoveNumFromRow(String box, String num1, int numA){
        for (int f =0; f<box.length(); f++){
              if (!(box.substring( f, f+1).equals(num1))){
                   temp1+=box.substring( f, f+1);
                   
              }
          }
        box = temp1;
        row[numA] = box;
        temp1 ="";
//        System.out.println("box "+box);
    }

    public void RemoveNumFromBox(String box1, String num1, int numB) {
        for (int f =0; f<box1.length(); f++){
              if (!(box1.substring( f, f+1).equals(num1))){
                   temp1+=box1.substring( f, f+1);
                   
              }
          }
        box1 = temp1;
        box[numB] = box1;
        temp1 ="";
//        System.out.println("box "+box);
        
    }
    
    public void RemoveNumFromLine(String box, String num1, int numB) {
        for (int f =0; f<box.length(); f++){
              if (!(box.substring( f, f+1).equals(num1))){
                   temp1+=box.substring( f, f+1);
                   
              }
          }
        box = temp1;
        line[numB] = box;
        temp1 ="";
//        System.out.println("box "+box);
        
    }
    
    public static void Reset(){
    for (int index = 0; index < 9; index++) {
            row[index] = "123456789";
            box[index] = "123456789";
            line[index] = "123456789";
//            System.out.println(index);
    }
}
}
