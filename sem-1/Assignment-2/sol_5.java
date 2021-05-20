import java.util.*;
public class sol_5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double u , v , avg ;
    int t;
    System.out.println("Enter initial velocity (u) in m/sec : ");
    u = sc.nextDouble();
    System.out.println("Enter final velocity (v) in m/sec : ");
    v = sc.nextDouble();
    System.out.println("Enter time Span (t) : ");
    t = sc.nextInt();
    avg  = (v-u)/t ;
    System.out.println("Average Acceleration : "+avg);
  }
}
