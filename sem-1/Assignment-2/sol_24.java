public class sol_24 {
    public static void main(String[] args) {
    double a1=Math.random();
		double a2=Math.random();
		double a3=Math.random();
		double a4=Math.random();
		double a5=Math.random();
		double avg=(a1+a2+a3+a4+a5)/5;
		double max=Math.max(a1, Math.max(a2, Math.max(a3, Math.max(a4, a5))));
		double min=Math.min(a1, Math.min(a2, Math.min(a3, Math.min(a4, a5))));
		System.out.println("Average : " +avg);
		System.out.println("Maximim : " +max);
		System.out.println("Minimum : " +min);

	}

}
