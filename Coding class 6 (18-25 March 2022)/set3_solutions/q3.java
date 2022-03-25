package Set3_solutions;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max = 0;

        for (int i = 1; i < n; i++) {
            if((n%i==0) && i>max){
                max=i;
            }
        }
        System.out.println("Largest Factor of "+n+" is "+max);
        sc.close();
    }
}
