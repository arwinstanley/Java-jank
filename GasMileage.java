// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
  public static double gasUsed(int m, double x)
  {
    return m/x;
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    System.out.print("Mileage: ");
    double mpg = input.nextDouble();
    
    input.close();
    
    //String gallons = mpg(miles, gasUsed(miles, mpg));
    System.out.printf("Your car's gas mileage was " + mpg+" miles per gallon\n"+"You used "+ gasUsed(miles,mpg)+" gallons");
  }
}
