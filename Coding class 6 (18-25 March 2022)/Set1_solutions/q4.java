// Write a java program to check whether two given number ‘a’ and ‘b’ are consecutive 
// term in the Fibonacci series or not.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (isfibo(a) && isfibo(b)) {
            int a_index = getFiboIndex(a);
            int b_index = getFiboIndex(b);
            if (b > a) {
                if (b_index - a_index == 1) {
                    System.out.println(a + " and " + b + " are consecutive fibonacci numbers.");
                } else {
                    System.out.println(a + " and " + b + " are not consecutive fibonacci numbers.");
                }
            } else {
                if (a_index - b_index == 1) {
                    System.out.println(a + " and " + b + " are consecutive fibonacci numbers.");
                } else {
                    System.out.println(a + " and " + b + " are not consecutive fibonacci numbers.");
                }
            }
        } else {
            System.out.println("one among the two is not a fibonacci number , Please check..");
        }

        sc.close();
    }

    private static int getFiboIndex(int a) {
        float index = (2.078087F * (float) Math.log(a)) + 1.67226F;
        return Math.round(index);
    }

    private static boolean isfibo(int a) {

        return (isPerfectsq((5 * a * a) + 4) || isPerfectsq((5 * a * a) - 4));
    }

    private static boolean isPerfectsq(int a) {
        int sq = (int) Math.sqrt(a);
        return (sq * sq == a);
    }
}