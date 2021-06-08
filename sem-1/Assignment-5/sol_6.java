import java.util.*;
public class sol_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a;
		double s=0,H=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		   System.out.println("Enter the value of a["+i+"]");
		   a=sc.nextInt();
		   s+=(1/a);
		}
		H=n/s;
		System.out.println("The harmonic mean is= "+H);
		sc.close();
	}

}
