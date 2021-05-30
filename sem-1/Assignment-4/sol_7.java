public class sol_7 {
	public static void main(String[] args) {
		int N,i;
		double p,sum=0,avg=0;
		N=Integer.parseInt(args[0]);
		for(i=1;i<=N;i++)
		{
		p=Math.random();
		System.out.println("Random no."+i+"="+p);
		sum+=p;
		}
		System.out.println("Sum="+sum);
		avg=sum/N;
		System.out.println("average="+avg);
	}

}
