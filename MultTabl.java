//Alex WInstanley
public class MultTabl  {


   public static void main (String [] args){
      System.out.println(" |1|2|3|4|5|6|7|8|9|10|11|12");
      System.out.println("1|1|2|3|4|5|6|7|8|9|10|11|12");
      System.out.println("2|2|4|6|8|10|12|14|16|18|20|22|24");
      System.out.println("3|3|6|9|12|15|18|21|24|27|30|33|36");
      System.out.println("4|4|8|12|16|20|24|28|32|36|40|44|48");
      System.out.println("5|5|10|15|20|25|30|35|40|45|50|55|60");
      System.out.println("6|6|12|18|24|30|36|42|48|54|60|66|72");
      System.out.println("7|7|14|21|28|35|42|49|56|63|70|77|84");
      System.out.println("8|8|16|24|32|40|48|56|64|72|80|88|96");
      System.out.println("9|9|18|27|36|45|54|63|72|81|90|99|108");
      System.out.println("10|10|20|30|40|50|60|70|80|90|100|110|120");
      System.out.println("11|11|22|33|44|55|66|77|88|99|110|121|132");
      System.out.println("12|12|24|36|48|60|72|84|96|108|120|132|144");
      System.out.println();
      System.out.println();
      System.out.println();
     // above is what the problem asked for but I have a sneaking suspicion this is better
      mult();
     
   }


   public static void mult(){
    
      for(int x=1;x<=12;x++){
      
      if (x==1) 
      System.out.println(" |1|2|3|4|5|6|7|8|9|10|11|12");
         System.out.println(x+"|"+x*1+"|"+x*2+"|"+x*3+"|"+x*4+"|"+x*5+"|"+x*6+"|"+x*7+"|"+x*8+"|"+x*9+"|"+x*10+"|"+x*11+"|"+x*12);
      
      
      }
    
    
   }










}