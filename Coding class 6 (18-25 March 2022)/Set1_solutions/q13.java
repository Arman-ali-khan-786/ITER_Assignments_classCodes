// An  integer n  is  divisible  by  9 if  the  sum  of its  digits  is  divisible  by  9.  Develop a 
// program to display each digit, starting with the rightmost digit. Your program should also 
// determine whether or not the number is divisible by 9

import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n  = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("\nSum of digits of "+n+" = "+sum);
        if(sum % 9  == 0){
            System.out.println(n+" is divisible by 9 .");
        }else{
            System.out.println(n+" is not divisible by 9 .");
        }
        sc.close();
    }

    private static int sumOfDigits(int n) {
        int res = 0 ;
        System.out.println("Digits from rightmost side : ");
        while(n>0){
            int rem = n%10;
            System.out.print(rem+" ");
            res = res+rem;
            n/=10;
        }
        return res;
    }
}
