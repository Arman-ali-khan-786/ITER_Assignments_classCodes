// Write a program to find whether it is possible to get a palindrome number from a given 
// number by re-arranging the positions of its digits. If yes, the program should print 2, else it 
// must print 1

import java.util.Arrays;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n  = sc.nextInt();
        int oddCount = isPalindromePossible(n);
        if (oddCount > 1) {
            System.out.println(1+" -> Palindrome not possible");
        } else {
            System.out.println(2+" -> Palindrome is possible");
        }
        sc.close();
    }

    private static int isPalindromePossible(int n) {
        int odd = 0;
        int count[] = new int[256];
        String str = Integer.toString(n);
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if((count[i]&1) == 1){
                odd++;
            }
        }
        return odd;
    }
}