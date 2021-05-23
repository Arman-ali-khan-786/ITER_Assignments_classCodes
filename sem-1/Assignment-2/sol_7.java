import java.util.*;
public class sol_7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the hexagon : "); double s = sc.nextDouble();
    double ar = ((3*(1.732))/2)*s*s;
    System.out.println("Area of hexagon : "+ar);
    sc.close();
    }
}
