package Set2_solutions;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String str = sc.nextLine();
        String str2[] = str.split("\\s");
        str="";
        for (int i = 0; i < str2.length; i++) {
            str2[i] = reverse(str2[i]);
            str=str+str2[i]+" ";
        }
        System.out.println("After reversing each word ---->  "+str);

        sc.close();
    }

    private static String reverse(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str.charAt(i)+str2; 
        }
        return str2;
    }
}
