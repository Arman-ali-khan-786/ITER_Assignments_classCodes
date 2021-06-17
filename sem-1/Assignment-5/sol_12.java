import java.util.Scanner;
public class sol_12 {
	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
      double x=sc.nextDouble();
      double s=0, term=1;
      for(int i=1;s!=s+term; i++) {
    	  s+=term;
    	  term*=(x/i);
      }
      System.out.println("e to the power("+x+")="+s);
    sc.close();
	}

}
