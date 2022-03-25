package Set2_solutions;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p=n,sum = 0,k=1;
        while(p>0){
            int rem = p%10;
            rem*=k;
            sum =sum+(m*rem);
            k*=10;
            p/=10;
        }
        System.out.println("Multiplications of "+m+" and "+n+" = "+sum);
        sc.close();
    }
}
