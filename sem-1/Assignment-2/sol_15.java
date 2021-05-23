public class sol_15 {
    public static void main(String[] args) {
    int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int r=a+(int)(Math.random()*(b-a+1));
		System.out.println(r);
    }
}
