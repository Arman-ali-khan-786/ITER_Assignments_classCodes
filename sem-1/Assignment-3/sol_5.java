import java.util.*;
public class sol_5 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a , b & c values respectively : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double D = Math.pow(b, 2)-(4 * a *c);
        if (D>0){
            double r1 = (-b + Math.pow(D, 0.5))/(2*a);
            double r2 = (-b - Math.pow(D, 0.5))/(2*a);
            System.out.println(r1+" and "+r2+" are the two roots .");
        }
        else if (D==0){
            System.out.println("The equation has one root.");
        }
        else{
            System.out.println("The equation has no Real roots .");

        }
        sc.close();
    }
    
}
