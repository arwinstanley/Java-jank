import java.util.Scanner;

public class TriTest {

    public static void main(String[] args) {

       double a,b,c;

        Scanner TriSides = new Scanner(System.in);
        System.out.println("Length of first side:");
        a = TriSides.nextDouble();
        System.out.println("Length of second side:");
        b = TriSides.nextDouble();
        System.out.println("Length of third side:");
        c = TriSides.nextDouble();
        Tri newTri = new Tri(a, b, c);
        newTri.getArea();
    }
}