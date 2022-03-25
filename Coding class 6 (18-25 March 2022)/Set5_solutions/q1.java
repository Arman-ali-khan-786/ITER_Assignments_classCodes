package Set5_solutions;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String psswd = sc.next();
        if(checkChar(psswd)&& checkDigits(psswd)&&checkAlphaNum(psswd)){
            System.out.println("Valid Password.");
        }else{
            System.out.println("Invalid Password.");
        }
        sc.close();

    }

    private static boolean checkAlphaNum(String psswd){
        boolean f = false;
        for (int i = 0; i < psswd.length(); i++) {
            if ((psswd.charAt(i) >= 48 && psswd.charAt(i) <= 57)|| ((psswd.charAt(i) >= 65 && psswd.charAt(i) < 92))
            || (psswd.charAt(i) >= 97 && psswd.charAt(i) <= 122)){
                f = true;
            }
        }
        return f;
    }

    private static boolean checkDigits(String psswd) {
        int c = 0;
        for (int i = 0; i < psswd.length(); i++) {
            if (psswd.charAt(i) >= 48 && psswd.charAt(i) <= 57)
                c++;
        }
        if(c>=2){
            return true;
        }
        return false;
    }

    private static boolean checkChar(String psswd) {
        if(psswd.length() >=8){
            return true;
        }
        return false;
    }
}
