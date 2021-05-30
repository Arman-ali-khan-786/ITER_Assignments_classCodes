import java.util.Scanner;
public class sol_4 {

	public static void main(String[] args) {
	
		int cf,ct,cb,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the countfrom : ");
		cf=sc.nextInt();
		System.out.print("Enter the countto : ");
		ct=sc.nextInt();
		System.out.print("Enter the countby : ");
		cb=sc.nextInt();
		for(j=cf;j<=ct;j+=cb)
		{
		System.out.print(j+" ");
		}

    sc.close();
	}

}
