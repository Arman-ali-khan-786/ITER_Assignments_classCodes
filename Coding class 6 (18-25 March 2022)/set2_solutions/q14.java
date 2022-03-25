package Set2_solutions;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms : ");
        int n = sc.nextInt();
        fibonacciSeries(n);
        sc.close();
    }

    private static void fibonacciSeries(int n) {
        int a = 0,b=1,c=0;
        while(c<n){
            System.out.print(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
            c++;
        }
    }
    
}
