//Alex Winstanley\
//12/5/16
import java.util.Scanner;

public class MSDOS {
   
   public static void main (String [] args){
   
      System.out.println("Please enter your file name: ");
      Scanner keyboard = new Scanner(System.in);
      String file = keyboard.next();
      System.out.println("" + validFileName(file));
   
   }


   public static String validFileName ( String fileName){
      
      int counter = 0;
      int length = fileName.length() - 1;
      StringBuilder placeHold= new StringBuilder();
      for(int x= 0; x<=length; x++){
         
         char y = fileName.charAt(x);
      
         if (y == '.' || y == ':' || y == '\\' || y == '?' || y == '*'){
             
            break;}
         
         else 
            counter++;
      }
   
      if (counter > 8)
         return null;
        
          
      if(fileName.charAt(length-1)=='.'||fileName.charAt(length-2)=='.'||fileName.charAt(length-3)=='.'){
         return fileName.toUpperCase();
      }
      else if (fileName.charAt(length)=='.'){
         placeHold.append(fileName);
         placeHold = placeHold.deleteCharAt(length); 
         String out= placeHold.toString();
         return out.toUpperCase();
      }
      else{
         String out = fileName + ".TXT";
         return out.toUpperCase();
      }
      
   }
}