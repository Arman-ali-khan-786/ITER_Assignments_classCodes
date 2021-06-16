import java.util.Scanner;
public class sol_11 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
      double t=sc.nextDouble();
      double x=Math.toRadians(t);
      double cost =1, term=1, er=0.0000001;
      int i=0;
      while(Math.abs(term)>er) {
    	  i+=2;
    	  term=(-term)*((x*x)/(i*(i-1)));
    	  cost+=term;
      }
      System.out.println(cost);
	}

}
