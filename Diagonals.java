//Alex Winstanley
//12/13/2016

public class Diagonals{

   public static boolean isDiagonal (int i , int j){
      int matrix[][]= new int[][] {{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4}};
      int x=0,y=0;
      for (int lcv = 0; lcv<matrix.length; lcv++){
         if (x==j&&y==i)
            return true;
         x++;
         y++;
      }
      x =0;
      y=matrix.length-1;
      for (int lcv = 0; lcv<matrix.length; lcv++){
         if (x==j&&y==i)
            return true;
         x++;
         y--;
      }
      return false;
   }
   public static void main(String [] args){
   
      System.out.println(""+ isDiagonal(3,4));
      System.out.println(""+ isDiagonal(0,4));
      System.out.print(""+ isDiagonal(4,4));
   }
}