import java.util.*;
public class sol_17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double g1,g2;
		g2=n/2;
		do
		{
		    g1=g2;
		    g2=(g1+(n/g1))/2.0;
		} 
		while (Math.abs(g1-g2)>0.000001);
		double root=g2;
		System.out.println("square root of "+n+" is = "+root);
	}

}
