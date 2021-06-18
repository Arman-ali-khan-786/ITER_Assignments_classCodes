import java.util.*;
public class sol_13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter upto which term : ");
    int n = sc.nextInt();
    int a,b,c;
    a=0;
    b=1;
    System.out.print(a+" "+b);
    while((n-2)>0){
      c = a+b;
      System.out.print(c+" ");
      a=b;
      b=c;
      n--;
    }
    sc.close();
      
    
  }
}
