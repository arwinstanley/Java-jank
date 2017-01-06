//Alex Winstanley
public class IloveLife{

   public static void main(String []args){
   
      int nums[] = new int[15];
      for(int i=0; i<=10;i++){
      
         nums[i]=random();
      }
   
   }
   public static int random(){
   
      return ((int)((Math.random()*99)+1));
   }
   
   public static int[] insertArray( int num[] , int insert, int value){
      int length = num.length;
      int num2[]= new int [15];
      for(int i= 0; i<=length; i++){
         if(i<value)
            num2[i]= num[i];
         if(i==value)
            num2[i]=insert;
         if(i>value)
            num2[i]=num[i-1];
      }
      return num2;
   }
   public static int[] deleteArray( int num[] , int delete){
      int length = num.length;
      int num2[]= new int [15];
      for(int i= 0; i<=length; i++){
         if(i<delete)
            num2[i]= num[i];
         if(i>=delete)
            num2[i]=num[i+1];
      }
      return num2;
   
   }
}