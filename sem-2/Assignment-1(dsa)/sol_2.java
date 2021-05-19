import java.util.*;
public class sol_2 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 int a,c=0,n;
	 a=sc.nextInt();
	 n=a;
	 if (a>=2) {
		 while(a>=2) {
			 a=a/2;
			 c++;
		 }
		 System.out.println("No of times you have to divide "+n
				+" by 2 to get the value <  2 : "+c);
	}
	 
	 else {
		 System.out.println("enter a number greater than 2 ");
	 }
	 /*
   ---->  This is an alternative short One <----
   
	 int p =(int)(Math.log(a)/Math.log(2));
	 System.out.println("No of times you have to divide "+a+
			 " by 2 to get the value less than 2 : "+p);
       
       */
    
   }
}
