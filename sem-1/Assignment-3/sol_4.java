import java.util.Scanner;

public class sol_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);
        if (ch>=65 & ch<=90){
            System.out.println(" You have entered a capital letter .");
        }
        else if (ch>=97 && ch<=122){
            System.out.println("You have entered a small letter .");
        }
        else if(ch>=48 && ch<57){
            System.out.println(" You have entered a digit .");
        }
        else {
            System.out.println("You have entered a special Character .");
        }
        sc.close();
    }
}
