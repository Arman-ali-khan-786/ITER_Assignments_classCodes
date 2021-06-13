import  java.util.*;
public class sol_9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x : ") int x=sc.nextInt();
    System.out.println("Enter n : ") int n=sc.nextInt();
    int f=1;
    for(int i = n ; i>0 ; i--){
      f=f*i;
    }
    System.out.println("Result : "+(double)(Math.pow(x,n))/f);
    sc.close();
  }
}
    
