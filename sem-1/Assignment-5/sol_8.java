import java.util.*;
public class sol_8 {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n, f=1;
       System.out.print("enter no of term : ");
       n=sc.nextInt();
       for(int i=n;i>0;i--) {
    	   f*=i;
       }
       System.out.println("factorial of "+n+" is "+f);
    sc.close();
       
	}

}
