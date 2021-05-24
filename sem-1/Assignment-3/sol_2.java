import java.util.*;
public class sol_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student's mark : ");
        double mark = sc.nextDouble();
        if(mark>=40)
          System.out.println("Congratulation! You have passed the exam");
        else
          System.out.println("Sorry! You have failed the exam");
        sc.close();
    }
}
