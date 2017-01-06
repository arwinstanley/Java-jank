import java.lang.Math;
public class Tri{
   private double area, s, sideA, sideB, sideC; 
   
   
   public Tri(double a, double b, double c){
     sideA = a;
     sideB= b;
     sideC= c;
   }
   
   
   
    public double getArea(){ 
        s = 0.5 * (sideA + sideB + sideC);
        area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        System.out.println("Area: " + area);
        return area;
    }
}