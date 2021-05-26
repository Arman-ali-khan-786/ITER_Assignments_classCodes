import java.util.*;
public class sol_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter todays day number like 0 - sunday ......to 6 - saturday :");
        int day = sc.nextInt();
        System.out.println("Enter no of days elasped from today : ");int epday = sc.nextInt();
        int fday = (day+epday)%7;
        System.out.print("Today is "); 
        switch (day) { 
            case 0: System.out.print("Sunday"); break; 
            case 1: System.out.print("Monday"); break; 
            case 2: System.out.print("Tuesday"); break; 
            case 3: System.out.print("Wednesday"); break; 
            case 4: System.out.print("Thursday"); break; 
            case 5: System.out.print("Friday"); break; 
            case 6: System.out.print("Saturday");
        } 
        System.out.print(" and the future day is "); 
        switch (fday) { 
            case 0: System.out.println("Sunday"); break; 
            case 1: System.out.println("Monday"); break; 
            case 2: System.out.println("Tuesday"); break; 
            case 3: System.out.println("Wednesday"); break; 
            case 4: System.out.println("Thursday"); break; 
            case 5: System.out.println("Friday"); break; 
            case 6: System.out.println("Saturday"); }
    }
    
}
