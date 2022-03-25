import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number greater than 9 :");
        int n = sc.nextInt();
        int m = n ;
        int res = 0;
        while(m > 9){
            int rem = m % 10;
            res = res+rem;
            m/=10;
        }
        System.out.println("Sum of digits of "+n+" = "+res);

        sc.close();
    }
}
