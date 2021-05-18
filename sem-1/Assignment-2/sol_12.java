public class sol_12 {
  public static void main(String[] args) {
		
		int N=Integer.parseInt(args[0]);
		int gross= N/144;
	         N= N%144;
		int dz=N/12;
		int r=N%12;
		System.out.println("gross"+"\t"+gross+" dorzen"+"\t"+dz+" remaining egg"+"\t"+r);

	}

}
