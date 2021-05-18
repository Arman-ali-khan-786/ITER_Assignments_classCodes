import java.util.*;
public class sol_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if (a+b==c && b-c==a && a*b==c) {
    	System.out.println("all are correct");
    }
    else if(a+b==c || b-c==a || a*b==c) 
    { 
    	System.out.println("it  is correct "); 
    	}
   
    
	else { 
    	System.out.println("it doesnot fits in any arithmetic formula");
    
	}

  }
}
