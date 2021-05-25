import java.util.*;
public class sol_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rahul's age : ");int r =sc.nextInt();
        System.out.println("Enter Ajay's age : ");int aj =sc.nextInt();
        System.out.println("Enter Ayush's age : ");int ay =sc.nextInt();
        if (r>aj && aj>ay){
            System.out.println("Rahul is elder .");
        }
        else if (aj>r && r >ay){
            System.out.println("Ajay is elder .");
        }
        else {
            System.out.println("Ayush is elder .");
        }
        sc.close();
    }
}
