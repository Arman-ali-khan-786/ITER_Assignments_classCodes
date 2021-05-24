import java.util.Scanner;

public class sol_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate"); double x = sc.nextDouble();
        System.out.println("Enter y-coordinate"); double y = sc.nextDouble();
        if (x==0 && y>0){
            System.out.println("("+x+","+y+") points  are in y-axis .");
        }
        else if (y==0 && x>0){
            System.out.println("("+x+","+y+") points are in x-axis .");
        }
        else if (x>0 && y>0){
            System.out.println("("+x+","+y+") points lies in 1st Quadrant.");
        }
        else if (x<0 && y>0){
            System.out.println("("+x+","+y+") points lies in 2nd Quadrant .");
        }
        else if (x<0 && y<0){
            System.out.println("("+x+","+y+") points lies in 3rd Quadrant.");
        }
        else if (x>0 && y<0){
            System.out.println("("+x+","+y+") points lies in 4th Quadrant.");
        }
        else{
            System.out.println("("+x+","+y+") points lies in origin .");
        }
        sc.close();
    }
}
