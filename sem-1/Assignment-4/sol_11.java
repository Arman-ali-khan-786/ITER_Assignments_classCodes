public class sol_11 {
	public static void main(String[] args) {
		int i,sum1=0,sum2=0,d=0,s=0;
		for(i=1;i<=10;i++)
		{
		sum1+=i*i;
		sum2+=i;
		}
		s=sum2*sum2;
		d=s-sum1;
		System.out.println("The sum of squares of the integers="+sum1);
		System.out.println("The square of the sum of the integers="+s);
		System.out.println("The difference of sum1 and sum2 is= "+d);

	}

}
