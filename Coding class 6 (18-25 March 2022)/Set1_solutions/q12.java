import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rs :");
        int amt = sc.nextInt();
        int c = 0;
        MinNotes(amt, c);
        sc.close();
    }

    public static void MinNotes(int amt, int c) {
        while (amt > 0) {
            if (amt % 100 == 0) {
                amt-=100;
                c++;
            } else if (amt % 20 == 0) {
                amt-=20;
                c++;
            } else if (amt % 10 == 0) {
                amt-=10;
                c++;
            } else if (amt % 5 == 0) {
                amt-=5;
                c++;
            } else if (amt % 2 == 0) {
                amt-=2;
                c++;
            } else {
                amt-=1;
                c++;
            }
        }
        System.out.println(c);
    }
}
