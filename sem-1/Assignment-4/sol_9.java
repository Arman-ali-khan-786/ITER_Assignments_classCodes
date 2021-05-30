public class sol_9 {
	public static void main(String[] args) {
		int i,sum=0,count=0;
		System.out.println("Multiples of 3 & 5 below 1000 are : ");
		for(i=1;i<1000;i++)
		{
		   if(i%3==0||i%5==0){
		     System.out.print(i+"\t");
			 count++;
			 if(count%10 == 0){
				 System.out.println();
			 }
		     sum+=i;
		   }
		}
		System.out.println();
		System.out.println("\nSum of multiples of 3&5 below 1000 is= "+sum);

	}

}
