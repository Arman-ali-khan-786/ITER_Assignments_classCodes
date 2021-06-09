import java.util.*;
public class sol_7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter upto which term : ");
    int n = sc.nextInt();
    int f=1 , sum=0 ,m=1;
    for(int i = 1 ; i<=n ; i++){
      sum= sum+(f*m);
      m+=2;
      f=f*(-1);    
    }
    System.out.println("Sum = "+sum);
  }
}
