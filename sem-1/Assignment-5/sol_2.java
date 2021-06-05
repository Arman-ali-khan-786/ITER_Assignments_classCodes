import java.util.*;
public class sol_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,c=0;
		System.out.println("Enter the number of numbers u want to enter");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		System.out.println("Enter the mark");
		int num=sc.nextInt();
		if ( num >=40)
		c++;
		}
		System.out.println("The pass students are "+c);
   sc.close();
	}

}
