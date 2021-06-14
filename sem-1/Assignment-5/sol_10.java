import java.util.Scanner;
public class sol_10 {
	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
      double t=sc.nextDouble();
      double x=Math.toRadians(t);
      double sint =x, term=x, er=0.0000001;
      int i=1;
      while(Math.abs(term)>er) {
    	  i+=2;
    	  term=(-term)*((x*x)/(i*(i-1)));
    	  sint+=term;
      }
     System.out.println(sint);
    sc.close();
	}

}
