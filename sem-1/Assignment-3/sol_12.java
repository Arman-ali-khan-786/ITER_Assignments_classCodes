import java.util.*;
public class aol_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max =Math.max(a,Math.max(b,c));
        int min =Math.min(a,Math.min(b,c)); 
        int mid =(a+b+c)-max-min; 
        System.out.println("Ascending order :");
        System.err.println(min+"\t"+mid+"\t"+max);
        sc.close();
    }
    
}
