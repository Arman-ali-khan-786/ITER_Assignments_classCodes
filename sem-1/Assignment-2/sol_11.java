import java.util.Scanner;

public class a2_q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");double am = sc.nextDouble();
        System.out.println("Enter annual interest rate in percentage : ");double rate = sc.nextDouble();
        System.out.println("Enter number of years : ");int yr =sc.nextInt();
        double fIvestmentvalue = am*Math.pow((1+(rate/100)),(yr));
        System.out.println("Accumulated value is : $"+fIvestmentvalue);
        sc.close();
    }
}
