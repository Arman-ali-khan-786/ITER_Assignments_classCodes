import java.util.*;
public class sol_15{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an amount : ");
    double am = sc.nextDouble();
    System.out.println("Enter annual interest rate : ");
    double r = sc.nextDouble();
    System.out.println("Enter no of months : ");
    int m = sc.nextInt();
    int n = m;
    int sum = 0;
    while(n>0){
      sum = (am + sum)*(1+((r/100)/12));
      n--;
    }
    if(m<=1){
      System.out.println("Your Saving amount after "+m+" month is "+sum);
    }
    else{
      System.out.println("Your Saving amount after "+m+" months is "+sum);
    }
    sc.close();
  }
}
    
