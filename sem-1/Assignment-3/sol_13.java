import java.util.*;
public class sol_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number (1 for January ... & 12 for December) :");
        int month = sc.nextInt();
        System.out.println("Enter year : ");int yr = sc.nextInt();
        boolean leapyr = (yr%4==0 && yr%100!=0) || (yr%400==0);
        switch(month){
            case 1 :System.out.println("January "+yr+" has 31 days."); break;
            case 2 :System.out.println("Feburary "+yr+" has "+((leapyr)?"29" : "30")+" days.");break;
            case 3 :System.out.println("March "+yr+" has 31 days.");break;
            case 4 :System.out.println("April "+yr+" has 30 days.");break;
            case 5 :System.out.println("May "+yr+" has 31 days.");break;
            case 6 :System.out.println("June "+yr+" has 30 days.");break;
            case 7 :System.out.println("July "+yr+" has 31 days.");break;
            case 8 :System.out.println("August "+yr+" has 31 days.");break;
            case 9 :System.out.println("September "+yr+" has 30 days.");break;
            case 10 :System.out.println("October "+yr+" has 31 days.");break;
            case 11 :System.out.println("November "+yr+" has 30 days.");break;
            case 12 :System.out.println("December "+yr+" has 31 days.");break;
        }
    }
}
