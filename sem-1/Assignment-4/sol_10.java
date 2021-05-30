import java.util.Scanner;
public class sol_10 {
  public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number whose multiplication table you want to find: ");
		int num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
		
		System.out.println("|\t"+num+"\tx\t"+i+"\t=\t"+num*i+"\t |");
		}
    sc.close();
	}

}
