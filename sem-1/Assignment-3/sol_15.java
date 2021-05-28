import java.util.Scanner;

public class sol_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x co-ordinate : ");double x= sc.nextDouble();
        System.out.println("Enter y co-ordinate : ");double y= sc.nextDouble();
        double rad = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        if (rad < 10){
            System.out.println("Points ("+x+","+y+") is inside  the circle .");
        }
        else if (rad==10){
            System.out.println("Points ("+x+","+y+") lies on the circle .");
        }
        else{
            System.out.println("Points ("+x+","+y+") is outside the circle .");
        }
        sc.close();
    }
}
