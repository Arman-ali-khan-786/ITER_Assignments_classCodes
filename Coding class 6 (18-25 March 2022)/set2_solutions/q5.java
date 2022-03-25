package Set2_solutions;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String str = sc.nextLine();
        char[] str2 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str2[i] == str2[j] && str2[j]!='*') {
                    str2[j] = '*';                    
                }
            } 
        }
        str = String.valueOf(str2).replace("*", "");
        System.out.println(str);
        sc.close();
    }
}
