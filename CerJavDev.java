//Alex Winstanley 

public class CerJavDev{


   public static void main(String [] args){
   
      Perc();
   
   
   }


   public static void Perc(){
      double rate=0.0;
      int years, months=0;
      
      for (double perc=0.0; perc<=95.0;perc+=rate){
      
         if (perc==0){
            rate= 10.0;
            months++;
        
         }
         else{
            rate= (100-perc)*0.10;
            months++;
         }
         
         
      }
      years= months/12;
      months = months%12;
      System.out.print("It will take "+ years + " years and "+ months +" months.");
   }
}