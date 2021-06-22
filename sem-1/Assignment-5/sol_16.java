import java.util.*;
public class sol_16{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive number : ");
    long n = sc.nextLong();
    long rev=0,m=n;
    while(m>0){
      long rem = m%10;
      rev = (rev*10)+rem;
      m = m/10;
    }
    System.out.println("Number in Reverse : "+rev);
    sc.close();
  }
}
