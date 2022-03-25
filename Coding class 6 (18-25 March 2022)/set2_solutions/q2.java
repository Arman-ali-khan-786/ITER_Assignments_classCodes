package Set2_solutions;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str  = sc.nextLine();
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        if(str2.toString().equals(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");

        }
        sc.close();
    }
}
