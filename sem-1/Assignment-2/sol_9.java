
public class sol_9 {

	public static void main(String[] args) {
		
		double x1= Double.parseDouble(args[0]);
		double y1= Double.parseDouble(args[1]);
		double x2= Double.parseDouble(args[2]);
		double y2= Double.parseDouble(args[3]);
		double d =((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		System.out.println((Math.pow(d,0.5)));
		

	}

}
