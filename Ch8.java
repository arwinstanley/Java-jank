public class Ch8{
   public static boolean star(String s){
      if (s.length()>=1&&s.charAt(s.length()-1)=='*')
         return true;
      return false;
   }
   public static boolean star2(String s){
      if (s.length()>=2&&(s.charAt(s.length()-1)=='*'&&s.charAt(s.length()-2)=='*'))
         return true;
      return false;
   }
   public static String removeDashes(String s){
      StringBuilder x = new StringBuilder(s);
      x = x.deleteCharAt(3);
      x = x.deleteCharAt(5);
      s = x.toString();
      return s;
   }
   public static String dateStr(String dateStr){
      if (dateStr.charAt(1)== '/')
         dateStr= "0" + dateStr;
      if (dateStr.charAt(4)== '/')
         dateStr= dateStr.substring(0,3) + "0" + dateStr.substring(3);
      dateStr = dateStr.substring(3,5) + '-'+dateStr.substring(0,2) + '-' +dateStr.substring(6);
      return dateStr;
   }
   public static String ccNumber( String x){
      String last4= x.substring(15);
      String last5= x.substring(13, 14) + x.substring(15);
      return last5;
   }
   public static String scroll(String x){
      return x.substring(1, x.length()) + x.substring(0,1);
   }
   public static void main(String [] args){
   
      System.out.println( star("rock*") + "");
      System.out.println( star2("rock*") + "");
      System.out.println( removeDashes("987-65-4321") + "");
      System.out.println( dateStr("2/5/2002"));
      System.out.println( ccNumber("1234 5678 9101 1213"));
      System.out.println( scroll("hello"));
   }
}