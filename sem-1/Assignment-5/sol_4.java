import java.util.*;
public class q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number (input ends if it is 0)");
		int n,pos=0,neg=0,total=0,c=0;
		double avg=0;
		while((n=sc.nextInt()) !=0)
		{
		  c++;
		  total+=n;
		  if(n==0) {
			  System.out.println("no numbers are entered except zero");
		  }
		  else {
			  if(n>0) {
			  pos++;
		      }
		      if(n<0)
		      {
			  neg++;
		      }
		     avg=total/c;
		     System.out.println("no of positive no's: "+pos);
		     System.out.println("no of negative no's: "+neg);
		     System.out.println("average : "+avg);
		  }
		sc.close();
	}
 }
}
