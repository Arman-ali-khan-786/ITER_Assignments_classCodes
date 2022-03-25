package Set2_solutions;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String str = sc.nextLine();
        String str2[] = str.split("\\s");
        str="";
        for (int i =str2.length-1; i>=0; i--) {
            str=str+str2[i]+" ";
        }
        System.out.println(str);
        sc.close();
    }
}
