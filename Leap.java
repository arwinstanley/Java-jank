import java.util.Scanner;
//03 04 10 1965
public class Leap{
      public static void main(String [] args){
      System.out.println(isLeapYear(2000));
      System.out.println(isLeapYear(2003));
      System.out.println(isLeapYear(2004));
      System.out.println(isLeapYear(2010));
      System.out.println(isLeapYear(1965));
      }
 
 
 
     public static boolean isLeapYear(int year){
 
      if ((year % 4)==0){
         if ((year% 100!= 0)||( year %400 ==0)){
           return true;
           }
          else return false;
          }
          else return false;//("It is not a leap year")
     
 
 
 }
}