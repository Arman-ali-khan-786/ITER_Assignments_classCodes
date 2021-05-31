import java.util.*;
public class sol_13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int m = n;
    int sum=0;
    while(n>0){
      int rem = m%10;
      sum=sum+rem;
      m=m/10;
    }
    if(sum%9==0)
      System.out.println(n1+" is divisible by 9");
		else
		  System.out.println(n1+" is not divisible by 9");
    sc.close();
  }
}
