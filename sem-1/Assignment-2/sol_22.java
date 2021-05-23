public class sol_22 {
    public static void main(String[] args) {
		double p=Double.parseDouble(args[0]);
	    double r=Double.parseDouble(args[1]);
	    double t=Double.parseDouble(args[2]);
	    double s =p*Math.exp(r*t);
	    System.out.println(s);
	}

}
