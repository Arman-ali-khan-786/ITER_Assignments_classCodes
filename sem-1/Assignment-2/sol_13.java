import java.util.Scanner;

public class sol_13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int MinutesInYear = 60*24*365;
        System.out.println("Enter minutes : ");long minutes = sc.nextLong();
        int years = (int)(minutes/MinutesInYear);
        int days = (int)((minutes/60)/24)%365;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days .");
        sc.close();
    }
    
}
