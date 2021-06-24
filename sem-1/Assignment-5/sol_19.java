import java.util.*;
public class sol_19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		String p="";
		while(n>0)
		{
		   int rem=n%2;
		   p=rem+p;
		   n=n/2;
		}
		System.out.println(p);
	}

}
