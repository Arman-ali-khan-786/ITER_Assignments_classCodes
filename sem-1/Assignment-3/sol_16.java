import java.util.Scanner;

public class sol_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks you got out of 100 : ");
        double marks = sc.nextDouble();
        switch((int)(marks/10)){
            case 0: case 1: case 2: case 3: System.out.println("Your grade is F"); break;
            case 4: System.out.println("Your grade is E"); break;
            case 5: System.out.println("Your grade is D"); break;
            case 6: System.out.println("Your grade is C");break;
            case 7: System.out.println("Your grade is B"); break;
            case 8: System.out.println("Your grade is A"); break;
            case 9: case 10: System.out.println("Your grade is O"); break;
            default: System.out.println("Invalid input ");
        }
        sc.close();
    }
}
