package Set2_solutions;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        str = removeduplicate(str);
        for (int i = 0; i < str.length(); i++) {
           if (count[str.charAt(i)]!=0  ) {
                System.out.println(str.charAt(i)+"-->"+count[str.charAt(i)]);
           }
        }
        sc.close();

    }
    
    private static String removeduplicate(String str) {

        // char[] arr1 = str.toCharArray();
        // String str2 = "";
        // for (char value: arr1) {
        //  if (str2.indexOf(value) == -1) {
        //   str2 += value;
        //  }
        // }
        // return str2;

        // or

        char[] str2 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str2[i] == str2[j] && str2[j]!='*') {
                    str2[j] = '*';                    
                }
            } 
        }
        str = String.valueOf(str2).replace("*", "");
        // System.out.println(str);
        return str;

       }


}
