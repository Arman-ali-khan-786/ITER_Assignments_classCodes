import java.util.Scanner;

public class sol_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Gender (M / F):");char gen = sc.next().charAt(0);
        System.out.println("Enter your First name : ");String Fname = sc.next();
        System.out.println("Enter your Second name : ");String Lname = sc.next();
        System.out.println("Enter your age : ");int age = sc.nextInt();
        if (gen == 'f' || gen == 'F'){
            if (age>20){
                System.out.println("Are you married (y/n)? ");char q = sc.next().charAt(0);
                if (q=='y'|| q=='Y'){
                    System.out.println("Mrs. "+Fname+" "+Lname);
                }
                else{
                    System.out.println("Ms ."+Fname+" "+Lname);
                }
            }
            else{
                System.out.println(Fname+" "+Lname);
            }

        }
        else{
            if (age>20){
                System.out.println("Mr . "+Fname+" "+Lname);
            }
            else{
                System.out.println(Fname+" "+Lname);
            }
        }
    sc.close();
    }
}
