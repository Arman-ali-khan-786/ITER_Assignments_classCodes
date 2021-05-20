import java.util.*;
public class sol_4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER A NUMBER BETWEEN 0 AND 999 : ");
    int n = sc.nextInt(); int sum = 0;
    while (n>0){
      int r = n%10;
      sum = sum + r;
      n=n/10;
    }
    System.out.println("Sum of the digits : "+sum);
  }
}
