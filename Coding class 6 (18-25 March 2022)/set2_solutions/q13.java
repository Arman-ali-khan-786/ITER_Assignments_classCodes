package Set2_solutions;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            sum= sum +(int)(Math.pow((-1), (i-1)))*c;
            c+=2;
        }
        System.out.println(sum);
        sc.close();
    }
}
