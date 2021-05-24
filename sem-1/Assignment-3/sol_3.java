import java.util.Scanner;

public class sol_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();
        if (a%2==0)
          System.out.println("You have entered an even number .");
        else
          System.out.println("You have entered an odd number .");
        sc.close();
    }
}
