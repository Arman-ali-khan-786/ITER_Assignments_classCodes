import java.util.*;
public class sol_1 {
	public static void main(String[] args) {	
		int n,i;
		System.out.println("Enter the value of n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		double r=Math.pow(2,i);
		System.out.println("2^"+i+" = "+r);
		sc.close();
		}
	}

}
