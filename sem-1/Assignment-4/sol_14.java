import java.util.Scanner;
public class sol_14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int val=0;
		int x=1;
		while(n>0)
		{
		  val=(int)Math.pow(2,x);
		  if(val>=n) {
			  System.out.println("the largest value of power of two less than or equal to"+" "+n+""+ " is"+" "+(int)Math.pow(2,(x-1))+"and the power digit is "+(x-1));
			  break;}
		  else {
			  x++;
		  }
		}
	}

}
