import java.util.Scanner; 
public class sol_17{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter an integer: "); 
        int number = sc.nextInt(); 
        if ((number % 5 == 0) && (number % 6 == 0)) 
            System.out.println("number divisible by 5 and 6"); 
        if ((number % 5 == 0) || (number % 6 == 0)) 
            System.out.println("number divisible by 5 or 6 "); 
        if ((number % 5 == 0) ^ (number % 6 == 0)) 
            System.out.println("number divisible by 5 or 6 but not both"); 
        sc.close();
        } 
    } 
