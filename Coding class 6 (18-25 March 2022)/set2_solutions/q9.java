package Set2_solutions;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n  = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < n/2; i++) {
            if( n%i == 0){
                flag = false;
             break;
            }
        }
        System.out.println((flag)? n+" is a Prime number." : n+" is not a Prime number.");
        sc.close();
    }
}
